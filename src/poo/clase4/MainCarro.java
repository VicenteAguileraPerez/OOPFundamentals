/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4;

/**
 *
 * @author vicen
 */
public class MainCarro 
{
    public static void main(String[] args) 
    {
        Carro ford = new Carro();
        float v = ford.calcularVelocidad(100, 2);
        ford.imprimir();
        
        Carro honda = new Carro();
        float v2 = honda.calcularVelocidad(150, 4);
        honda.setMarca("Honda");
        honda.setColor("Azul");
        honda.imprimirConParametros(honda.getMarca(), honda.getColor(), honda.getCantidadPuertas());
        honda.imprimir();
        
        if(v>v2)
        {
            System.out.println("El carro de marca "+ford.getMarca()+" es más rapido que el "+honda.getMarca());
        }
        else
        {
             System.out.println("El carro de marca "+honda.getMarca()+" es más rapido que el "+ford.getMarca());
        }
    }
    
}
