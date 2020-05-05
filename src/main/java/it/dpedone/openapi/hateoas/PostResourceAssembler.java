package it.dpedone.openapi.hateoas;


import it.dpedone.openapi.entities.Post;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

/**
 * @author Davide Pedone
 * 2020
 */
@Component
public class PostResourceAssembler implements RepresentationModelAssembler<Post, PostResource> {

    @Override
    public PostResource toModel(Post post) {
        return new PostResource(post);
    }

}
