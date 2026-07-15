package org.example.apis.model;

import jakarta.persistence.Entity;

//aca dejamos el nombre de la tabla
//@Entity
//@Table(name = "personas")
public class personaModel {

    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;

    public personaModel(){

    }


    public personaModel(int idPersona, String nombre, String apellido, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
