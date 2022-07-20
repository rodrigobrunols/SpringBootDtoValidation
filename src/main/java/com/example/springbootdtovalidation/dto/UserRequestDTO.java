package com.example.springbootdtovalidation.dto;


import lombok.*;

import javax.validation.constraints.*;

@Data
@Builder
public class UserRequestDTO {

    @NotBlank(message = "Nome Inválido : Nome não pode ser vazio!")
    @NotNull(message = "Nome Inválido : Nome não pode ser NULL!")
    @Size(min = 3, max = 50, message = " Nome Inválido : Nome deve ter entre 3 e 50 caractéres!")
    String name;

    @Email(message = "Email inválido!")
    String email;

    @NotBlank(message = "Telefone Inválido : Telefone não pode ser vazio!")
    @NotNull(message = "Telefone Inválido : Telefone não pode ser NULL!")
            @Pattern(regexp = "^\\d{10}$" , message = "")
    String mobile;

    @Min(value = 3, message = "Idade Inválida : Idade mínima permitida 3 anos!")
            @Max(value = 120, message = "Idade Inválida : Idade máxima permitida 120 anos!")
    Integer age;

}
