package it.olly.springbootcloudstreamkafkadocker.test.multiconsumers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.function.StreamBridge;

@SpringBootTest
public class TestStringProducer {

    @Autowired
    private StreamBridge streamBridge;

    @Test
    public void doTestProduce() throws Exception {
        streamBridge.send("stringQ", "m:" + System.currentTimeMillis());
        Thread.sleep(1000);
    }

}
