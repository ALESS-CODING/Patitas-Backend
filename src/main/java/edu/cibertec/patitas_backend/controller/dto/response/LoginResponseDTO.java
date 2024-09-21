package edu.cibertec.patitas_backend.controller.dto.response;

public record LoginResponseDTO(
        String httpStatus,
        String message,
        String correo
) {
}
