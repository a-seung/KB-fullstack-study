package org.example.dto.post;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter,setter 만들어줌
@AllArgsConstructor //생성자 만들어줌
public class PostDto {
    private int id;
    private String title;
    private String content;
}
