package app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "app")
public class SpringBootFeatureToggleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeatureToggleApplication.class, args);
	}

}
