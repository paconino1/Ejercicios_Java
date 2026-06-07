/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herramientas;

/**
 *
 * @author Jesús Pérez
 */
public class Lectura {

   /**
    * Valida un String como si fuera un double
    * @param s
    * @return 
    */
    public static String validaDouble(String s){
        try {
            double x;
            x=Double.parseDouble(s);
        } catch (Exception e) {
            return "ERROR";
        }
        return s;
    }//validaDouble()
    
    
    /**
     * Valida un String como int
     * @param s
     * @return 
     */
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
