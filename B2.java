/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*------------------------------- ENUNCIADO ------------------------------------
Escribe un programa que guarde en un fichero con nombre primos.dat los números 
primos que hay entre 1 y 500.
*/

/**
 * @author Jesús Pérez 
 */
public class B2 {

    public static void main(String[] args) {
        try {
            File f=new File("primos.dat");
            FileWriter fw=new FileWriter(f);
            
            for (int i = 2; i < 500; i++) {
                if (esPrimo(i)) {
                    fw.write(i+" "); // escribimos valor                   
                }
            }//for
            fw.close();
            
        //Error de escritura en el fichero
        }catch (IOException e) {
            System.err.println("***ERROR DE ESCRITURA***");
            System.err.println("e");
        } catch (Exception e) {
            System.err.println("***ERROR***");
            System.err.println(e);
        }
        
    }//main

    public static boolean esPrimo(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }//esPrimo()
    
}//class
