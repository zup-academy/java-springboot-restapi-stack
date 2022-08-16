package br.com.zup.edu.app2.samples;

import br.com.zup.edu.app2.Application;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrlPattern;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc(printOnlyOnFailure = false)
class NewAuthorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private AuthorRespository repository;

    @BeforeEach
    public void setUp() {
        repository.deleteAll();
    }

    /**
     * Tip: Try always to begin with the happy-path scenario
     */
    @Test
    @DisplayName("should create a new author")
    public void t1() throws Exception {
        // scenario
        NewAuthorRequest request = new NewAuthorRequest(
                "Rafael Ponte",
                "rafael.ponte@zup.com.br",
                LocalDate.now().minusYears(38)
        );

        // action (and validation)
        mockMvc.perform(post("/api/v1/authors")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request)))
                .andExpect(status().isCreated())
                .andExpect(redirectedUrlPattern("**/api/v1/authors/*"))
        ;

        // validation
        // Tip: Try always to verify the side effects
        assertEquals(1, repository.count());
    }

    @Test
    @DisplayName("should not create a new author when parameters are empty")
    public void t2() throws Exception {
        // scenario
        NewAuthorRequest request = new NewAuthorRequest("", "", null);

        // action (and validation)
        mockMvc.perform(post("/api/v1/authors")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request)))
                .andExpect(status().isBadRequest())
        ;

        // validation
        assertEquals(0, repository.count());
        // TODO: assert message errors
    }

    @Test
    @DisplayName("should not create a new author when parameters are invalid")
    public void t3() throws Exception {
        // scenario
        NewAuthorRequest request = new NewAuthorRequest(
                "a".repeat(121),
                "b".repeat(61),
                LocalDate.now().plusDays(1));

        // action (and validation)
        mockMvc.perform(post("/api/v1/authors")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request)))
                .andExpect(status().isBadRequest())
        ;

        // validation
        assertEquals(0, repository.count());
        // TODO: assert message errors
    }

    @Test
    @DisplayName("should not create a new author when he is underage")
    public void t4() throws Exception {
        // scenario
        NewAuthorRequest request = new NewAuthorRequest(
                "Jordi",
                "jordi.silva@zup.com.br",
                LocalDate.now().minusYears(17));

        // action (and validation)
        mockMvc.perform(post("/api/v1/authors")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request)))
                .andExpect(status().isBadRequest())
                .andExpect(status().reason("author is underage"))
        ;

        // validation
        assertEquals(0, repository.count());
    }

    private String toJson(Object payload) throws JsonProcessingException {
        return mapper.writeValueAsString(payload);
    }

}