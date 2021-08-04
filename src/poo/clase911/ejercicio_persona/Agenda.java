/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase911.ejercicio_persona;

import java.util.ArrayList;

/**
 *
 * @author vicen
 */
public class Agenda {

    /**
     * .size()-> cantidad de elementos en el arraylist 
     * .add(E)-> agrega elementos de tipo E al final del arraylist 
     * .get(posicion)-> E retorna el elemento de tipo E en la posición dada. 0>= posicion < size()
     * .remove(posicion)-> elimina el elemento de tipo E en la posición dada. 0>= posicion < size()
     * .removeAll(lista)-> true si se elimino todo, sino false 
     * .isEmpty()-> true si la lista es vacia, sino false !milista.isEmpty()-> true si no es
     * vacia, sino false .set(posicion, E) -> agrega elemento de tipo E en la posicion dada. 0>= posicion < size()
     */
    private ArrayList<Persona> personas;
    
    public Agenda()
    {
        personas = new ArrayList<>();
    }
    public String agregar(int id, String nombre,String telefono,int edad)
    {
        Persona nuevaPersona = new Persona(id, edad, nombre, telefono);
       /* if(personas.add(nuevaPersona))
        {
            return "Persona agregada a la agenda";
        }
        else
        {
            return "Error al agregar a la agenda";
        }*/
        
        return personas.add(nuevaPersona)?"Persona agregada a la agenda":"Error al agregar a la agenda";
    }
    public String eliminar(int id)
    {
        if(personas.isEmpty())
        {
          return "Para realizar esta operación, debes primero agregar elementos";
        }
        for (int pos = 0; pos < personas.size() ; pos++) 
        {
            Persona personaObtenida = personas.get(pos);
            if(personaObtenida.getId()==id)
            {
                return personas.remove(pos)==null?"Error al eliminar de la agenda":"Persona eliminada de la agenda"; 
            }
        }
        return "No existe registro con ese ID";
    }
    public String actualizar(int id, String nombre,String telefono,int edad)
    {
        if(personas.isEmpty())
        {
          return "Para realizar esta operación, debes primero agregar elementos";
        }
        //actualizacion
        for (int pos = 0; pos < personas.size() ; pos++) 
        {
            Persona personaObtenida = personas.get(pos);
            if(personaObtenida.getId()==id)
            {
               Persona personaActualizada = new Persona(id, edad, nombre, telefono);
               return personas.set(pos, personaActualizada)==null?"Error al actualizar en la agenda":"Persona actualizada en la agenda";
            }
        }
        return "No existe registro con ese ID";
    }
    public void verTodo()
    {
        if(personas.isEmpty())
        {
            System.out.println("Para realizar esta operación, debes primero agregar elementos");
        }
        else
        {
            System.out.println("--------------------Lista Personas---------------------");
            for (int pos = 0; pos < personas.size() ; pos++) 
            {
                Persona personaObtenida = personas.get(pos);

                System.out.println("Id: "+personaObtenida.getId());
                System.out.println("Nombre: "+personaObtenida.getNombre());
                System.out.println("Teléfono: "+personaObtenida.getTelefono());
                System.out.println("Edad: "+personaObtenida.getEdad());
                System.out.println("-----------------------------------------");  
            }
        } 
    }
    public String eliminarTodo()
    {
        if(personas.isEmpty())
        {
          return "Para realizar esta operación, debes primero agregar elementos";
        }
        //limpie o elimine todo
        personas.clear();
        return "Agenda limpia";
    }
    public int contar()
    {
        return personas.size();
    }
}