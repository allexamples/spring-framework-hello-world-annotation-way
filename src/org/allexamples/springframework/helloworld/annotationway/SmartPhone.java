package org.allexamples.springframework.helloworld.annotationway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartPhone {

	final private NetworkService networkService;

	@Autowired
	public SmartPhone(NetworkService networkService) {
		this.networkService = networkService;
	}

	public void makeCall() {
		String network = networkService.getNetwork();
		System.out.println("Making call using " + network);
	}

}
