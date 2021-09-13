# CRUD methods Person class
An exercise was performed where CRUD methods were implemented for persistent data. For this purpose, a class named *Persona*  was created with the attributes: id, name and age and the setters and getters methods.
It was used MySQL database. The services were created and followed by its endpoints access:

- Save person, http://localhost:8080/api/guardarPersona
- Delete person by id, http://localhost:8080/api/borrarPersona/**id**
- Get list of persons, http://localhost:8080/api/listarPersonas
- Get person by id and, http://localhost:8080/api/listarPersonaPorId/**id**
- Update person, http://localhost:8080/api/actualizarPersona

For this case was employed Java language version 11 and Maven for proyect creation.

