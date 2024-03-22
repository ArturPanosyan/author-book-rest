package am.itspace.authorbookrest.mapper;

import am.itspace.authorbookrest.entity.Author;
import am.itspace.authorbookrest.entity.Book;
import am.itspace.dto.AuthorResponseDto;
import am.itspace.dto.BookDto;
import am.itspace.dto.SaveAuthorDto;
import am.itspace.dto.SaveBookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = AuthorMapper.class)
public interface BookMapper {
@Mapping(target = "authorResponseDto", source = "author")
    BookDto map(Book book);
    Book map(SaveBookDto saveBookDto);

    List<BookDto> map(List<Book> books);
}
