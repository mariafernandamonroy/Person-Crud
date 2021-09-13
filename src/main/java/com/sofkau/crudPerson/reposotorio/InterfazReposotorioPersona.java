package com.sofkau.crudPerson.reposotorio;

import com.sofkau.crudPerson.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfazReposotorioPersona extends CrudRepository<Persona,Integer> {

}
