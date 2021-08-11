package io.qiot.manufacturing.commons.util.producer;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * @author andreabattaglia
 *
 */
@ApplicationScoped
public class ProductLineReplyToQueueNameProducer {

    @ConfigProperty(name = "qiot.productline.request.replyto-queue-prefix", defaultValue = "none")
    String replyToQueuePrefix;

    public String getReplyToQueueName(String machineryId) {
        return replyToQueuePrefix + "." + machineryId;
    }
}
