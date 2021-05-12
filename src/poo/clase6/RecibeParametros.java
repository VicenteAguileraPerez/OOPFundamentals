/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vicen
 */
public class RecibeParametros {
    
    public static void main(String[] args) throws InterruptedException,IOException
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        System.out.println(x+ "  "+ y);
       
        //comandos
        String commands[] = { "java","SumaParametros.java",String.valueOf(x),String.valueOf(y)};
        //construye un nuevo proceso en el SO
        ProcessBuilder pb = new ProcessBuilder();
        //ruta del programa nuevo a ejecutar
        pb.directory(new File("C:\\Users\\vicen\\Documents\\NetBeansProjects\\OOPFundamentals\\src\\poo\\clase6\\"));
        // comando a ejecutar 
        pb.command(Arrays.asList(commands));// sentencia a ejecutar
       //Redirije el control al sigiente programa y asocia los controles de Entradas y Salidas Sino se coloca esta linea el singuente programa no corre
        pb.inheritIO();
       
        //Causa que el hilo actual espere , si es necesario, hasta que el proceso  haya terminado
        pb.start().waitFor();
        //pb.start();
           
 
        
    }
    
}
