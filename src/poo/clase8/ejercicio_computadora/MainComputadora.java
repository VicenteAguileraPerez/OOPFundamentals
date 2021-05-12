/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase8.ejercicio_computadora;

/**
 *
 * @author vicen
 */
public class MainComputadora 
{
    public static void main(String[] args) 
    {
        Computadora c1 = new Computadora();
        c1.setColor("plateado");
        c1.setMarca("acer");
        c1.setModelo("ksgakah42");
        c1.setRam(16);
        c1.setSsd(500);
        c1.imprimir();
        c1.imprimir("Vicente");
        
        
        Computadora c2 = new Computadora(32, 1000);
        c2.setColor("plateado");
        c2.setMarca("apple");
        c2.setModelo("applemacbook01");
        c2.imprimir();
        c2.imprimir("Paulina");
        
        Computadora c3 = new Computadora("hp", "hp2001P", "Plateada");
      
        c3.setRam(16);
        c3.setSsd(1000);
        c3.imprimir();
        c3.imprimir("Paulina");
        c3.setColor("Dorado");
        c3.imprimir();
        c3.imprimir("Paulina"); 
    }
    
}
