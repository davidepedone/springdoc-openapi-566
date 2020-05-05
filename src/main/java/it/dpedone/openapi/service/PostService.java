package it.dpedone.openapi.service;

import it.dpedone.openapi.entities.Post;
import it.dpedone.openapi.hateoas.PostResource;
import it.dpedone.openapi.hateoas.PostResourceAssembler;
import it.dpedone.openapi.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Service;

/**
 * @author Davide Pedone
 * 2020
 */
@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;
    private final PagedResourcesAssembler<Post> pagedResourcesAssembler;
    private final PostResourceAssembler postResourceAssembler;

    public PagedModel<PostResource> getAll(Pageable pageable) {
        Page<Post> postPage = postRepository.findAll(pageable);
        return pagedResourcesAssembler.toModel(postPage, postResourceAssembler);
    }

}
