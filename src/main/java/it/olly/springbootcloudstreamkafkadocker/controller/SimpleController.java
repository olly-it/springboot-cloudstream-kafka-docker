package it.olly.springbootcloudstreamkafkadocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.olly.springbootcloudstreamkafkadocker.model.MyUser;
import it.olly.springbootcloudstreamkafkadocker.model.MyUserPlus;

@RestController
class SimpleController {
	@Autowired
	private StreamBridge streamBridge;

	/**
	 * send a "MyUser" with given id to queue A
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(path = "/send/{id}/A")
	public MyUser sendUserA(@PathVariable("id") Long id) {
		MyUser newUser = new MyUser(id, "Ale_" + id, "GE");
		System.out.println("SimpleController: A->queueA");
		streamBridge.send("queueA", newUser);
		return newUser;
	}

	/**
	 * send a "MyUserPlus" with given id to queue B
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(path = "/send/{id}/B")
	public MyUser sendUserB(@PathVariable("id") Long id) {
		MyUserPlus userPlus = new MyUserPlus(id, "Oli_" + id, "SV");
		System.out.println("SimpleController: B->queueB");
		streamBridge.send("queueB", userPlus);
		return userPlus;
	}

}