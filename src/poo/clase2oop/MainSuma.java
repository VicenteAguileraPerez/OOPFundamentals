/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase2oop;

import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class MainSuma 
{
    public static void main(String args[])
    {
        //instancias, crear , ejemplarizar
        //Scanner teclado = new Scanner(System.in);
        //Clase obje = new Clase();
        
        Suma ObjetoA = new Suma();//constructor por defecto
        ObjetoA.num1=10;
        ObjetoA.num2=10;
        
        Suma ObjetoB = new Suma();
        ObjetoB.num1=10;
        ObjetoB.num2=20;
        
        int resA = ObjetoA.sumar();
        int resB = ObjetoB.sumar();
        
        System.out.println(resA);
        System.out.println(resB);
        
        ObjetoB.num1=100;
        
        
        ObjetoA.imprimir();//20
        ObjetoB.imprimir();//120
        
        //ObjetoB.resultado=50000;
        //System.out.println(ObjetoA.resultado);//20
        //System.out.println(ObjetoB.resultado);//30
        
    }
    
}
