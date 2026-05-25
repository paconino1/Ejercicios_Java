/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package logica;
import java.util.Scanner;
import gui.Ventana4;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ejerc4 {

    public static void main(String[] args) {
        Ventana4 window=new Ventana4();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }//main

    public static String calculaDNI(String nif) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni;
        char l;
        
        dni=Integer.parseInt(nif.substring(0, 8));
        l=nif.charAt(9);
        
        if (letra.charAt(dni % 23)==Character.toUpperCase(l)) {
            return "VÁLIDO";
        } else {
            return "NO VÁLIDO";
        }
        
    }//calculaDNI()
    
}//class
