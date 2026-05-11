/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b6;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*------------------------------- ENUNCIADO ------------------------------------
Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, 
de tal forma que en el fichero resultante aparezcan las líneas de los primeros 
dos ficheros mezcladas, es decir, la primera línea será del primer fichero, 
la segunda será del segundo fichero, la tercera será la siguiente del primer 
fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben 
pasar como argumentos en la línea de comandos. Hay que tener en cuenta que los 
ficheros de donde se van cogiendo las líneas pueden tener tamaños diferentes.
*/

/**
 * @author Jesús Pérez 
 */
public class B6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fichero1, fichero2;
        String temporal1="", temporal2="", completo="";
        
        try {
            //Pido los dos ficheros por teclado
            System.out.println("Introduzca el fichero 1: ");
            fichero1=sc.next();
            System.out.println("Introduzca el fichero 2: ");
            fichero2=sc.next();
            
            //Construyo las rutas y los ficheros de lectura
            File origen1=new File(fichero1);
            Scanner lector1=new Scanner(origen1);
            File origen2=new File(fichero2);
            Scanner lector2=new Scanner(origen2);
            
            //Construyo el fichero de escritura
            File destino=new File("mezcla.txt");
            FileWriter fw=new FileWriter(destino);
            
           
            
            //Mientras ambos archivos tengan líneas, guardo la línea de cada fichero
            //en una variable temporal y se las añado a 'completo'.
            
            while (lector1.hasNext()||lector2.hasNext()) {
                if (lector1.hasNext()) temporal1=lector1.nextLine()+"\n";
                    else temporal1="";
                if (lector2.hasNext()) temporal2=lector2.nextLine()+"\n";
                    else temporal2="";
                completo=completo+temporal1+temporal2;
            }
            
            //Vuelco completo en el fichero de escritura.
            //De esta manera, solamente hay que hacer una operación write
            fw.write(completo);
            
            //Cierro los archivos
            lector1.close();
            lector2.close();
            fw.close();            
        } 
        catch (FileNotFoundException e){
            System.out.println("***ERROR***");
            System.out.println("Error de lectura "+e);
        }
        catch (IOException e){
            System.out.println("***ERROR***");
            System.out.println("Error de escritura "+e);
        }
        catch (Exception e) {
            System.out.println("***ERROR***");
            System.out.println(e);
        }
    }//main

}//class
