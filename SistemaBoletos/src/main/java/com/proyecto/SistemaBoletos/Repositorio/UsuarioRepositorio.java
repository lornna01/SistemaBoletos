package com.proyecto.SistemaBoletos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.SistemaBoletos.Modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    
}
