/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/* ---------------------T-MOD-EJ---------------------

*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez 
 */
public class Ejercicio04 {
     public static void main(String[] args) {
        
        //--------- ENTEROS ----------
        System.out.println("Validar números enteros (positivos sin signo o negativos): ");
        System.out.println("1234: "+validarEntero("1234"));
        
        System.out.println("-1234: "+validarEntero("-1234"));
        
        System.out.println("+1234: "+validarEntero("+1234"));
        
        System.out.println("1234567: "+validarEntero("1234567"));
        
        System.out.println("1234a: "+validarEntero("1234a"));
        
        System.out.println("30000: "+validarEntero("30000"));
        
        System.out.println("A1234: "+validarEntero("A1234"));
        
        System.out.println("abCdE: "+validarEntero("abCdE"));
        
        System.out.println("A1234: "+validarEntero("A1234"));
        
        //---------- NEGATIVOS -------------
        System.out.println("\nValidar números negativos: ");
        System.out.println("1234: "+validarNegativo("1234"));
        
        System.out.println("-1234: "+validarNegativo("-1234"));
        
        System.out.println("+1234: "+validarNegativo("+1234"));
        
        System.out.println("1234567: "+validarNegativo("1234567"));
        
        System.out.println("1234a: "+validarNegativo("1234a"));
        
        System.out.println("30000: "+validarNegativo("30000"));
        
        System.out.println("A1234: "+validarNegativo("A1234"));
        
        System.out.println("abCdE: "+validarNegativo("abCdE"));
        
        System.out.println("A1234: "+validarNegativo("A1234"));
        
        //----------- POSITIVOS ---------------
        System.out.println("\nValidar números positivos: ");
        System.out.println("1234: "+validarPositivo("1234"));
        
        System.out.println("-1234: "+validarPositivo("-1234"));
        
        System.out.println("+1234: "+validarPositivo("+1234"));
        
        System.out.println("1234567: "+validarPositivo("1234567"));
        
        System.out.println("1234a: "+validarPositivo("1234a"));
        
        System.out.println("30000: "+validarPositivo("30000"));
        
        System.out.println("A1234: "+validarPositivo("A1234"));
        
        System.out.println("abCdE: "+validarPositivo("abCdE"));
        
        System.out.println("A1234: "+validarPositivo("A1234"));
        
    }//main
    
    public static boolean validarEntero(String cadena){
        
        return cadena.matches("^[-+]?[0-9]+$");
        
    }//validarEntero()
    
    public static boolean validarNegativo(String cadena){
        
        return cadena.matches("^-[0-9]+$");
        
    }//validarNegativo()
    
    public static boolean validarPositivo(String cadena){
        
        return cadena.matches("^?[0-9]+$");
        
    }//validarPositivo()
}//class

//-------------------------------  FIN ----------------------------------------
