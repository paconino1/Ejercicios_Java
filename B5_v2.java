/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b5_v2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class B5_v2 {

    public static void main(String[] args) {
        String fichero, copia;        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduzca el nombre de un fichero: ");
            fichero=sc.next();
            
            //Construyo las rutas de los ficheros
            File origen=new File(fichero);
            copia="copia_de_"+origen.getName();
            File destino=new File(copia);
            
            System.out.println(origen.toPath());
            System.out.println(destino.toPath());
            
            Files.copy(origen.toPath(), destino.toPath());
            
        } 
        catch (Exception e) {
            System.out.println("***ERROR***");
            System.out.println(e);
        }//try-catch
        
    }//main

}//class
