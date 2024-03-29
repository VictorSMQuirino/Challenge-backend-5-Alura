package challenge.alura.api.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record DadosCadastroVideos(
        Long categoriaId,
        @NotBlank
        String titulo,
        @NotBlank
        String descricao,
        @NotBlank @URL
        String url) {
}
