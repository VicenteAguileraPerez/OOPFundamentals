/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author vicen
 */
public class PracticaJOP
{
    public static void main(String[] args) {
        int n1;
        double n2;
        //Byte.parseByte(STRING)->byte
        //Short.parseShort(STRING)->short
        //Integer.parseInt(STRING)->int
        //Long.parseLong(STRING)->long
        //Float.parseFloat(STRING)->float
        //Double.parseDouble(STRING)->double
        //Boolean.parseBoolean(STRING)->boolean
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce valor para n1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce valor para n2"));
       
        JOptionPane.showMessageDialog(null, n1+n2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
          
             
    
}
