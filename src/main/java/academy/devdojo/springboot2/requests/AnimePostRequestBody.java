package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {

    @NotEmpty(message = "The anime name cannot be empty")
//    @NotNull(message = "The anime name cannot be null") // a validacao acima ja faz isso tbm
    private String name;

}
