package com.example.ServiceFinal.service;



import com.example.ServiceFinal.model.Registros;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IServiceRegistros {

    public List<Registros> getAll();

    public Registros create(Registros agenda);
}
