/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia5;

/**
 *
 * @author vicen
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Bike bike = new Honda4();//downcasting
        bike.run();
        System.out.println(bike instanceof Bike);
    }
    
}
