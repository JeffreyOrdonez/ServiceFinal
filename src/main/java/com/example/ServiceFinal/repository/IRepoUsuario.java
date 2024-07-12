package com.example.ServiceFinal.repository;



import com.example.ServiceFinal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoUsuario extends JpaRepository<Usuario,String> {

    @Query("select count(e) from Usuario e " +
            "where e.username = ?1 " +
            "and e.password = ?2")
    int getLogin(String username,String password);

}
