/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b3;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/*------------------------------- ENUNCIADO ------------------------------------
Realiza un programa que lea el fichero creado en el ejercicio anterior y que 
muestre los números por pantalla.

*/

/**
 * @author Jesús Pérez 
 */
public class B3 {

    public static void main(String[] args) {
        try {
            File f=new File("../B2/primos.dat");
            Scanner lector=new Scanner(f);
            
            while (lector.hasNext()) {
                System.out.println(lector.nextInt());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("***ERROR***");
            System.out.println(e);
        }       
        
    }//main

}//class
