package com.example.ServiceFinal.controller;



import com.example.ServiceFinal.model.Usuario;
import com.example.ServiceFinal.repository.IRepoUsuario;
import com.example.ServiceFinal.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class ControllerUsuario {

    @Autowired
    private IServiceUsuario serviceUsuario;

    @Autowired
    private IRepoUsuario repoUsuario;

    @GetMapping("/login")
    public Integer getLogin(@RequestParam("username") String username,
                                           @RequestParam("password") String password) {
        return serviceUsuario.getLogin(username,password);
    }

    @GetMapping("/all")
    public List<Usuario> getAll() {
        return repoUsuario.findAll();
    }
    @PostMapping("/create")
    public void create(@RequestBody Usuario usuario) {
        repoUsuario.save(usuario);
    }
}
