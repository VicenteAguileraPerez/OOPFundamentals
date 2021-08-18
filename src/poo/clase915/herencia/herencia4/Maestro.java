/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia4;

import java.util.ArrayList;

/**
 *
 * @author vicen
 */
public class Maestro extends Persona
{
    private ArrayList<String> materia;
    private double salario;

    public Maestro(String nombre, int edad, String numeroTelefonico,
            ArrayList<String> materia, double salario)
    {
        super(nombre, edad, numeroTelefonico);
        this.materia=materia;
        this.salario=salario;
        
    }
    
    @Override
    public void imprimir()
    {
        System.out.println("El profesor se llama "+super.getNombre());
        System.out.println("El profesor tiene una edad de: "+super.getEdad());
        System.out.println("El profesor gana "+this.salario+" pesos");
        System.out.println("El tel del maestro es: "+super.getNumeroTelefónico());
        System.out.println("Las materias que da el profesor son:");
        for(int i=0;i<materia.size();i++)
        {
            System.out.println((i+1)+"-"+materia.get(i));
        }
    }
    
}
