package am.itspace.authorbookrest.mapper;

import am.itspace.authorbookrest.entity.Author;
import am.itspace.authorbookrest.dto.AuthorResponseDto;
import am.itspace.authorbookrest.dto.SaveAuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorResponseDto map(Author author);

    @Mapping(target = "createdDate", expression = "java(java.time.LocalDate.now())")


    Author map(SaveAuthorDto saveAuthorDto);
}
