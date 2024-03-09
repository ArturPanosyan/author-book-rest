package am.itspace.authorbookrest.service;

import am.itspace.dto.BookDto;
import am.itspace.dto.SaveBookDto;

public interface BookService {

    BookDto save(SaveBookDto saveBookDto);
}
