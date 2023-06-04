package com.proyecto.SistemaBoletos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.SistemaBoletos.Modelo.Rol;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Integer> {
   
   
}
