package za.co.app.autocarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EntityScan(basePackages = "za.co.app.autocarservice.model")
@EnableJpaRepositories(basePackages = "za.co.app.autocarservice.dao")
public class AutoCarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCarServiceApplication.class, args);
	}

}
