package com.example.ServiceFinal.service;



import com.example.ServiceFinal.repository.IRepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario implements IServiceUsuario {

    @Autowired
    private IRepoUsuario repoUsuario;
    @Override
    public int getLogin(String username, String password) {
        return repoUsuario.getLogin(username,password);
    }
}
