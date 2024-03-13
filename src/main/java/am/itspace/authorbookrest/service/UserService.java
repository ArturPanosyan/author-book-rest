package am.itspace.authorbookrest.service;


import am.itspace.authorbookrest.entity.User;
import am.itspace.dto.CreateUserRequestDto;
import am.itspace.dto.UserDto;

public interface UserService {

    UserDto create(CreateUserRequestDto createUserRequestDto);

    User findByEmail(String email);
}
