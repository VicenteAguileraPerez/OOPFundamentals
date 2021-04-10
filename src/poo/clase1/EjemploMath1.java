/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase1;

import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class EjemploMath1 
{
    public static void main(String args[])
    {
        //permite que el usuario introduzca valores
        Scanner input = new Scanner(System.in);
        
        //guarde los valores introducidos por consola
        /*String nombre = input.next();//Vicente
        int peso = input.nextInt();//80
        double altura = input.nextDouble();//1.75
        //imprime los valores
        System.out.println("Hola, "+nombre+" tu peso es: "+peso+" tu altura es: "+altura);
        */
        
        //-b-sqrt(b^2 -4*a*c)/2a=x1
        //-b+sqrt(b^2 -4*a*c)/2a=x2
        //a!=0
        //b^2 -4*a*c>=0 
        float a,b,c,x1,x2;
        System.out.println("Introduce a: ");
        a = input.nextFloat();
        System.out.println("Introduce b: ");
        b = input.nextFloat();
        System.out.println("Introduce c: ");
        c = input.nextFloat();
        System.out.println(Math.sin(45*Math.PI/180));
        /**
         *   PIRAD = 180
         *     X  =  45  
         */
        if(a!=0)
        {
            //      double      =  double        - float 
            //  cambiar TD de la variable destino
            // casting cast casteo REFUDICION
            // 1. encerrar entre() lo que quiero castear
            // 2. ver el tipo de dato destino 
            // 3. (tipo de dato destino) del lado izq de la exp a castear
            float discriminante = (float)(Math.pow(b, 2)-4*a*c);
            if(discriminante>=0)
            {
            
                // double  = float + double
                x1=(float)((-b+Math.sqrt(discriminante))/(2*a));
                /**
                 * ()
                 *  pot
                 *  raices ok
                 *  * /  %
                 *  + -
                 * 
                 */
            
                x2=((float)  (-b-Math.sqrt(discriminante)))/(2*a);
                
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
            else
            {
                //imaginarias
                System.out.println("No se continua porque da imaginarios");
            }
        }
        else
        {
            System.out.println("A es 0 ERROR");
        }
        //int potencia  = (int) (Math.pow(2, 8));//256
        
        
    }
}
