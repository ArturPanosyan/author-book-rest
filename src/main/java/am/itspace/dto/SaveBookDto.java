package am.itspace.dto;

import am.itspace.authorbookrest.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveBookDto {

    private String name;
    private String description;
    private Double price;
    private String title;
    private Integer authorId;
}
