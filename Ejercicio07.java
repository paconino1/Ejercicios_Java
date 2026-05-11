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
public class Ejercicio07 {
   public static void main(String[] args) {
        //------------ MATRICULAS -------------
        System.out.println("Validar matrículas:");
        System.out.println("9147DLZ: "+validarMatricula("9147DLZ"));
        System.out.println("9147DDZ: "+validarMatricula("9147DDZ"));
        System.out.println("914DLZ: "+validarMatricula("914DLZ"));
        System.out.println("9147aDLZ: "+validarMatricula("9147aDLZ"));
        System.out.println("9147ADLZ: "+validarMatricula("9147ADLZ"));
        System.out.println("91DLZ: "+validarMatricula("91DLZ"));
        System.out.println("9147ALZ: "+validarMatricula("9147ALZ"));
        System.out.println("9147IOU: "+validarMatricula("9147IOU"));
        System.out.println("DLZ9147: "+validarMatricula("DLZ9147"));
        System.out.println("D1Z9G47: "+validarMatricula("D1Z9G47"));
        
        //----------- FECHAS -------------
        System.out.println("\nValidar fechas: ");
        System.out.println("11/02/2025: "+validarFecha("11/02/2025"));
        System.out.println("11/2/2025: "+validarFecha("11/2/2025"));
        System.out.println("29/02/2025: "+validarFecha("29/02/2025"));
        System.out.println("29/02/2024: "+validarFecha("29/02/2024"));
        System.out.println("29/02/202: "+validarFecha("29/02/202"));
        
    }//main
    
    public static boolean validarMatricula(String texto){
        
        return texto.matches("^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$");
        
    }//validarMatricula()
    
    public static boolean validarFecha(String texto){
        
        return texto.matches("^([0][1-9]|[12][0-9]|3[01])(\\/)([0][1-9]|[1][012])()\\/((19|20|21|22)[0-9]{2})$");
        
    }//validarFecha()
}//class

//-------------------------------  FIN ----------------------------------------
