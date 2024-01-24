package org.grunskii.rendering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RenderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenderingApplication.class, args);
	}

}
