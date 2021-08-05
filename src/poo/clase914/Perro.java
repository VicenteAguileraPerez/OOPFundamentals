/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase914;

/**
 *
 * @author vicen
 */
public class Perro extends Animal
{
    private String color="Negro";
    
    public Perro()
    {
        System.out.println("El color del animal es: ");
        super.printAnimalColor();
    }
    
    public void printPerroColor()
    {
        System.out.println("El color del Animal es: "+super.color);
        System.out.println("El color del perro es: "+color);
    }
    
}
