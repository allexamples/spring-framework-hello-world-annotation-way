package org.allexamples.springframework.helloworld.annotationway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	NetworkService getNetworkService() {
		return new Vodafone();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		SmartPhone smartPhone = context.getBean(SmartPhone.class);
		smartPhone.makeCall();
	}

}
