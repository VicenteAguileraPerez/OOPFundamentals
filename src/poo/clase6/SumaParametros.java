/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author vicen
 */
public class SumaParametros 
{
    public static void main(String[] args) 
    {
        int res = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
       // JOptionPane.showMessageDialog(null, );
        System.out.println("La suma de "+args[0]+" y "+args[1]+" es : "+res);
        
        
        
    }
    
}
