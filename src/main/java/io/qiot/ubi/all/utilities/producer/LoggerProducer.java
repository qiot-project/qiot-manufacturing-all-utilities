package io.qiot.ubi.all.utilities.producer;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author andreabattaglia
 *
 */
@ApplicationScoped
public class LoggerProducer {

    @Produces
    public Logger getLogger(final InjectionPoint ip) {
        return LoggerFactory
                .getLogger(ip.getMember().getDeclaringClass());
    }
}