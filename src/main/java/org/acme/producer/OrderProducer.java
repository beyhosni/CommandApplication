package org.acme.producer;

import com.example.orderprocessing.model.Order;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.eclipse.kafka.clients.producer.ProducerRecord;

@ApplicationScoped
public class OrderProducer {

    @Outgoing("orders")
    public ProducerRecord<String, Order> sendOrder(Order order) {
        return new ProducerRecord<>("orders", order.getOrderId(), order);
    }
}
