/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b5_v3;
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
public class B5_v3 {

   public static void main(String[] args) {
        String fichero, copia;
        String temporal, completo="";
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
                temporal+="\n";                      
                completo+=temporal;
            }
            System.out.println(completo);
            
            fw.write(completo);
            
            //Cierro los ficheros
            lector.close();
            fw.close();            
        } 
        catch (FileNotFoundException e){
            System.out.println("***ERROR***");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("***ERROR***");
            System.out.println(e);
        }//try-catch
        
    }//main
   
}//class
