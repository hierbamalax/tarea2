package ec.webmarket.restful.dto.v1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private String nombre;
    private String apellido;
    private String cedula;
}
