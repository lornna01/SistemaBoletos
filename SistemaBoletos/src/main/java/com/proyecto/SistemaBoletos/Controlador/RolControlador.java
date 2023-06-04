package com.proyecto.SistemaBoletos.Controlador;

import java.util.List;
import com.proyecto.SistemaBoletos.SistemaBoletosApplication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.SistemaBoletos.Modelo.Rol;
import com.proyecto.SistemaBoletos.Repositorio.RolRepositorio;

@RestController
@RequestMapping("/App/Roles")
@CrossOrigin(origins = "*")

public class RolControlador {
    
    @Autowired
    private RolRepositorio repositorio;

    @GetMapping("/listarRol")
    public List<Rol> listarTodoSlosRoles() {
        return repositorio.findAll();
    }

    @PostMapping("/guardarRol")
    public Rol guardarRol(@RequestBody Rol rol) {
        return repositorio.save(rol);
    }

    @PutMapping("/actualizarRol/{id}")
    public Rol actualizarRol(@PathVariable int id, @RequestBody Rol rolActualizado) {
        Rol rol = repositorio.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No existe el ROL con el id:" + id));
        rol.setNombre_rol(rolActualizado.getNombre_rol());

        Rol rolActual = repositorio.save(rol);
        return rolActual;
    }

    @DeleteMapping("/eliminarRol/{id}")
    public String eliminarRol(@PathVariable int id) {
        Rol rol = repositorio.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No existe el ROL con el id: " + id));
        repositorio.delete(rol);
        return "ROL eliminado con el id: " + id + " nombre: " + rol.getNombre_rol();

    }




}
