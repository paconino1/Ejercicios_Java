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
public class Ejercicio08 {
   public static void main(String[] args) {
        System.out.println("Validando direcciónes IP:");
        System.out.println("192.168.1.1 - "+validarIP("192.168.1.1"));
        System.out.println("12.168.1.1 - "+validarIP("12.168.1.1"));
        System.out.println("1.1.1.1.1 - "+validarIP("1.1.1.1.1"));
        System.out.println("1.1.1.1 - "+validarIP("1.1.1.1"));
        System.out.println("12.13.100.10 - "+validarIP("12.13.100.10"));
        System.out.println("1892.168.1.1 - "+validarIP("1892.168.1.1"));
        System.out.println("255.255.255.255 - "+validarIP("255.255.255.255"));
        System.out.println("255.255.255.256 - "+validarIP("255.255.255.256"));
        System.out.println("01.001.1.1 - "+validarIP("01.001.1.1"));
        System.out.println("0.0.0.0 - "+validarIP("0.0.0.0"));
        
        System.out.println("\nValidando ISBN: ");
        System.out.println("9781212121212 "+validarISBN("9781212121212"));
        System.out.println("6781212121212 "+validarISBN("6781212121212"));
        System.out.println("978121212121212121 "+validarISBN("978121212121212121"));
        System.out.println("9781234567890 "+validarISBN("9781234567890"));
        System.out.println("979977666 "+validarISBN("979977666"));
        
        System.out.println("\nValidando usuarios de Twitter: ");
        System.out.println("@perez "+validarTwitter("@perez"));
        System.out.println("#perez "+validarTwitter("#perez"));
        System.out.println("@PereZ12 "+validarTwitter("@PereZ12"));
        System.out.println("@Perez_2121 "+validarTwitter("@Perez_2121"));
        System.out.println("@ Perez_2121 "+validarTwitter("@ Perez_2121"));

    }//main

    public static boolean validarIP(String IP){
        
        return IP.matches("^((25[0-5]|2[0-4][0-9]|[1]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        
    }//validarIP()
    
    public static boolean validarISBN(String texto){
        
        return texto.matches("^(978|979)[0-9]{10}$");
        
    }//validarISBN()
    
    public static boolean validarTwitter(String texto){
        
        return texto.matches("^@([A-Za-z0-9_])+$");
        
    }//validarTwitter()
}//class

//-------------------------------  FIN ----------------------------------------
