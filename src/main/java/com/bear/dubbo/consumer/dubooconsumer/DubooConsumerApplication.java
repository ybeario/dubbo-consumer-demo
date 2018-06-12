package com.bear.dubbo.consumer.dubooconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com")
@ImportResource(value = {"classpath:consumers.xml"})
public class DubooConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubooConsumerApplication.class, args);
	}
}
