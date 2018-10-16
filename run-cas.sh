#!/bin/bash
export JAVA_HOME=/opt/jre-home
export PATH=$PATH:$JAVA_HOME/bin:.
exec java -jar /usr/local/service/sso-config/target/sso-config.jar &
sleep 1m
exec java -jar /usr/local/service/sso-server/target/cas.war

java -jar /Users/luck/ws/git/sso/sso-config/target/sso-config.jar
java -jar /Users/luck/ws/git/sso/sso-server/target/cas.war
