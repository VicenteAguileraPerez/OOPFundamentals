/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6;

/**
 *
 * @author vicen
 */
public class EjemploMain
{
    public static void main(String argumentos[])
    {
        System.out.println("Este es el default main");
        for(int i=0;i<argumentos.length;i++)
        {
            System.out.println("Valor es: "+argumentos[i]);
        }
        main(10);
        main(argumentos[0], 22);
    }
    public static void main(int num)
    {
        System.out.println("La potencia de "+num+" al cuadrado es: "+Math.pow(num, 2));
    }
    public static void main(String nombre, int edad)
    {
        System.out.println("Hola"+nombre+" tienes una edad de "+edad+" años");
    }
    
}
