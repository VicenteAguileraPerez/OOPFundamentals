/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase3;

//directiva import
import poo.clase2oop.Persona;
/**
 *
 * @author vicen
 */
public class Triangulo 
{
   // Atributos de clase  private static String nom;
    
   //Atributos instancia (Private) Protected Public
   private int base;
   private int altura;
   private float area;
   private float perimetro;
   public String cad;
   
   //constructor por defecto
   //dar un estado inicial a las variables
   public Triangulo()
   {
       base=1000;
       altura=0;
       area=0;
       perimetro=0;
      
      
   }
   //metodo 
   public float calcularArea()
   {
       area=base*altura/2;
       return area;
   }
   
   public void imprimir()
   {
       System.out.println("El triangulo tiene una altura de "+ altura
               +" cm  y una base de "+base+" cm y el area es "+area
               +"cm^2 y su perimetro es "+perimetro+" cm");
   }
   public int getBase()
   {
       return base;
   }
   public void setBase(int base)
   {
       this.base=base;
   }
   public int getAltura()
   {
       return altura;
   }
   public void setAltura(int altura)
   {
       this.altura=altura;
   }
   public float calcularPerimetro(float lado1, float lado2, float lado3)
   {
       perimetro=lado1+lado2+lado3;
       return perimetro;
   }
   
   
   
    
    
}
