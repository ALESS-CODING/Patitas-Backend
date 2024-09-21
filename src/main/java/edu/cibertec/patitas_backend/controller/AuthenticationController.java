package edu.cibertec.patitas_backend.controller;

import edu.cibertec.patitas_backend.dto.request.LoginRequestDTO;
import edu.cibertec.patitas_backend.dto.response.LoginResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {


    @PostMapping("")
    public ResponseEntity<LoginResponseDTO> authentication (@RequestBody LoginRequestDTO loginRequestDTO){

        return null;
    }

}
