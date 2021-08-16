package it.olly.springbootcloudstreamkafkadocker.engine;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import it.olly.springbootcloudstreamkafkadocker.model.MyUser;
import it.olly.springbootcloudstreamkafkadocker.model.MyUserPlus;

/**
 * consumes messages from queue A and re-send it to queue B (adding info "A
 * processed")
 * 
 * @author alessio olivieri
 *
 */
@Component("AProcessor")
public class AProcessor implements Function<MyUser, MyUserPlus> {

	@Override
	public MyUserPlus apply(MyUser user) {
		System.out.println("AProcessor -> got message: " + user);
		MyUserPlus myUserPlus = new MyUserPlus(user.id, user.name, user.city, "already processed by A");
		System.out.println("AProcessor -> returns modified message: " + myUserPlus);
		return myUserPlus;
	}
}