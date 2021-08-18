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
public class Suma  extends Operacion
{

    public Suma(int valor1, int valor2)
    {
        super.valor1 = valor1;
        super.valor2 = valor2;
    }
    
    
    @Override
    public void operar() 
    {
        resultado = valor1 + valor2;
    }

    @Override
    public void imprimir() 
    {
        super.imprimir();
        System.out.println("La suma de "+super.valor1+" + "+super.valor2+" = "+super.resultado);
        
    }
    
    
    
}
