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
public class Regex10 {
    public static void main(String[] args) {
        String texto="Febrero es un mes curioso, ya que para cuadrar el calendario, un año bisiesto debe ser divisible entre 4, salvo que sea año secular -el último de cada siglo, terminado en 00- en cuyo caso también ha de ser divisible entre 400. De esta manera, nunca existirá el 30/02/ de cualquier año, pero sí el 29/02/2024. En consecuencia, este año no hay 29/02/2025, ni existió el 29/02/1900, pero sí el 29/02/2000. Por otro lado, hay meses que no tienen 31 días, y por eso no existe el 31/09/2025. al igual que no existió el 31/11/2024, pero sí el 30/11/2014. Adicionalmente, hay fechas que no cumplen el formato que nosotros hemos diseñado, por ejemplo el 13-2-2025, aunque conceptualmente sea una fecha válida. Hoy es 13/02/2025.";
        String encontrado="";
        
        String regex="([0][1-9]|[12][0-9]|3[01])(\\/)([0][1-9]|[1][012])()\\/((19|20|21|22)[0-9]{2})";
                
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        while (matcher.find()) {
            encontrado= matcher.group();
            if (esFechaCorrecta(encontrado)) {
                System.out.println("Fecha localizada: "+encontrado);
            }
        }//while
    }//main

    public static boolean esFechaCorrecta(String fecha){
        boolean resultado=true;
        int dia, mes, agnus;
        String[] trozos;
        
        trozos=trocearFecha(fecha);
        
        dia=extraerDia(trozos);
        mes=extraerMes(trozos);
        agnus=extraerAgnus(trozos);
        
        switch (mes) {
            case 2://febrero

                if (dia>29) {
                    resultado=false;
                } else {
                    if (dia==29) {
                        if (agnus%4!=0) {
                            resultado=false;
                        } else {
                            if (agnus%100==0&&agnus%400!=0) {
                                resultado=false;
                            }
                        }
                    } 
                }
                    
            break;
            
            default:
                if ((mes==4||mes==6||mes==9||mes==11)&&dia==31) resultado=false;
            
        }//switch
        
        return resultado;
        
    }//esFechaCorrecta()
    
      
    public static String[] trocearFecha(String fecha){
        String[] trozos;
        trozos=fecha.split("/");
        return trozos;
    }
    
    
    public static int extraerDia(String trozos[]){
        return Integer.parseInt(trozos[0]);
    }//extraerDia()
    
    
    public static int extraerMes(String trozos[]){
        return Integer.parseInt(trozos[1]);
    }//extraerMes()
    
    
    public static int extraerAgnus(String trozos[]){
        return Integer.parseInt(trozos[2]);
    }//extraerAgnus()
    
}//class

//-------------------------------  FIN ----------------------------------------
