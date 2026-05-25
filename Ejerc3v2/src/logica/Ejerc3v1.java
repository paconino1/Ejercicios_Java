/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package logica;
import gui.Ventana;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ejerc3v1 {

    public static void main(String[] args) {
        Ventana window=new Ventana();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }//main

    public static String sumatorio(String s1, String s2){
        int n,m;
        int total=0;
        n=Integer.parseInt(s1);
        m=Integer.parseInt(s2);
        
        for (int i = n; i <= m ; i++) {
            total=total+i;
        }
        return ""+total;
    }//sumatorio()
    
    public static String productorio(String s1, String s2){
        int n,m;
        int total=1;
        n=Integer.parseInt(s1);
        m=Integer.parseInt(s2);
        
        for (int i = n; i <= m ; i++) {
            total*=i;
        }
        return ""+total;
    }//productorio()
    
    public static String exponencial (String s1, String s2){
        int n,m;
        int total=1;
        n=Integer.parseInt(s1);
        m=Integer.parseInt(s2);
        
        for (int i = 0; i < m; i++) {
            total=total*n;
        }
        return ""+total;
    }//exponencial()
    
}//class
