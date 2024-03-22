package am.itspace.authorbookrest.service;

import am.itspace.dto.AuthorResponseDto;
import am.itspace.dto.PagingResponseDto;
import am.itspace.dto.SaveAuthorDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService {
    AuthorResponseDto create(SaveAuthorDto author);

    PagingResponseDto getAll(Pageable pageable);

    AuthorResponseDto getById(int id);

    AuthorResponseDto update(int id, SaveAuthorDto author);

    void deleteById(int id);

}
