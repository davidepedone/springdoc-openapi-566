package it.dpedone.openapi.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Davide Pedone
 * 2020
 */
@Data
@Document(collection = "posts")
public class Post {

    private String id;
    private String author;
    private String content;
    private Long createdAt;

}
