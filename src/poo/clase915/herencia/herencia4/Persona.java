/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia4;

/**
 *
 * @author vicen
 */
public abstract class Persona 
{
    private String nombre;
    private int edad;
    private String numeroTelefonico;

    public Persona(String nombre, int edad, String numeroTelefonico) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroTelefonico = numeroTelefonico;
    }

    public final String getNombre() {
        return nombre;
    }

    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final int getEdad() {
        return edad;
    }

    public final void setEdad(int edad) {
        this.edad = edad;
    }

    public final String getNumeroTelefónico() {
        return numeroTelefonico;
    }

    public final void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
   
    //método abstracto
    public abstract void imprimir();
    
    
    
}
