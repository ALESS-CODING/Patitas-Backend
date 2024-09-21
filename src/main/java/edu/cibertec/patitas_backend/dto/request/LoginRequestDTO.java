package edu.cibertec.patitas_backend.dto.request;

public record LoginRequestDTO(
        Integer tipoDocumento,
        String numeroDocumento,
        String password
) {
}
