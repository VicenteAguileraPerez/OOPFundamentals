/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase3;

/**
 *
 * @author vicen
 */
public class Circulo
{
    private double radio;
    private static final double PI=3.1416;

    public Circulo() 
    {
        radio=0;
    }
    
    public double getArea()
    {
        return PI*Math.pow(radio, 2);
    }
    
    public double getRadio()
    {
        return radio;
    }
    public void setRadio(double radio)
    {
        this.radio=radio;
    }
    
    
    
    
}
