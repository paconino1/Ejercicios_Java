/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package b1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Ejercicio B1 - Máximo y mínimo
Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo
‘numeros.txt’.
*/

/**
 * @author Jesús Pérez 
 */
public class B1 {

   public static void main(String[] args) {
        
        
        try {
            //Abrimos el fichero
            File f=new File("Documentos/numeros.txt");
            calculaMaxMin(f);
        
        // No puede abrir el fichero
        } catch (FileNotFoundException e) { 
            System.err.println("*** ERROR: no se puede abrir el fichero ***");
            System.err.println(e);
       
        //Lectura de un tipo de dato no esperado
        } catch (InputMismatchException e){ 
            System.err.println("*** ERROR de lectura: el tipo de dato no es el esperado.***");
            System.err.println(e);
        
        // Se ha sobrepasado el final del fichero
        } catch (NoSuchElementException e){ 
            System.err.println("ERROR: ha sobrepasado el límite del fichero.");
            System.err.println(e);
        
        // Excepción genérica
        } catch (Exception e){ 
            System.err.println("*** ERROR ***");
            System.err.println(e);
        }
        
    }//main
    
    public static void calculaMaxMin(File f) throws FileNotFoundException{
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n;
        
        if (!f.exists()) throw new FileNotFoundException("No se puede abrir el fichero");
        
        Scanner lector=new Scanner(f);
        
            //Mientras haya elementos, seguiremos leyendo
            while (lector.hasNext()) {
                n=lector.nextInt();
                if (n>max) max=n;
                if (n<min) min=n;                
            }//while

            //Cerramos el fichero
            lector.close();
            
            //Mostramos resultados
            System.out.println("max = " + max);
            System.out.println("min = " + min);
    }

}//class
