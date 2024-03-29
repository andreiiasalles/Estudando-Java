package br.com.alura.Springbootadm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdmApplication.class, args);
	}

}
