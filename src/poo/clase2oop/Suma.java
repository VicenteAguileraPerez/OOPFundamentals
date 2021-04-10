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
public class Suma 
{
    //Atributos, campos, características, datos
    public int num1;
    public int num2;
    private int resultado;
    
    //metodos (funciones, procedimientos), acciones, comportamientos
    
    /**
     * Esta función suma dos valores y retorna el resultado
     * @return la suma de dos numeros 
     */
    public int sumar()     
    { 
       //todo lo que quiero que haga esa función 
       resultado= num1+num2;
       return resultado;
    }
    /**
     * Este procedimiento imprime un textoo con el resultado de la suma
     */
    public void imprimir()
    {
        System.out.printf("La suma de %d y %d es %d \n",num1,num2,sumar());
    }
    
    
}
