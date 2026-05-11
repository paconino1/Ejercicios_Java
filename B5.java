/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*------------------------------- ENUNCIADO ------------------------------------
Crear un programa que solicite al usuario el nombre de un archivo de texto y 
cree una copia exacta de él con nombre “copia_de_XXXXX”.
*/

/**
 * @author Jesús Pérez 
 */
public class B5 {

    public static void main(String[] args) {
        String fichero, copia;
        String temporal;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduzca el nombre de un fichero: ");
            fichero=sc.next();
            
            //Construyo las rutas de los ficheros
            File origen=new File(fichero);
            copia="copia_de_"+origen.getName();
            File destino=new File(copia);
            
            //Construyo el fichero de lectura y el de escritura
            Scanner lector=new Scanner(origen);
            FileWriter fw=new FileWriter(destino);
            
            //Leo del origen mientras tenga líneas y copio en el destino
            while (lector.hasNext()) {
                temporal=lector.nextLine();
                System.out.println(temporal);
                fw.write(temporal+"\n");
            }
            
            //Cierro los ficheros
            lector.close();
            fw.close();            
        } 
        
        catch (FileNotFoundException e){
            System.out.println("***ERROR DE LECTURA***");
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println("***ERROR DE ESCRITURA***");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("***ERROR GENÉRICO***");
            System.out.println(e);
        }//try-catch
        
    }//main

}//class
