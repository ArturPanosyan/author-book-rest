package am.itspace.dto;

import am.itspace.authorbookrest.entity.Gender;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveBookDto {

    @NotEmpty(message = "Description is required")
    private String description;
    private double price;
    @NotEmpty(message = "Title is required")
    @Length(min = 2, message = "Title length should be >= 2")
    private String title;
    private int authorId;

}
