/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.single.service;

import org.apereo.cas.CentralAuthenticationService;
import org.apereo.cas.authentication.Authentication;
import org.apereo.cas.ticket.Ticket;
import org.apereo.cas.ticket.TicketGrantingTicket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collection;

/**
 * 登出触发器
 *
 * @author Carl
 * @date 2017/11/29
 */
public class TriggerLogoutService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TriggerLogoutService.class);
    private CentralAuthenticationService service;

    public TriggerLogoutService(CentralAuthenticationService service) {
        this.service = service;
    }

    /**
     * 触发其他用户退出
     *
     * @param id
     *        用户id
     * @param tgt
     *        当前登录的tgt
     */
    public void triggerLogout(String id, String tgt) {
        Collection<Ticket> tickets = this.service.getTickets(ticket -> {
            if (ticket instanceof TicketGrantingTicket) {
                TicketGrantingTicket t = ((TicketGrantingTicket) ticket).getRoot();
                Authentication authentication = t.getAuthentication();
                return t != null && authentication != null
                        && authentication.getPrincipal() != null && id.equals(authentication.getPrincipal().getId())
                        && !tgt.equals(t.getId());
            } else {
                return false;
            }
        });
        if (tickets != null && tickets.size() > 0) {
            LOGGER.info(String.format("[%s]强制强制注销%s", id, tickets.size()));
        }
        for (Ticket ticket : tickets) {
            service.destroyTicketGrantingTicket(ticket.getId());
        }
    }
}
