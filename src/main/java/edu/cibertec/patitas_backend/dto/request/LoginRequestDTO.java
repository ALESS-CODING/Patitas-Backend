package edu.cibertec.patitas_backend.dto.request;

public record LoginRequestDTO(
        String tipoDocumento,
        String numeroDocumento,
        String password
) {
}
