package com.example.ServiceFinal.service;

import org.springframework.stereotype.Service;

@Service
public interface IServiceUsuario {

    int getLogin(String username, String password);
}
