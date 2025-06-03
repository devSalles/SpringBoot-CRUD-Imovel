package ImovelCRUD.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ImovelDTO(
        @NotBlank String logradouro,
        @NotBlank String numero,
        @NotBlank String bairro,
        @NotBlank String cep,
        @NotBlank String regiao,
        @NotBlank String cidade,
        @NotBlank String estado,
        String complemento,
        @NotBlank String tipo,
        @NotNull Double valor,
        @NotBlank String disponibilidade
){}