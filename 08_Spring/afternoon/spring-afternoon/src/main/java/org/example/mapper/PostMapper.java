package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dto.post.PostDto;

import java.util.List;

@Mapper
public interface PostMapper {
    List<PostDto> findAll(); // 내부 실행 코드는 mybatis가 알아서 채워줌

    List<PostDto> findByCondition(
            @Param("title") String title,
            @Param("content") String content
    );

    int delete(@Param("id") Long id);

   int save(
            @Param("title") String title,
            @Param("content") String content
    );


}
