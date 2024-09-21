package edu.cibertec.patitas_backend.controller.dto.request;

public record LoginRequestDTO(
        Integer tipoDocumento,
        String numeroDocumento,
        String password
) {
}
