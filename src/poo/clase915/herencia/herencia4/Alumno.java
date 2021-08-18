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
public class Alumno extends Persona
{
    private int numerDeLista;
    private int grado;
    
    public Alumno(String nombre, int edad, String numerTelefonico,
            int numerDeLista, int grado) {
        super(nombre, edad, numerTelefonico);
        this.grado=grado;
        this.numerDeLista = numerDeLista;
    }
    
    @Override
    public void imprimir()
    {
        System.out.println("El alumno se llama "+super.getNombre());
        System.out.println("El alumno tiene una edad de: "+super.getEdad());
        System.out.println("El alumno va en "+this.grado+" grado");
        System.out.println("El núm de lista del alumno es: "+this.numerDeLista);
        System.out.println("El tel del alumno es: "+super.getNumeroTelefónico());
    }

    /*
    @Override
    public void setNumeroTelefonico(String numeroTelefonico) 
    {
        System.out.println("Hola como estas "+numeroTelefonico);
    }*/
    
    public void estudiar()
    {
        System.out.println("El alumno está estudiando....");
    }
}
