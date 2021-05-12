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
public class MetodoInsStatic
{
    //atributo de instancia
    private int a;
    private int c;
    
    //atributo de clase(STATIC)
    private static int b;
    
    static
    {
        b=15;
    }
    public MetodoInsStatic()
    {
        System.out.println("Ese es un construtor por defecto");
        this.a=10;
     
    }

    public MetodoInsStatic(int a) {
        this.a = a;
        this.c=0;
    }

    public MetodoInsStatic(int a, int c)
    {
        System.out.println("Constructor sobrecargado int int");
        this.a = a;
        this.c = c;
    }
    public MetodoInsStatic(int c, float a) {
        this.a = (int)a;
        this.c = c;
    }
    

    
    
    //metodo instancia
    public void setA(int a)
    {
        this.a  = a +MetodoInsStatic.b+MetodoInsStatic.getB();
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
