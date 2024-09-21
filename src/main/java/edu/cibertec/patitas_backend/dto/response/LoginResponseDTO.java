package edu.cibertec.patitas_backend.dto.response;

public record LoginResponseDTO(
        String httpStatus,
        String message,
        String correo
) {
}
