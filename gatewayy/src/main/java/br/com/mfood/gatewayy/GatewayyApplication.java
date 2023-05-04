package br.com.mfood.gatewayy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayyApplication.class, args);
	}

}
