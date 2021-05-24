/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase911.ejercicio_persona;

/**
 *
 * @author vicen
 */
public class Persona 
{
    private int id;
    private int edad;
    private String nombre;

    public Persona(int id, int edad, String nombre) 
    {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
