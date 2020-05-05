package it.dpedone.openapi.hateoas;

import it.dpedone.openapi.entities.Post;
import org.springframework.hateoas.EntityModel;

/**
 * @author Davide Pedone
 * 2020
 */
public class PostResource extends EntityModel<Post> {
    public PostResource(Post post) {
        super(post);
    }
}
