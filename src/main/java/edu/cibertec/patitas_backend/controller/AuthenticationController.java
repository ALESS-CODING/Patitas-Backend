package edu.cibertec.patitas_backend.controller;

import edu.cibertec.patitas_backend.dto.request.LoginRequestDTO;
import edu.cibertec.patitas_backend.dto.response.LoginResponseDTO;
import edu.cibertec.patitas_backend.interfaces.AuthenticationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationInterface authenticationService;

    @PostMapping("")
    public ResponseEntity<LoginResponseDTO> authentication (@RequestBody LoginRequestDTO loginRequestDTO){
        try {
            List<String> datos = authenticationService.validarUsuario(loginRequestDTO);
            if(datos != null){
                LoginResponseDTO login = new LoginResponseDTO("00", datos.get(0), datos.get(1));
                return ResponseEntity.status(HttpStatus.OK).body(login);
            }
            return ResponseEntity.status(HttpStatus.OK).body(new LoginResponseDTO("01", "Error: usuario no existe", ""));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
