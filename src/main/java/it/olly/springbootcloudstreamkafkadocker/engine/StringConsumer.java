package it.olly.springbootcloudstreamkafkadocker.engine;

import java.util.function.Consumer;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * consumes messages from queue B
 * 
 * @author alessio olivieri
 *
 */
@Component("StringConsumer")
public class StringConsumer implements Consumer<Message<String>> {

    @Override
    public void accept(Message<String> message) {
        System.out.println("StringConsumer -> " + message + " - SLEEP");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("StringConsumer -> " + message + " - DONE");
    }
}
