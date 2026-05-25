/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package logica;
import gui.Ventana;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ejer1 {

    public static void main(String[] args) {
        Ventana window=new Ventana();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        //window.setResizable(false);
    }//main
    
    public static boolean esPar(String s){
        int n;
        n=Integer.parseInt(s);
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    }//esPar()    
    
}//class
