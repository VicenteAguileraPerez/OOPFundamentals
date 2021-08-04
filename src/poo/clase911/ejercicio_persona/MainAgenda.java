/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase911.ejercicio_persona;

import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class MainAgenda 
{
    private static int id;
    private Scanner entradas;
    private Agenda agenda;
    
    static
    {
       id=1;
    }
    
    public MainAgenda()
    {
        entradas = new Scanner(System.in);
        agenda = new Agenda();
    }
    public void menu()
    {
        opciones();
        int opc = entradas.nextInt();
        
        switch(opc)
        {
            case 1:
                agregar();
                menu();
                break;
            case 2:
                actualizar();
                menu();
                break;
            case 3:
                eliminar();
                menu();
                break;
            case 4:
                vaciar();
                menu();
                break;
            case 5:
                verTodo();
                menu();
                break;
            case 6:
                contarRegistro();
                menu();
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                menu();
                break;
        }
        
    }
    private void opciones()
    {
        System.out.println("______________Agenda______________");
        System.out.println("_           1. Agregar           _");
        System.out.println("_           2. Actualizar        _");
        System.out.println("_           3. Eliminar          _");
        System.out.println("_           4. Vaciar agenda     _");
        System.out.println("_           5. Ver registros     _");
        System.out.println("_    6. Cantidad de registros    _");
        System.out.println("_           7. Salir             _");
        System.out.println("__________________________________");
        System.out.println("_ Selecciona una opción:         _");
    }
    private void agregar()
    {
        int edad;
        String telefono;
        String nombre;
        System.out.println("_        Agregar a la Agenda          _");
        System.out.println("Ingresa el nombre:");
        nombre = entradas.next();
        System.out.println("Ingresa el telefono:");
        telefono = entradas.next();
        System.out.println("Ingresa la edad:");
        edad = entradas.nextInt();
        String mensaje = agenda.agregar(id, nombre, telefono, edad);
        id++;
        System.out.println(mensaje);
    }
    private void actualizar()
    {
        int id;
        int edad;
        String telefono;
        String nombre;
        System.out.println("_        Actualizar la Agenda          _");
        System.out.println("Ingresa el nombre:");
        nombre = entradas.next();
        System.out.println("Ingresa el telefono:");
        telefono = entradas.next();
        System.out.println("Ingresa la edad:");
        edad = entradas.nextInt();
        System.out.println("Ingresa el id:");
        id = entradas.nextInt();
        String mensaje = agenda.actualizar(id, nombre, telefono, edad);
        System.out.println(mensaje);
    }
    private void eliminar()
    {
        int id;
        System.out.println("_        Eliminar de la Agenda          _");
        System.out.println("Ingresa el id:");
        id = entradas.nextInt();
        String mensaje = agenda.eliminar(id);
        System.out.println(mensaje);
        
    }
    private void vaciar()
    {
        System.out.println("_        Vaciar Agenda          _");
        String mensaje = agenda.eliminarTodo();
        System.out.println(mensaje);
    }
    private void verTodo()
    {
        agenda.verTodo();
    }
    private void contarRegistro()
    {
        System.out.println("La cantidad de personas registradas es: "+agenda.contar());
    }
    
    
    
}

/**
 * System.out.println("______________Agenda______________");
        System.out.println("_           1. Agregar           _");
        System.out.println("_           2. Actualizar        _");
        System.out.println("_           3. Eliminar          _");
        System.out.println("_           4. Vaciar agenda     _");
        System.out.println("_           5. Ver registros     _");
        System.out.println("_    6. Cantidad de registros    _");
        System.out.println("_           7. Salir             _");
        System.out.println("__________________________________");
        System.out.println("_ Selecciona una opción:         _");

 */