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
public class Ejercicio06 {
    public static void main(String[] args) {
        //---------- REALES ------------
        System.out.println("Validar reales: ");
        System.out.println("2,5 "+validarReal("2,5"));
        System.out.println("-2,5 "+validarReal("-2,5"));
        System.out.println("2.5 "+validarReal("2.5"));
        System.out.println("2-5 "+validarReal("2-5"));
        System.out.println("2'5 "+validarReal("2'5"));
        System.out.println("2,,5 "+validarReal("2,,5"));
        System.out.println("2,.5 "+validarReal("2,.5"));
        System.out.println(".5 "+validarReal(".5"));
        
        //---------- REALES POSITIVOS------------
        System.out.println("\nValidar reales POSITIVOS: ");
        System.out.println("2,5 "+validarRealPositivo("2,5"));
        System.out.println("-2,5 "+validarRealPositivo("-2,5"));
        System.out.println("2.5 "+validarRealPositivo("2.5"));
        System.out.println("2-5 "+validarRealPositivo("2-5"));
        System.out.println("2'5 "+validarRealPositivo("2'5"));
        System.out.println("2,,5 "+validarRealPositivo("2,,5"));
        System.out.println("2,.5 "+validarRealPositivo("2,.5"));
        System.out.println(".5 "+validarRealPositivo(".5"));
        
        //---------- REALES NEGATIVOS------------
        System.out.println("\nValidar reales NEGATIVOS: ");
        System.out.println("2,5 "+validarRealNegativo("2,5"));
        System.out.println("-2,5 "+validarRealNegativo("-2,5"));
        System.out.println("2.5 "+validarRealNegativo("2.5"));
        System.out.println("2-5 "+validarRealNegativo("2-5"));
        System.out.println("2'5 "+validarRealNegativo("2'5"));
        System.out.println("2,,5 "+validarRealNegativo("2,,5"));
        System.out.println("2,.5 "+validarRealNegativo("2,.5"));
        System.out.println(".5 "+validarRealNegativo(".5"));
        
        //---------- REALES CON x DECIMALES------------
        System.out.println("\nValidar reales con x DECIMALES: ");
        System.out.println("2,5 "+validarRealxDecimales("2,5",1));
        System.out.println("-2,5 "+validarRealxDecimales("-2,5",2));
        System.out.println("2.54 "+validarRealxDecimales("2.54",2));
        System.out.println("2.5 "+validarRealxDecimales("2.5",-2));
        System.out.println("2,12345 "+validarRealxDecimales("2,12345",5));
        System.out.println("-2'12345 "+validarRealxDecimales("-2,12345",5));
        System.out.println("-2'1234 "+validarRealxDecimales("-2,1234",5));
        
    }//main
    
    public static boolean validarReal(String texto){
        
        return texto.matches("^(-?[0-9]+)([\\.,][0-9]+)?$");
        
    }//validarReal()
    
    public static boolean validarRealPositivo(String texto){
        
        return texto.matches("^\\+?[0-9]+([\\.,][0-9]+)?$");
        
    }//validarRealPositivo()
    
    public static boolean validarRealNegativo(String texto){
        
        return texto.matches("^-[0-9]+([\\.,][0-9]+)?$");
        
    }//validarRealNegativo()
    
    public static boolean validarRealxDecimales(String texto, int decimales){
        
        if (decimales>0) {
            return texto.matches("^-?[0-9]+([\\.,][0-9]{"+decimales+"})$");
        } else {
            return false;
        }        
        
    }//validarRealxDecimales()
}//class

//-------------------------------  FIN ----------------------------------------
