package it.olly.springbootcloudstreamkafkadocker.engine;

import java.util.function.Consumer;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * consumes messages from multiple queues
 * 
 * @author alessio olivieri
 *
 */
@Component("StringMultipleConsumer")
public class StringMultipleConsumer implements Consumer<Message<String>> {

    @Override
    public void accept(Message<String> message) {
        System.out.println("StringMultipleConsumer -> " + message + " - SLEEP");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("StringMultipleConsumer -> " + message + " - DONE");
    }
}
