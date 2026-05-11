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
public class Ejercicio05 {
    public static void main(String[] args) {
        //----------- BINARIO -------------
        System.out.println("Validar binarios: ");
        System.out.println("0 "+validarBinario("0"));
        System.out.println("1 "+validarBinario("1"));
        System.out.println("010101 "+validarBinario("010101"));
        System.out.println("0101012 "+validarBinario("0101012"));
        System.out.println("1011 "+validarBinario("1011"));
        System.out.println("1234 "+validarBinario("1234"));
        System.out.println("123476 "+validarBinario("123476"));
        System.out.println("123476 "+validarBinario("123476"));
        System.out.println("12AA "+validarBinario("12AA"));
        System.out.println("FF03 "+validarBinario("FF03"));
        System.out.println("FG03 "+validarBinario("FG03"));
       
        
        //----------- OCTAL ----------------
        System.out.println("\nValidar octal:");
        System.out.println("0 "+validarOctal("0"));
        System.out.println("1 "+validarOctal("1"));
        System.out.println("010101 "+validarOctal("010101"));
        System.out.println("0101012 "+validarOctal("0101012"));
        System.out.println("1011 "+validarOctal("1011"));
        System.out.println("1234 "+validarOctal("1234"));
        System.out.println("123476 "+validarOctal("123476"));
        System.out.println("123476 "+validarOctal("123476"));
        System.out.println("12AA "+validarOctal("12AA"));
        System.out.println("FF03 "+validarOctal("FF03"));
        System.out.println("FG03 "+validarOctal("FG03"));
        
        
        //----------- HEXADECIMAL -----------
        System.out.println("\nValidar hexadecimal: ");
        System.out.println("0 "+validarHexadecimal("0"));
        System.out.println("1 "+validarHexadecimal("1"));
        System.out.println("010101 "+validarHexadecimal("010101"));
        System.out.println("0101012 "+validarHexadecimal("0101012"));
        System.out.println("1011 "+validarHexadecimal("1011"));
        System.out.println("1234 "+validarHexadecimal("1234"));
        System.out.println("123476 "+validarHexadecimal("123476"));
        System.out.println("123476 "+validarHexadecimal("123476"));
        System.out.println("12AA "+validarHexadecimal("12AA"));
        System.out.println("FF03 "+validarHexadecimal("FF03"));
        System.out.println("FG03 "+validarHexadecimal("FG03"));
        
    }//main
    
    public static boolean validarBinario(String texto){
        
        return texto.matches("^[0-1]+$");
        
    }//validarBinario()
    
    public static boolean validarOctal(String texto){
        
        return texto.matches("^[0-7]+$");
        
    }//validarOctal()
    
    public static boolean validarHexadecimal(String texto){
        
        return texto.matches("^[0-9ABCDEF]+$");
        
    }//validarHexadecimal()
}//class

//-------------------------------  FIN ----------------------------------------
