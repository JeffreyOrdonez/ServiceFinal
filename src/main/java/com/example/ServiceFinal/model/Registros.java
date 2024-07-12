package com.example.ServiceFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Data

public class Registros extends IdentifiedId{

    private String nombreColegio;

    private String director;

    private String numeroDirector;

    private String email;

    private String departamento;

    private String municipio;

    private TIPO_HORARIO tipoHorario;

    private TIPO_COLEGIO tipoColegio;
    private LocalDate fecha;
    private LocalTime hora;
    private TIPO_ESTADO estadoCita;
    private int estudiantesInteresados;
    private int estudiantesGraduados;
    private int porcentajeExito;


}
