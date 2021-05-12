/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase8;


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
       
       System.out.println(MetodoInsStatic.getB());//b=15
       MetodoInsStatic.setB(30);
       System.out.println(MetodoInsStatic.getB());//b=30
       
       insStatic.setA(10);
       System.out.println(insStatic.getA());        
        
       MetodoInsStatic insStatic2 = new MetodoInsStatic(10, 20);
       System.out.println(insStatic2.getA());
        
       insStatic2.setA(50);
       System.out.println(insStatic2.getA());
    }
    
}
