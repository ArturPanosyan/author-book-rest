package am.itspace.authorbookrest.service;

import am.itspace.dto.BookDto;
import am.itspace.dto.BookFilterDto;
import am.itspace.dto.SaveBookDto;

import java.util.List;

public interface BookService {

    BookDto save(SaveBookDto saveBookDto);
    List<BookDto> getAll();

    List<BookDto> getAllByFilter(BookFilterDto bookFilterDto);
}
