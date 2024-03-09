package am.itspace.authorbookrest.mapper;

import am.itspace.authorbookrest.entity.Author;
import am.itspace.authorbookrest.entity.Book;
import am.itspace.dto.AuthorResponseDto;
import am.itspace.dto.BookDto;
import am.itspace.dto.SaveAuthorDto;
import am.itspace.dto.SaveBookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto map(Book book);
    Book map(SaveBookDto saveBookDto);
}
