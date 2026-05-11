/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class A1 {

    public static void main(String[] args) {
        String infoRuta="";
        Scanner sc=new Scanner(System.in);
        
        do {            
            try {
                System.out.println("\nIntroduzca una ruta absoluta del sistema de archivos: ");
                infoRuta=sc.nextLine();  
                if (infoRuta!="") {
                    File rutaAbs= new File(infoRuta);
                    muestraInfoRuta(rutaAbs);
                }                
            } catch (FileNotFoundException e) {
                System.out.println("ERROR: ");
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println("ERROR: ");
                System.out.println(e);
            }
        } while (!infoRuta.equals(""));
        
    }//main

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException{
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introducida no existe");
        }
        
        if (ruta.isFile()) {
            System.out.println("[A] "+ ruta.getName());
        } else {
            System.out.println("* "+ruta.getName());
            File[] listado=ruta.listFiles();
            
            //Mostramos los directorios
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].isDirectory()) {
                    System.out.println("* "+listado[i].getName());
                }                
            }//for
            
            //Mostramos los archivos
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].isFile()) {
                    System.out.println("[A] "+ listado[i].getName());
                }                
            }//for
        }//if
        System.out.println("");
    }//muestraRuta()
    
}
