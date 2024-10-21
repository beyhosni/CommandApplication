package org.acme.consumer;
import com.example.orderprocessing.model.Order;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class OrderConsumer {
    @Incoming("orders")
    public void consume(Order order) {
        System.out.println("Commande reçue : " + order);
        // Traitement de la commande (ex: notification client, mise à jour d'inventaire)
    }
}
