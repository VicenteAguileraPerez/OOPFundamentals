/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia2;

/**
 *
 * @author vicen
 */
public class Main 
{
    public static void main(String[] args)
    {
        Employee e = new Employee(1, "Vicente", 1500);
        e.display();
        
        Person p = e;//downcasting
        System.out.println(p.getId());
        System.out.println(p.getName());
        
        Person p2 = new Person(2, "Paulina");
        System.out.println(p2.getId());
        System.out.println(p2.getName());
        
        
    }
    
}
