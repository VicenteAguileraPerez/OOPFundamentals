/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase3;

import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class MainTriangulo
{
    public static void main(String[] args) 
    {
        //Clase objeto = new Class();
        Triangulo trian1 = new Triangulo();
        Triangulo trian2 = new Triangulo(); 
        
        System.out.println(trian1.cad);
        Scanner teclado  = new Scanner(System.in);
        int base, altura;
        float area,perimetro;
        System.out.println("Introduce la altura");
        altura=teclado.nextInt();
        System.out.println("Introduce la base");
        base=teclado.nextInt();
        
        //T1
        System.out.println("Esta es la referencia a memoria RAM de "+trian1);
        trian1.setAltura(altura);
        trian1.setBase(base);
        area = trian1.calcularArea();
        perimetro = trian1.calcularPerimetro(5, 5, 5);
        trian1.imprimir();
        System.out.println("El area de T1 es "+area);
        System.out.println("El perimetro T1 es "+perimetro);
        
        //T2
        System.out.println("Esta es la referencia a memoria RAM de "+trian2);
        trian2.setAltura(altura);
        trian2.setBase(base);
        trian2.calcularArea();
        trian2.calcularPerimetro(5, 5, 5);
        trian2.imprimir();
        
        
        System.out.println(trian1==trian2);
             
        
        
        
        
        
        
    }
    
}
