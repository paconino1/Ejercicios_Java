/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/* ---------------------T-MOD-EJ---------------------

*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Jesús Pérez 
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int cuenta=0;
        
        String texto="La quincena es para la cena";
        
        String regex1="cena";//busca Palabra o palabra
        
        String encontrado="";//otro posible nombre: coincidencia
        
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(texto);
        
         while (matcher.find()) {
            encontrado= matcher.group();
            System.out.println("La coincidencia es: "+encontrado);
            cuenta++;                
        }//while
        
        System.out.println("Hemos encontrado "+cuenta+" coincidencias");
        
    }//main
}//class

//-------------------------------  FIN ----------------------------------------
