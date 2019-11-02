package test.kcm.spring.springcloud.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer//this enable a Spring Security filter that authenticates requests via an incoming OAuth2 token
@EnableDiscoveryClient//till spring to register and discover this service in Registry Service.
@EnableGlobalMethodSecurity//enables Spring Security global method security
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

}
