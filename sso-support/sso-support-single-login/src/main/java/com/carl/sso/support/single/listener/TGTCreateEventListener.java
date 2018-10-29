/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.single.listener;

import com.carl.sso.support.single.service.IUserIdObtainService;
import com.carl.sso.support.single.service.TriggerLogoutService;
import org.apereo.cas.support.events.ticket.CasTicketGrantingTicketCreatedEvent;
import org.apereo.cas.ticket.TicketGrantingTicket;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 识别事件然后删除
 *
 * @author Carl
 * @version 创建时间：2017/11/29
 */
public class TGTCreateEventListener {
    private TriggerLogoutService logoutService;
    private IUserIdObtainService service;

    public TGTCreateEventListener(@NotNull TriggerLogoutService logoutService, @NotNull IUserIdObtainService service) {
        this.logoutService = logoutService;
        this.service = service;
    }

    @EventListener
    @Async
    public void onTgtCreateEvent(CasTicketGrantingTicketCreatedEvent event) {
        TicketGrantingTicket ticketGrantingTicket = event.getTicketGrantingTicket();
        String id = ticketGrantingTicket.getAuthentication().getPrincipal().getId();
        String tgt = ticketGrantingTicket.getId();
        String clientName = (String) ticketGrantingTicket.getAuthentication().getAttributes().get("clientName");
        //获取可以认证的id
        List<String> authIds = service.obtain(clientName, id);
        if (authIds != null) {
            //循环触发登出
            authIds.forEach(authId -> logoutService.triggerLogout(authId, tgt));
        }
    }
}
