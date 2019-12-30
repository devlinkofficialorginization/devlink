package info.devlink.devlinkapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCircuitBreaker
public class DevlinkApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevlinkApigatewayApplication.class, args);
	}

}
