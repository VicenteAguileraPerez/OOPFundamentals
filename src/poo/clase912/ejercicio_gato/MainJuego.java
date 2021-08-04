/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase912.ejercicio_gato;

import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class MainJuego 
{
    public static void main(String[] args) 
    {
       TicTacToc t = new TicTacToc();
       Scanner entradas = new Scanner(System.in);
       int pos;
       
       do
       {
           System.out.println("Ingresa la posicion: ");
           pos = entradas.nextInt();
           if( t.setValor(pos-1))
           {
               t.cambiarTurno();
           }
           t.imprimirTablero();
       }while(t.checarJuego().equals("null"));
       
       if(t.ganador().equals("fin"))
       {
           System.out.println("Nadie gana, no hay mas posiciones");
       }else
       {
           System.out.println("Gana "+t.ganador());
       }
       
    }
    
}
