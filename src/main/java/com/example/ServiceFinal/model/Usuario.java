package com.example.ServiceFinal.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Usuario extends IdentifiedId{

    private String username;

    private String password;

}
