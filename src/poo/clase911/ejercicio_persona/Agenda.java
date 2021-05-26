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
public class Agenda {

    public static int id = 1;

    public static void main(String[] args) {
        //CRUD-> CREATE READ UPDATE DELETE
        // int arr [] = new int[10];
        //ArrayList<> aar = new ArrayList<>();
        ArrayList<Persona> agendaPersonas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int busquedaId;
        do {
            System.out.println("_______________Agenda_______________");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Actualizar");
            System.out.println("4. Ver Todos");
            System.out.println("5. Eliminar todos");
            System.out.println("6. Salir");
            System.out.println("Ingresa una opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar");
                    System.out.println("Introduce Nombre: ");
                    String nombre = entrada.next();
                    System.out.println("Introduce Edad: ");
                    int edad = entrada.nextInt();
                    int id = Agenda.id;
                    Agenda.id++;
                    Persona p = new Persona(id, edad, nombre);
                    agendaPersonas.add(p);
                    break;
                case 2:
                    System.out.println("Eliminar una persona");
                    if (agendaPersonas.size() != 0) {
                        System.out.println("Introduce el id de la persona a eliminar");
                        busquedaId = entrada.nextInt();
                        boolean isDeleted = false;
                        for (int posicion = 0; posicion < agendaPersonas.size(); posicion++) {
                            if (busquedaId == agendaPersonas.get(posicion).getId()) {
                                agendaPersonas.remove(posicion);
                                isDeleted = true;
                                break;
                            }
                        }
                        /*if(isDeleted)
                        {
                            System.out.println("Persona eliminada");
                        }
                        else
                        {
                            System.out.println("No hay registros con ese ID");
                        }*/
                        //Operador condicional ternario ?:
                        //String x = (Condicion)?"es verdad":"es mentira";
                        //System.out.println((Condicion)?"es verdad":"es mentira");
                        System.out.println((isDeleted) ? "Persona eliminada" : "No hay registros con ese ID");
                    } else {
                        System.out.println("Antes de eliminar, debes agregar mínimo una persona");
                    }
                    break;
                case 3:
                    System.out.println("Actualizar");
                    if (agendaPersonas.size() != 0) {
                        System.out.println("Introduce el id de la persona a actualizar");
                        busquedaId = entrada.nextInt();
                        boolean wasFound = false;
                        for (int posicion = 0; posicion < agendaPersonas.size(); posicion++) {
                            if (busquedaId == agendaPersonas.get(posicion).getId()) {
                                busquedaId = posicion;
                                wasFound = true;
                                break;
                            }
                        }
                        if (wasFound) 
                        {
                            //actualizar
                            Persona pActualizar = agendaPersonas.get(busquedaId);
                            System.out.println("Introduce Nombre: ");
                            String nuevoNombre = entrada.next();
                            System.out.println("Introduce Edad: ");
                            int nuevaEdad = entrada.nextInt();
                            pActualizar.setNombre(nuevoNombre);
                            pActualizar.setEdad(nuevaEdad);
                            System.out.println("Elemento actualizado");
                        } else {
                            System.out.println("No existe persona con ese ID");
                        }
                    } else {
                        System.out.println("Antes de actualizar, debes agregar mínimo una persona");
                    }
                    break;
                case 4:
                    if (agendaPersonas.size() != 0) {
                        System.out.println("Ver Todos");
                        for (int i = 0; i < agendaPersonas.size(); i++) {
                            System.out.println("______________________________________");
                            Persona personaObtenida = agendaPersonas.get(i);
                            System.out.println("Nombre: " + personaObtenida.getNombre());
                            System.out.println("Edad: " + personaObtenida.getEdad());
                            System.out.println("Id: " + personaObtenida.getId());

                        }
                    } else {
                        System.out.println("Antes de ver registros, debes agregar mínimo una persona");
                    }
                    break;
                case 5:
                    if (!agendaPersonas.isEmpty()) {
                        System.out.println("Eliminar Todo");
                        int opc;
                        do {
                            System.out.println("Estás seguro de eliminar toda la agenda?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println("Selecciona opción:");
                            opc = entrada.nextInt();
                            if (opc != 1 && opc != 2) {
                                System.out.println("Opción no valida!");
                            }
                        } while (opc != 1 && opc != 2);

                        if (opc == 1) {
                            agendaPersonas.removeAll(agendaPersonas);
                            System.out.println("Agenda limpia!");
                        }
                    } else {
                        System.out.println("Antes de vaciar la agenda, debes agregar mínimo una persona");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 6);

    }

}
