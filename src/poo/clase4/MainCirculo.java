/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4;

import poo.clase3.*;

/**
 *
 * @author vicen
 */
public class MainCirculo 
{
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.nom+" "+circulo.getRadio());
        double area = circulo.getArea();
        System.out.println("El area del circulo es "+area);     
        
        circulo.setRadio(5);
        area = circulo.getArea();
        System.out.println("El area del circulo es "+area);
        
        Circulo circulo2 = new Circulo();
        circulo2.setRadio(5);
        double area2 = circulo2.getArea();
        System.out.println("El area del circulo es "+area2);
        
        
        Circulo circulo3 = new Circulo(200,"hola");
        //circulo2.setRadio(5);
        double area3 = circulo3.getArea();
        System.out.println("El area del circulo es "+area3+" y el nombre es "+circulo3.nom);
        
    }
    
}
