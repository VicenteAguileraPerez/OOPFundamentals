/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase911.ejercicio_persona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class Agenda 
{
    public static int id =1;
    public static void main(String[] args)
    {
        //CRUD-> CREATE READ UPDATE DELETE
        // int arr [] = new int[10];
        //ArrayList<> aar = new ArrayList<>();
        ArrayList<Persona> agendaPersonas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 1;
        switch(opcion)
        {
            case 1:
                System.out.println("Agregar");
                String nombre = entrada.next();
                int edad = entrada.nextInt();
                int id = Agenda.id;
                Agenda.id++;
                Persona p = new Persona(id, edad, nombre);
                agendaPersonas.add(p);
                
//                id = Agenda.id;
//                Agenda.id++;
//                Persona p2 = new Persona(id, 22, "Juanito");
//                agendaPersonas.add(p2);
//                
//                id = Agenda.id;
//                Agenda.id++;
//                Persona p3 = new Persona(id, 18, "Paloma");
//                agendaPersonas.add(p3);
                
                
//                for(int i=0;i<agendaPersonas.size();i++)
//                {
//                    System.out.println("______________________________________");
//                    Persona personaObtenida = agendaPersonas.get(i);
//                    System.out.println("Nombre: "+personaObtenida.getNombre());
//                    System.out.println("Edad: "+personaObtenida.getEdad());
//                    System.out.println("Id: "+personaObtenida.getId());
//                    System.out.println("______________________________________");
//                    
//                }
                break;
            case 2:
                System.out.println("Eliminar");
                break;   
            case 3:
                System.out.println("Actualizar");
                break;
            case 4:
                System.out.println("Ver Todos");
                for(int i=0;i<agendaPersonas.size();i++)
                {
                    System.out.println("______________________________________");
                    Persona personaObtenida = agendaPersonas.get(i);
                    System.out.println("Nombre: "+personaObtenida.getNombre());
                    System.out.println("Edad: "+personaObtenida.getEdad());
                    System.out.println("Id: "+personaObtenida.getId());
                    
                }
                break; 
            case 5:
                System.out.println("Eliminar Todo");
                break; 
            default:
                System.out.println("Opción no válida");
                break;
        }
        
        
        
    }
    
}
