package am.itspace.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    private Integer id;
    private String description;
    private Double price;
    private String title;
    private AuthorResponseDto authorResponseDto;
}
