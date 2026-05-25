/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Jesús Pérez
 */
public class Lectura {
    
    public static String validaEntero(String s){
        try {
            int n;
            n=Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return "ERROR";
        }
        return s;
    }//validaEntero()
    
    

}
