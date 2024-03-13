package am.itspace.authorbookrest.mapper;

import am.itspace.authorbookrest.entity.User;
import am.itspace.dto.CreateUserRequestDto;
import am.itspace.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {


    UserDto map(User user);

    @Mapping(target = "userRole", constant = "USER")
    User map(CreateUserRequestDto createUserRequestDto);

}