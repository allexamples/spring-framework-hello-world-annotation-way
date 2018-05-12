package org.allexamples.springframework.helloworld.annotationway;

public class Vodafone implements NetworkService {

	@Override
	public String getNetwork() {
		return "Vodafone 4G";
	}

}
