package it.olly.springbootcloudstreamkafkadocker.test.multiconsumers;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import it.olly.springbootcloudstreamkafkadocker.SpringbootCloudstreamKafkaDockerApplication;

//@SpringBootTest
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

@SpringBootTest(classes = SpringbootCloudstreamKafkaDockerApplication.class)
// @Import({ TestChannelBinderConfiguration.class })
@Component("TestEngineConsumer")
public class TestEngineConsumer implements Consumer<String> {

    @Override
    public void accept(String str) {
        System.out.println("TestEngineConsumer -> " + str);
    }

    @Test
    public void doTest() throws Exception {
        System.out.println("*** waiting for return");
        System.in.read();
        System.out.println("*** test done");
    }
}
