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
public class Ejercicio02 {
    public static void main(String[] args) {

        //"^[A-Z]{1}[a-z]+$" 
        //------------- No permite tildes ni en la inicial ni en las minúsculas
        
        //"^[A-ZÁÉÍÓÚ]{1}[a-záéíóú]+$" 
        //------------- Permite tildes en inicial y en minúsculas
        
        //"^([A-ZÁÉÍÓÚ]{1}[a-záéíóú]+[ ]?){1,2}$" 
        //------------- La anterior, pero indicando que se repite una o dos veces
        //------------- (nombre compuesto)
        
        String regexNombreSimple="^[A-ZÁÉÍÓÚ]{1}[a-záéíóú]+$";
        String regexNombreCompuesto="([A-ZÁÉÍÓÚ]{1}[a-záéíóú]+\\s?){1,2}";
        
        String pepe="Pepe";
        String jose="José";
        String angela="Ángela";
        
        String jesusFernando="Jesús Fernando";
        
        System.out.println(pepe+" "+pepe.matches(regexNombreSimple));
        System.out.println("pepe"+" "+"pepe".matches(regexNombreSimple));
        System.out.println(jose+" "+jose.matches(regexNombreSimple));
        System.out.println("jose"+" "+"jose".matches(regexNombreSimple));
        System.out.println("Jose"+" "+"Jose".matches(regexNombreSimple));
        System.out.println(angela+" "+angela.matches(regexNombreSimple));
        
        System.out.println(jesusFernando+" "+jesusFernando.matches(regexNombreCompuesto));
        System.out.println(jesusFernando+" "+jesusFernando.matches(regexNombreCompuesto));
        
    }//main
}//class

//-------------------------------  FIN ----------------------------------------
