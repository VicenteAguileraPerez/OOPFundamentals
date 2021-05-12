/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4;



/**
 *
 * @author vicen
 */
public class Circulo
{
    public String nom;
    private double radio;
    private static final double PI=3.1416;

    //cons por defecto
    public Circulo()
    {
        nom="12345";
        radio=200.5;
    }
    //sobrecarga
    public Circulo(double radio)
    {
        nom="12345";
        this.radio=radio;
    }
    //sobrecarga
    public Circulo(String nom)
    {
        this.nom=nom;
        this.radio=0;
    }
    //sobrecarga
    public Circulo(double radio, String nom)
    {
        this.nom=nom;
        this.radio=radio;
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
