package org.example.repository.book.mybatis;

import lombok.RequiredArgsConstructor;
import org.example.domain.book.BookMybatis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {
    private final BookMapper bookMapper;

//    @Autowired
//    public BookRepository(BookMapper bookMapper) {
//        this.bookMapper = bookMapper;
//    }

    public List<BookMybatis> findAll() {
        return bookMapper.findAll();
    }

    public BookMybatis findById(Long id) {
        return bookMapper.findById(id);
    }

    public int save(BookMybatis newbook) {
        return bookMapper.save(newbook);
    }

    public int delete(Long id) {
        return bookMapper.delete(id);
    }

}
//
