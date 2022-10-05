package {{computed_inputs.project_base_package}};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class {{project_name_capitalized}}ApplicationTests {

  @Test
  void contextLoads() {
  }

}