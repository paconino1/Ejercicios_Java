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
public class Ejercicio03 {
     public static void main(String[] args) {
        
        System.out.println("23568745A: "+validaDNI("23568745A"));
        
        System.out.println("23568745a: "+validaDNI("23568745a"));
        
        System.out.println("23568745AA: "+validaDNI("23568745AA"));
        
        System.out.println("23568745: "+validaDNI("23568745"));
        
        System.out.println("23568745E: "+validaDNI("23568745E"));
        
        System.out.println("23568E745: "+validaDNI("23568E745"));
        
        System.out.println("W23568745: "+validaDNI("W23568745"));
        
    }//main
    
    public static boolean validaDNI(String DNI){
        //OPCIÓN 1: "^[0-9]{7,8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$"
        //OPCIÓN 2: "^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]{1}$"
        //OPCIÓN 3: "^[0-9]{7,8}[^IÑOU]{1}" - FALLO: Permite minúsculas y otros caracteres
        //OPCIÓN 4: "\\d{7,8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}"
        return (DNI.matches("[0-9]{7,8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}"));
    }//validaDNI()
}//class

//-------------------------------  FIN ----------------------------------------
