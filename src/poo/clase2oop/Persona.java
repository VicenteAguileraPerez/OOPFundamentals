/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase2oop;

/**
 *
 * @author vicen
 */
public class Persona 
{
    private String nombre;
    private String apellido;
    private byte edad;
    //private int currentYear;
    
    public void imprimir()
    {
        System.out.printf("%s %s y tu edad es %d \n",nombre,apellido,edad);
    }
    public void imprimirConParametros(String nombre, String apellido,byte edad)
    {
        System.out.printf("%s %s y tu edad es %d \n",nombre,apellido,edad);
    }
    public int calcularYearNacimiento(int currentYear)
    {
        //int nNacimiento = currentYear-edad;
        return currentYear-edad;
    }
    
    //Metodos getter (Obtener valores) 
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public byte getEdad()
    {
        return edad;
    }
    //setter(asignar valores) son void
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    public void setEdad(byte edad)
    {
        this.edad=edad;
    }
    
    
}
