package edu.cibertec.patitas_backend.interfaces;

import edu.cibertec.patitas_backend.dto.request.LoginRequestDTO;

import java.io.IOException;
import java.util.List;

public interface AuthenticationInterface {

    List<String> validarUsuario (LoginRequestDTO loginRequestDTO) throws IOException;
}
