/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase913.ambitos.SystemClass;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


/**
 *
 * @author vicen
 */
public class SystemClass 
{
    public static void main(String[] args) {
        
        //Clase objeto out(Static)
        
        PrintStream ps = System.out;
        
        ps.println("hola mundo");
        
        //Clase PrintStream(out) metodo
        System.out.println("");
        
        
        InputStream is = System.in;
        Scanner s = new Scanner(is);
        
        ps.println("Ingresa un numero");
        float a = s.nextFloat();
        
        ps.printf("El valor de el \"floatante\" es: %.2f  \n", a);
        
        //comodines de formato para printf()
        //%f->float o double
        //%s-> Strings
        //%c-> char
        //%d->byte short int long
        
        //secuencias de escape
        /**
         *  \n salto de linea
         *  \t tabulacion
         *  \b backspace
         *  \\s space expresiones regulares o .split("\\s")
         *  \\ diaglonal invertida
         *  \" comillas dentro de textos
         *  \\. colocar un punto en expresiones regulares o .split(\\.) hola.mundo.como.estas.split("\\.")
         */
        
        SystemClass sc = new SystemClass();
        sc = null;
        System.out.println("Recogedor de basura");
        System.gc();
        System.exit(0);
        
    }

    public void finalize() 
    {
        System.out.println("Objeto eliminado de la memoria");    
    }
    
    
}
