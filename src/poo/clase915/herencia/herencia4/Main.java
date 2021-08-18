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
public class Main
{
    public static void main(String[] args) 
    {
        
       
        //Creamos una instancia del alumno;
        Alumno vicente = new Alumno("Vicente Aguilera", 22, "4520000000", 2, 9);
        vicente.imprimir();
        vicente.estudiar();
        vicente.setNumeroTelefonico("12368");
        System.out.println("\n\n\n");
        //Crear una instancia de profesor
        ArrayList<String> materias = new ArrayList<>();
        materias.add("Fundamentos de Programación");
        materias.add("Programación Orientada a Objetos");
        materias.add("Fundamentos de Bases de Datos");
        materias.add("Administración de Bases de Datos");
        Maestro miguel = new Maestro("Juan Miguel Andrade", 35, "4521230000", materias, 15000);
        miguel.imprimir();
    }
    
}
