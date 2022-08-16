package br.com.zup.edu.app2.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class NewAuthorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewAuthorController.class);

    private final AuthorRespository respository;

    public NewAuthorController(AuthorRespository respository) {
        this.respository = respository;
    }

    @PostMapping("/api/v1/authors")
    public ResponseEntity<?> create(@RequestBody @Valid NewAuthorRequest request, UriComponentsBuilder uriBuidler) {

        // Tip: As you can see, we do NOT need any object mapper to convert the payload to an entity
        Author author = request.toModel();
        LOGGER.info(
            "A new author has been created = {}", author
        );

        // Tip: Execute your business logic here, right after validating and converting your
        // request's payload, like persisting an entity into database or sending an event to a broker
        respository.save(author);

        URI location = uriBuidler.path("/api/v1/authors/{id}")
                            .buildAndExpand(author.getId())
                            .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }

}
