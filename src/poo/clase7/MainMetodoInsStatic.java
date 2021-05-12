/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase7;

/**
 *
 * @author vicen
 */
public class MainMetodoInsStatic
{
    public static void main(String[] args)
    {
       MetodoInsStatic insStatic = new MetodoInsStatic();
       insStatic.setA(10);
       System.out.println(insStatic.getA());
       
       MetodoInsStatic.setB(30);
       System.out.println(MetodoInsStatic.getB());
       
       insStatic.setA(10);
       System.out.println(insStatic.getA());        
        
       MetodoInsStatic insStatic2 = new MetodoInsStatic();
       insStatic2.setA(10);
       System.out.println(insStatic2.getA());
    }
    
}
