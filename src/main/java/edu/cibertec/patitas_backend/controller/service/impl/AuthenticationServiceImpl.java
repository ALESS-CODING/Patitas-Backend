package edu.cibertec.patitas_backend.controller.service.impl;

import edu.cibertec.patitas_backend.controller.dto.request.LoginRequestDTO;
import edu.cibertec.patitas_backend.controller.interfaces.AuthenticationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationInterface {

    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public List<String> validarUsuario(LoginRequestDTO loginRequestDTO) {

        List<String> datosUsuario = null;
        Resource resource = resourceLoader.getResource("classpath:usuario.txt");
        try ( BufferedReader reader = new BufferedReader( new FileReader(resource.getFile()))){
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (loginRequestDTO.tipoDocumento().equals(datos[0]) &&
                        loginRequestDTO.numeroDocumento().equals(datos[1]) &&
                        loginRequestDTO.password().equals(datos[2])) {
                    datosUsuario = new ArrayList<>();
                    datosUsuario = List.of(datos[3], datos[4]);
                }
            }

        } catch (IOException ex){
            System.out.println("Error :" + ex.getMessage());
        }
        return datosUsuario;
    }
}
