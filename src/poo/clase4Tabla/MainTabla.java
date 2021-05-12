/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4Tabla;

import poo.clase4.Tabla;


/**
 *
 * @author vicen
 */
public class MainTabla 
{
    public static void main(String[] args)
    {
        Tabla tbl = new Tabla(7,9,14);
        //sobre carga de métodos
        tbl.getMostrar();
        tbl.getMostrar(2);
    }
    
}
