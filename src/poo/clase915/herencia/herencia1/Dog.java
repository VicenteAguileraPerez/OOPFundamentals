/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia1;

/**
 *
 * @author vicen
 */
public class Dog extends Animal
{
    private String color = "black";

    public Dog() 
    {
        super();//sirve para en herencia llamar al contructor de
        //la clase padre
        System.out.println("Dog is created");
        
    }
    public void printColor()
    {
        System.out.println(color);
        //con super puedo mandar llamar atributos(+public y #protected)
        //de la clase padre
        System.out.println(super.color);   
    }
    public void work()
    {
        //con super también sirve para mandar llamar métodos (+public y #protected)
        //de la clase padre
        super.eat();
    }
    
}
