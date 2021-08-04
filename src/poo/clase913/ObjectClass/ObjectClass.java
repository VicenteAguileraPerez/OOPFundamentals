/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase913.ObjectClass;

/**
 *
 * @author vicen
 */
public class ObjectClass
{
    public static void main(String[] args) {
        Object a;
        String cadena = "hola";
        a=cadena;
        
        System.out.println(a);
        System.out.println(cadena.equals("hola"));
        
        Integer z=20;
        
        a=z;//.toString();
        
        System.out.println(a instanceof Integer);
        System.out.println(a);
        
        //uso de InstanceOf
        if(cadena instanceof String)
        {
            System.out.println("Soy cadena");
        }
        else
        {
            System.out.println("No soy cadena");
        }
    }
    
}
