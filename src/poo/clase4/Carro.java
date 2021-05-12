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
public class Carro 
{
    //atributos
    private String marca;
    private String color;
    private byte cantidadPuertas;
    private float velocidad;
    
    //metodos
    //Constructor
    public Carro()       
    {
        marca="Ford";
        color="rojo";
        cantidadPuertas=4;
        velocidad=200;
    }
    public void imprimir()
    {
        System.out.println("marca: "+marca+" color:" + color+" cantPuertas: "+
                cantidadPuertas+" velocidad: "+velocidad+" km/h");
    }
    public void imprimirConParametros(String marca, String color, byte cantidadDePuertas)
    {
        System.out.println("marca: "+marca+" color:" + color+" cantPuertas: "+
                cantidadDePuertas);
    }
    public float calcularVelocidad(float distancia, float tiempo)
    {
        velocidad=distancia/tiempo;
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public byte getCantidadPuertas() {
        return cantidadPuertas;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidadPuertas(byte cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    
}
