package it.dpedone.openapi.repositories;

import it.dpedone.openapi.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Davide Pedone
 * 2020
 */
public interface PostRepository extends MongoRepository<Post, String> {
}
