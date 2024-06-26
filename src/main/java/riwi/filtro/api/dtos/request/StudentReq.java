package riwi.filtro.api.dtos.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentReq {
    @NotBlank(message = "El nombre del estudiante es requerido.")
    @Size(max = 255, message = "El nombre del estudiante no debe exceder los 255 caracteres.")
    private String name;

    @Email(message = "El email del estudiante debe ser válido [example@example.com]")
    @NotBlank(message = "El email del estudiante es requerido.")
    @Size( max = 255, message = "La longitud del email no debe exceder los 255 caracteres.")
    private String email;

    @NotNull(message = "El estado del estudiante es requerido.")
    private Boolean active;

    @NotNull(message = "El id del estudiante es requerido.")
    private Long class_id;    
}
