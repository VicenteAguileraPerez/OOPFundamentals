/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4;

/**
 *
 * @author vicen
 */
public class Tabla 
{
    private int a;
    private int b;
    private int c;
    
    //constructor
    public Tabla(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void getMostrar()
    {
        for(int i=b;i<=c;i++)
        {
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
    public void getMostrar(int i)
    {
        for(int j=i;j<=a;j++)
        {
            for(int k=b;k<=c;k++)
            {
                System.out.println(j+"*"+k+"="+(j*k));
            }
        }
    }
    
    
}
