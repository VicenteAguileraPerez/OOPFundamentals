/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase913.ambitos;

/**
 *
 * @author vicen
 */
public class Ambitos
{
    public int serie=1235547;//variable global. dentro y fuera de la clase
    public static int serie2=12366874;//variable global.
    
    private String marca="Acer";//variable de ambito de clase
    
    
    
    
    public void sumar(int suma)//el parametro es una variable local
    {
        suma = suma+serie+serie2;
        System.out.println(marca+" "+suma);
        
    }
    public void sumar(int suma1, int suma2)//el parametro es una variable local
    {
        int suma = serie+serie2;
        System.out.println(marca+" "+suma+" "+suma1+suma2);
        
    }
}
