package com.sofkau.crudPerson.servicios;

import com.sofkau.crudPerson.entidades.Persona;

import java.util.List;

public interface InterfazServiciosPersona {

    public List<Persona>listar();
    public Persona listarId(int id) throws Exception;
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);

}
