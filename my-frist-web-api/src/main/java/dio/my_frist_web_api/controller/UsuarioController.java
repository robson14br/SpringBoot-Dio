package dio.my_frist_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.my_frist_web_api.model.Usuario;
import dio.my_frist_web_api.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping ("/users")
    public List<Usuario>getUsers(){
        return repository.findAll();
    }
}
