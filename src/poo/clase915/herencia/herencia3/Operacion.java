/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia3;

/**
 *
 * @author vicen
 */
public abstract class Operacion 
{
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
    //método abstrato
    public abstract void operar();
    
    public void imprimir()
    {
        System.out.println("Print de la clase Operación");
    }
   
    
    
}
