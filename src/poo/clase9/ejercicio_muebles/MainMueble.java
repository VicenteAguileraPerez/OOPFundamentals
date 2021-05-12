/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase9.ejercicio_muebles;

/**
 *
 * @author vicen
 */
public class MainMueble 
{
    public static void main(String[] args) 
    {
        Muebles mesa = new Muebles();
        mesa.setColor("café");
        mesa.setPais_origen("Nepal");
        mesa.setPrecio(10500.35f);
        mesa.setMaterial("madera de pino");
        mesa.getDescripcion();
        
        Muebles silla = new Muebles();
        mesa.setColor("café");
        mesa.setPais_origen("España");
        mesa.setPrecio(5002.59f);
        mesa.setMaterial("roble");
        mesa.getDescripcion();
      
        
    }
    
}
