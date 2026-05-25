/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package logica;
import java.util.Scanner;
import gui.Ventana;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ejerc2 {

    public static void main(String[] args) {
        Ventana window=new Ventana();
        window.setVisible(true);
        window.setLocationRelativeTo(null);        
    }//main
    
    public static String suma(String s1, String s2){
        double x;
        x=Double.parseDouble(s1)+Double.parseDouble(s2);
        return ""+x;
    }//suma()
    
    public static String resta(String s1, String s2){
        double x;
        x=Double.parseDouble(s1)-Double.parseDouble(s2);
        return ""+x;
    }//resta()
    
    public static String producto(String s1, String s2){
        double x;
        x=Double.parseDouble(s1)*Double.parseDouble(s2);
        return ""+x;
    }//producto()
    
    public static String division(String s1, String s2){
        double x;
        x=Double.parseDouble(s1)/Double.parseDouble(s2);
        return ""+x;
    }//division()
    
    
    
}//class
