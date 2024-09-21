package edu.cibertec.patitas_backend.controller.interfaces;

import edu.cibertec.patitas_backend.controller.dto.request.LoginRequestDTO;

import java.io.IOException;
import java.util.List;

public interface AuthenticationInterface {

    List<String> validarUsuario (LoginRequestDTO loginRequestDTO) throws IOException;
}
