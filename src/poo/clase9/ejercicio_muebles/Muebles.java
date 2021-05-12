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
public class Muebles
{
    private String material, pais_origen,color;
    private float precio;

    public Muebles() 
    {
        
    }

    public Muebles(String color)
    {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void getDescripcion()
    {
        
        System.out.println("____________________Descripción__________________________");
        System.out.printf("El mueble hecho en %s \n"
                       + "tiene un color  %s \n"
                       + "es de %s \n"
                       + " y cuesta $ %.2f \n",pais_origen,color,material,precio);
        System.out.println("_________________________________________________________");
    }
    
    
    
    
}
