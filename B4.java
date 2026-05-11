/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b4;
import java.util.Scanner;
import java.io.*;

/*------------------------------- ENUNCIADO ------------------------------------
Ejercicio B4 
Implementa un programa que pida al usuario un número de cualquier longitud, 
como por ejemplo “1234”, y le diga al usuario si dicho número aparece en el 
primer millón de decimales del nº pi (están en el archivo ‘pi-million.txt’). 
No está permitido utilizar ninguna librería ni clase ni método que realice 
la búsqueda. Debes implementar el algoritmo de búsqueda tú.
*/

/**
 * @author Jesús Pérez 
 */
public class B4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        String numero, decimalesPI;
        
        try {
            // Pedimos el numero entero a buscar
            System.out.print("Introduce el número entero a buscar: ");
            numero = sc.nextLine();  
            
            // Intentamos abrir el fichero 'pi-million.txt'
            File ficheroPI = new File("Documentos/pi-million.txt");
            Scanner lector = new Scanner(ficheroPI);
            
            //Cogemos todos los decimales del número PI del fichero
            decimalesPI = lector.nextLine().substring(2);
            lector.close();           
            
            //Recorremos todo el String de decimalesPI restándole la longitud del
            //número a buscar. Salimos del bucle al encontrar el valor.
            for (int i = 0; i < decimalesPI.length() - numero.length()&&!encontrado; i++) 
            {
                // Comparamos si 'numero' está en el substring de decimalesPI
                if(numero.equals(decimalesPI.substring(i, i+numero.length())))
                    encontrado = true;
            }
            
            if(encontrado) 
                System.out.println("El número " + numero + " ha sido encontrado" );
            else
                System.out.println("El número " + numero + " no ha sido encontrado" );
            
        } catch (FileNotFoundException e){
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } 
    }//main

}//class
