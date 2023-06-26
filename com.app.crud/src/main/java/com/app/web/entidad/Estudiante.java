package com.app.web.entidad;

import jakarta.persistence.*;

@Entity
@Table(name="estudiante")
public class Estudiante {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long id ;

    @Column (name = "nombres",nullable = false,length = 50)
    private String nombre;

    @Column (name = "apellidos",nullable = false,length = 50)
    private String apellido;
    @Column (name = "email",nullable = false,length = 50,unique = true)
    private String email;

    public Estudiante (){

    }

    public Estudiante(long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Estudiante( String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
