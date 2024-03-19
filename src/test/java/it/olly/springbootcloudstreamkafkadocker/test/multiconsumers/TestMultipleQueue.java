package it.olly.springbootcloudstreamkafkadocker.test.multiconsumers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.function.StreamBridge;

@SpringBootTest
public class TestMultipleQueue {

    @Autowired
    private StreamBridge streamBridge;

    @Test
    public void doTestMultipleQueue() throws Exception {
        System.out.println("----- doTestMultipleQueue() -----");
        for (int i = 0; i < 10; i++) {
            streamBridge.send("stringMultipleQ_1", "m: " + i + " - " + System.currentTimeMillis());
            if (i == 5) {
                streamBridge.send("stringMultipleQ_2", "m: " + i + " - " + System.currentTimeMillis());
            }
        }
        System.out.println("waiting for RETURN");
        System.in.read();
        System.out.println("------------------------------------------");
    }

}
