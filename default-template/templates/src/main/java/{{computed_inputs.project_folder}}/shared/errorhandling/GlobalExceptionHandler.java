package {{computed_inputs.project_base_package}}.shared.errorhandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.server.ResponseStatusException;
import org.zalando.problem.ProblemBuilder;
import org.zalando.problem.StatusType;
import org.zalando.problem.spring.web.advice.ProblemHandling;

import java.net.URI;

/**
 * Prints a better detail message
 * TODO: https://github.com/zalando/problem-spring-web#stack-traces-and-causal-chains
 */
@ControllerAdvice
public class GlobalExceptionHandler implements ProblemHandling {

    @Override
    public ProblemBuilder prepare(Throwable throwable, StatusType status, URI type) {
        ProblemBuilder builder = ProblemHandling.super.prepare(throwable, status, type);
        if (throwable instanceof ResponseStatusException exception) {
            return builder
                    .withDetail(exception.getReason()); // it's better than exception.getMessage()
        }
        return builder;
    }

}
