package {{computed_inputs.project_base_package}}.samples.authors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListAuthorsController {

    private final AuthorRespository respository;

    public ListAuthorsController(AuthorRespository respository) {
        this.respository = respository;
    }

    @GetMapping("/api/v1/authors")
    public ResponseEntity<?> listAll() {

        List<Author> authors = respository.findAll();

        return ResponseEntity.ok(
                authors.stream()
                    .map(AuthorResponse::new)
                    .toList()
        );
    }

}
