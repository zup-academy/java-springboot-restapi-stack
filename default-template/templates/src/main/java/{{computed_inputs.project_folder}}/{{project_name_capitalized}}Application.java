package {{computed_inputs.project_base_package}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class) // Needed by Zalando Problem lib
public class {{project_name_capitalized}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{project_name_capitalized}}Application.class, args);
	}

}
