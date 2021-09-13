package com.sofkau.crudPerson.controlador;


import com.sofkau.crudPerson.entidades.Persona;
import com.sofkau.crudPerson.reposotorio.InterfazReposotorioPersona;
import com.sofkau.crudPerson.servicios.InterfazServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfazServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @DeleteMapping(value = "/borrarPersona/{id}")
    public void borrarPersona(@PathVariable int id){
        servicio.borrar(id);
    }

    @GetMapping(value = "/listarPersonaPorId/{id}")
    public Persona listarPersonaPorId(@PathVariable int id) throws Exception {
        return servicio.listarId(id);
    }

    @PutMapping(value = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }






}
