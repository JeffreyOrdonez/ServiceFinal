package com.example.ServiceFinal.repository;




import com.example.ServiceFinal.model.Registros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRepoRegistros extends JpaRepository<Registros, UUID> {


}