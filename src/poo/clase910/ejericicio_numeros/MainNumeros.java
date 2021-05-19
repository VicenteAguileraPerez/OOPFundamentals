/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase910.ejericicio_numeros;

/**
 *
 * @author vicen
 */
public class MainNumeros 
{
    public static void main(String[] args)
    {
        Numeros obj1 = new Numeros();
        obj1.setABC(10, 3, 12);
        obj1.setNombre("obj1");
        obj1.getNumeroMayor();
        obj1.getTabla();
        System.out.println("La potencia del objeto "+obj1.getNombre()+" es: "+obj1.getPotencia());
        
        Numeros obj2 = new Numeros(10,-5,13);
        obj2.setNombre("obj2");
        obj2.getNumeroMayor();
        obj2.getTabla();
        
        System.out.println("La potencia  "+obj2.getNombre()+" es: "+obj2.getPotencia()+"  "+obj2.getRaizCuadrada());
        
    }
    
}
