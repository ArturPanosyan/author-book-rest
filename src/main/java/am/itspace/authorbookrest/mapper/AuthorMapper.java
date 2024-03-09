package am.itspace.authorbookrest.mapper;

import am.itspace.authorbookrest.entity.Author;
import am.itspace.dto.AuthorResponseDto;
import am.itspace.dto.SaveAuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorResponseDto map(Author author);

    @Mapping(target = "createdDate", expression = "java(java.time.LocalDate.now())")


    Author map(SaveAuthorDto saveAuthorDto);
}
