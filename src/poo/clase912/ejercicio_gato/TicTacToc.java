/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase912.ejercicio_gato;

/**
 *
 * @author vicen
 */
public class TicTacToc 
{
    private String turno;
    public  String[] tablero;
    private String ganador;

    public TicTacToc() 
    {
        turno="X";
        tablero = new String[9];
        ganador = "null";
        for (int i = 0; i < 9; i++)
        {
            tablero[i]= String.valueOf(i+1);
        }
        System.out.println("Bienvenido a TicTacToc 3*3");
        //imprimir el tablero
        imprimirTablero();
        
    }
    public String checarJuego()
    {
        //filas
        if(tablero[0].equals(tablero[1]) && tablero[1].equals(tablero[2]) )
        {
            ganador=tablero[0];
        }
        else if(tablero[3].equals(tablero[4]) && tablero[4].equals(tablero[5]) )
        {
            ganador=tablero[3];
        }
        else if(tablero[6].equals(tablero[7]) && tablero[7].equals(tablero[8]) )
        {
            ganador=tablero[6];
        }
        
        
        //columnas
        else if(tablero[0].equals(tablero[3]) && tablero[3].equals(tablero[6]) )
        {
            ganador=tablero[0];
        }
        else if(tablero[1].equals(tablero[4]) && tablero[4].equals(tablero[7]) )
        {
            ganador=tablero[1];
        }
        else if(tablero[2].equals(tablero[5]) && tablero[5].equals(tablero[8]) )
        {
            ganador=tablero[2];
        }
        
        //diagonales 
        else if(tablero[0].equals(tablero[4]) && tablero[4].equals(tablero[8]) )
        {
            ganador=tablero[0];
        }
        else if(tablero[2].equals(tablero[4]) && tablero[4].equals(tablero[6]) )
        {
            ganador=tablero[2];
        }
        
        if(hayCuadrados() && ganador.equals("null"))
        {
            return ganador;
        }
        ganador="fin";
        return ganador;
    }
    private boolean hayCuadrados()
    {
        for (int i = 0; i < 9; i++)
        {
            if(!tablero[i].equals("O") && !tablero[i].equals("X"))
            {
                return true;
            }
        }
        return false;
    }
    public void imprimirTablero()
    {
        String linea="";
        System.out.println("|---|---|---|");
        for (int i = 0; i < 9; i++) 
        {
            linea=linea+"| "+tablero[i]+" ";//| 1 | 2 | 3 |
            //2+1=3
            //5+1=6
            //8+1=9
            if((i+1)%3==0)
            {
                //fila con los numero
                System.out.println(linea+"|");
                System.out.println("|---|---|---|");
                linea="";
            } 
        }
        System.out.println("Iniciara a jugar "+turno);
    }
    public String ganador()
    {
        return ganador;
    }
    public void cambiarTurno()
    {
        /*if(turno.equals("X"))
        {
            turno="O";
        }
        else
        {
            turno="X";
        }*/
        turno = (turno.equals("X"))?"O":"X";
    }
    public boolean setValor(int pos)
    {
        if(tablero[pos].equals("O") || tablero[pos].equals("X"))
        {
            System.out.println("Posicion ocupada selecciona otra");
            return false;
        }
        else
        {
            tablero[pos]=turno;
            return true;
        }
        
    }
    
    
    
    
    
    
    
    
}
