package org.example.dto.post;

import lombok.RequiredArgsConstructor;
import org.example.mapper.PostMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //스프링빈에 저장소로 등록하는 것
@RequiredArgsConstructor//final이 붙은 애만 생성자 만들어줌
public class PostRepository {
    private final PostMapper postMapper;

    public List<PostDto> findAll() {
        return postMapper.findAll();
    }

    public List<PostDto> findByCondition(String title, String content) {
        return postMapper.findByCondition(title, content);
    }
}
