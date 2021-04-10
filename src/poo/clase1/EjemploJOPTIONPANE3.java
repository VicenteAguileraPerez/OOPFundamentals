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
public class EjemploJOPTIONPANE3 
{
    public static void main(String[] args) 
    {
       
        String inputValue = JOptionPane.showInputDialog("Introduce tu nombre");
        
        JOptionPane.showMessageDialog(null,inputValue,"Valor de  entrada",JOptionPane.WARNING_MESSAGE );
        
        int valor = JOptionPane.showConfirmDialog(null, "Hola?");//si= 0 no = 1 cancel = 2
        System.out.println(valor);
        Object[] possibleValues = { "First", "Second", "Third" };

        Object selectedValue = JOptionPane.showInputDialog(null,"Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        
        
        
        
        
        
    }
    
}
