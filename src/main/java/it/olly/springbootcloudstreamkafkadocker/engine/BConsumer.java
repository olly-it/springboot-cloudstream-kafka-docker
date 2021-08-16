package it.olly.springbootcloudstreamkafkadocker.engine;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import it.olly.springbootcloudstreamkafkadocker.model.MyUserPlus;

/**
 * consumes messages from queue B
 * 
 * @author alessio olivieri
 *
 */
@Component("BConsumer")
public class BConsumer implements Consumer<MyUserPlus> {

	@Override
	public void accept(MyUserPlus user) {
		System.out.println("BConsumer -> " + user);
	}
}
