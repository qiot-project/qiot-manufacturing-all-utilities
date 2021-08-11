package io.qiot.manufacturing.commons.util.producer;


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