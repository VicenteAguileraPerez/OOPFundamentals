/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase1;

/**
 *
 * @author vicen
 */
public class EjemploString2 
{
    public static void main(String[] args) {
        //Vicente 22 Ing.   
        //Vicente 22 Ing.  
        //Vicente 22 Ing.  
        //Vicente 22 Ing.  
        //Vicente 22 Ing.  
        //Vicente 22 Ing.  
        
        
        String texto ="Hola mundo esto es un texto";
        String texto2 ="Hola mundo esto es un textO";
        System.out.println(texto.length());
        System.out.println(texto.charAt(5));//m
        System.out.println(texto.equals(texto2));//false
        System.out.println(texto.equalsIgnoreCase(texto2));//true
        System.out.println(texto.substring(5));//mundo esto es un texto
        System.out.println(texto.substring(5,12));//mundo e
        System.out.println(texto.startsWith("Hola"));//true
        System.out.println(texto2.endsWith("o"));//false
        System.out.println(texto2.contains("es"));//true
        System.out.println(texto2.concat("o"));//Hola mundo esto es un textOo
        System.out.println(texto2+"o");//Hola mundo esto es un textOo
        System.out.println(texto2.isEmpty());//false
        System.out.println(texto2.toLowerCase());//minusculas
        System.out.println(texto2.toUpperCase());//mayus
         
    }
    
}
