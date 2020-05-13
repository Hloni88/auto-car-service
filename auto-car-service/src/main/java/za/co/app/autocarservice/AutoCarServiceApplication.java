package za.co.app.autocarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AutoCarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCarServiceApplication.class, args);
	}

}
