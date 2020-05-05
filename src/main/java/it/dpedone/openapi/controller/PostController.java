package it.dpedone.openapi.controller;

import it.dpedone.openapi.hateoas.PostResource;
import it.dpedone.openapi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Davide Pedone
 * 2020
 */
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<PagedModel<PostResource>> getAll(Pageable pageable) {
        return new ResponseEntity<>(postService.getAll(pageable), HttpStatus.OK);
    }
}
