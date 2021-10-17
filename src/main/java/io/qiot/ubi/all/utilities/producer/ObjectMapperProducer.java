package io.qiot.ubi.all.utilities.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * @author andreabattaglia
 *
 */
@ApplicationScoped
public class ObjectMapperProducer {

    private final ObjectMapper MAPPER;

    public ObjectMapperProducer() {
        MAPPER = new ObjectMapper();
        // PolymorphicTypeValidator ptv =
        // BasicPolymorphicTypeValidator.builder()
        // .allowIfBaseType(AbstractTelemetry.class).build();
        // MAPPER.activateDefaultTyping(ptv,
        // ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        MAPPER.registerModule(new JavaTimeModule());
    }

    @Produces
    public ObjectMapper getLogger(final InjectionPoint ip) {
        return MAPPER;
    }
}