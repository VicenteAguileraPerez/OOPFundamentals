/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia3;

/**
 *
 * @author vicen
 */
public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("________________SUMA__________________");
        Suma s = new Suma(3, 4);
        s.operar();
        s.imprimir();
        System.out.println("______________________________________");
        System.out.println("");
        
        System.out.println("________________RESTA__________________");
        Resta r = new Resta(3, 4);
        r.operar();
        r.imprimir();
        System.out.println("______________________________________");
        System.out.println("");
        
        System.out.println("_____________MULTIPLICACION___________");
        Multiplicacion m = new Multiplicacion(5, 4);
        m.operar();
        m.imprimir();
        System.out.println("______________________________________");
        System.out.println("");
        
        System.out.println("_____________DIVISION__________________");
        Division d = new Division(8, 4);
        d.operar();
        d.imprimir();
        System.out.println("______________________________________");
        System.out.println("");
        
    }
    
}
