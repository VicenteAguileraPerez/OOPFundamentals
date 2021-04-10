/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase2oop;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author vicen
 */
public class MainPersona
{
    public static void main(String[] args)
    {
        //CLASS OBJ = new CLASS();
       
        Persona vicente = new Persona();//instancia de la clase Persona llamada Vicente con constructor por default
        //vicente.nombre="Vicente";
        //vicente.apellido="Aguilera Pérez";
        //vicente.edad=22;
        //vicente.currentYear=Calendar.getInstance().get(Calendar.YEAR);
        
        vicente.setNombre("Vicente");
        vicente.setApellido("Aguilera");
        vicente.setEdad((byte)22);
        
        
        int year = Calendar.getInstance().get(Calendar.YEAR);
        vicente.imprimir();
        int nacimiento = vicente.calcularYearNacimiento(year);
        System.out.println("Naciste en el año: "+nacimiento);
        vicente.imprimirConParametros(vicente.getNombre(), vicente.getApellido(), vicente.getEdad());
        
        
    }
    
}
