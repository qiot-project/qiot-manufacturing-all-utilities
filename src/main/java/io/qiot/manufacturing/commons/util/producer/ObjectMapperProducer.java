package io.qiot.manufacturing.commons.util.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author andreabattaglia
 *
 */
@ApplicationScoped
public class ObjectMapperProducer {

    private final ObjectMapper MAPPER;

    public ObjectMapperProducer() {
        MAPPER = new ObjectMapper();
//        PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder()
//                .allowIfBaseType(AbstractTelemetry.class).build();
//        MAPPER.activateDefaultTyping(ptv,
//                ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
//        MAPPER.registerModule(new JavaTimeModule());
    }

    @Produces
    public ObjectMapper getLogger(final InjectionPoint ip) {
        return MAPPER;
    }
}