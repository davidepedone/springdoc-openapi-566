package it.dpedone.openapi.config;

import com.github.javafaker.Faker;
import it.dpedone.openapi.entities.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @author Davide Pedone
 * 2020
 */
@Configuration
@RequiredArgsConstructor
public class DatabaseConfig {

    private final MongoOperations mongoOperations;

    @PostConstruct
    private void postConstruct() {
        Faker faker = new Faker();
        for (int i = 0; i < 33; i++) {
            Post post = new Post();
            post.setAuthor(faker.name().fullName());
            post.setContent(faker.lorem().paragraph());
            post.setCreatedAt(faker.date().past(365, TimeUnit.DAYS).getTime());
            mongoOperations.save(post);
        }
    }
}
