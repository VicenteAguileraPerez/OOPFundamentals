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
public class MetodoInsStatic
{
    //atributo de instancia
    private int a=10;
    
    //atributo de clase(STATIC)
    private static int b;
    
   
    //metodo instancia
    public void setA(int a)
    {
        this.a=a+MetodoInsStatic.b+MetodoInsStatic.getB();
    }
    public int getA()
    {
        return this.a;
    }
    
    //metodo clase (STATIC)
    //
    public static void setB(int b)
    {
        MetodoInsStatic.b=b;
    }
    //metodo clase (STATIC)
    public static int getB()
    {
        return MetodoInsStatic.b;
    }
    
    
    
}
