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
public class Adder
{
    private int a,b,c;

    public Adder() 
    {
        this.a=0;
        this.b=0;
        this.c=0;
    }

    public Adder(int a, int b, int c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int add(int a, int b)
    {
        System.out.println("int int");
        return a+b;
    }
    public int add(double a, float b)
    {
        System.out.println("double double ");
        return (int)(a+b);
    }
    public double add(long a, double b)
    {
        System.out.println("long  double");
        return a+b;
    }
     public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    
    
    
}
