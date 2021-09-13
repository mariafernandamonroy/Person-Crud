package com.sofkau.crudPerson.servicios;

import com.sofkau.crudPerson.entidades.Persona;
import com.sofkau.crudPerson.reposotorio.InterfazReposotorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioPersona implements  InterfazServiciosPersona{

    @Autowired
    private InterfazReposotorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        Optional<Persona> optional = data.findById(id);
        return optional.get();
    }

    @Override
    public Persona guardar(Persona persona) {
        Optional<Persona> optional = data.findById(persona.getId());
        if(optional.isEmpty()) {
            data.save(persona);
        }
        return persona;
    }

    @Override
    public void borrar(int id) {
        data.deleteById(id);
    }

    @Override
    public Persona actualizar(Persona persona) {
        Optional<Persona> optional = data.findById(persona.getId());
        if(optional.isEmpty()) {
            Persona personaAux = optional.get();
            personaAux.setId(persona.getId());
            personaAux.setNombre(persona.getNombre());
            personaAux.setEdad(persona.getEdad());
        }
        return data.save(persona);
    }
}
