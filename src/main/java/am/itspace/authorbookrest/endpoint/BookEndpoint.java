package am.itspace.authorbookrest.endpoint;

import am.itspace.authorbookrest.service.BookService;
import am.itspace.dto.BookDto;
import am.itspace.dto.BookFilterDto;
import am.itspace.dto.SaveBookDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/books")
public class BookEndpoint {

    private final BookService bookService;

    @PostMapping()
    public BookDto create(@Valid @RequestBody SaveBookDto saveBookDto) {
        return bookService.save(saveBookDto);
    }

    @GetMapping
    public List<BookDto> getAll() {
        return bookService.getAll();
    }

    @PostMapping("/filter")
    public List<BookDto> getAllByFilter(@RequestBody BookFilterDto bookFilterDto) {
        return bookService.getAllByFilter(bookFilterDto);
    }


}