package com.stackspot.springboot.samples.authors;

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

    @PostMapping("/api/v1/authors")
    public ResponseEntity<?> create(@RequestBody @Valid NewAuthorRequest request, UriComponentsBuilder uriBuidler) {

        Author author = request.toModel();
        LOGGER.info(
            "A new author has been created = {}", author
        );

        // Tip: Execute your business logic here, right after validating your request's payload,
        // like persisting this entity into database or sending an event to a broker
        persist(author);

        URI location = uriBuidler.path("/api/v1/authors/{id}")
                            .buildAndExpand(author.getId())
                            .toUri();

        return ResponseEntity
                .created(location)
                .body(new NewAuthorResponse(author));
    }

    private void persist(Author author) {
        LOGGER.info(
            "Persisting a new author into database..."
        );
    }
}
