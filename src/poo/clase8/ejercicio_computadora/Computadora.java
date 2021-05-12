/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase8.ejercicio_computadora;

/**
 *
 * @author vicen
 */
public class Computadora 
{
    private String marca;
    private String modelo;
    private String color;
   
    private int ram,ssd;

    public Computadora() 
    {
        
    }
    public Computadora(int ram, int ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public Computadora(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public void imprimir()
    {
        System.out.println("________________Descrición_______________________");
        System.out.println("La computadora marca: "+marca+"\n "
                + "tiene una ram: "+ram+"gb  tiene un ssd: "+ssd+"gb\n"
                + " su modelo es: "+modelo);
        System.out.println("_________________________________________________");
    }
    public void imprimir(String nombreDuenio)
    {
        System.out.println("________________Descrición_______________________");
        System.out.println("La computadora de "+nombreDuenio+" marca: "+marca+"\n"
                + "tiene una ram: "+ram+"gb  tiene un ssd: "+ssd+"gb\n"
                + " su modelo es: "+modelo+" es de color "+color);
        System.out.println("_________________________________________________");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
    
    
    
    
    
}
