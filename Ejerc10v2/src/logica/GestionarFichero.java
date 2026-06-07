/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logica;


/* ---------------------T-MOD-EJ---------------------

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author Jesús Pérez 
 */
public class GestionarFichero {
    
    public static void abrirFichero(JFileChooser jfc, JTextArea txa) throws FileNotFoundException{
        int seleccion;
        String linea="";
        
        //Abrir un fichero para lectura
        seleccion=jfc.showOpenDialog(null);
        
        if (seleccion==JFileChooser.APPROVE_OPTION) {
            
            File f=jfc.getSelectedFile();
           
            Scanner lector=new Scanner(f);

            //Borrar el área de texto
            txa.setText("");

            while (lector.hasNext()) {
                linea=lector.nextLine();
                txa.setText(txa.getText()+linea+"\n");
            }
             
        } else {
            throw new FileNotFoundException("No se puede abrir el fichero");
        }
        
    }//abrirFichero()
    
    public static void guardarFichero(JFileChooser jfc, JTextArea txa) throws FileNotFoundException, IOException{
        int seleccion;
        
        seleccion=jfc.showSaveDialog(null);
        
        if (seleccion==JFileChooser.APPROVE_OPTION) {
            File f=jfc.getSelectedFile();
            
            PrintWriter pw=new PrintWriter(f);
            pw.print(txa.getText());
            pw.close();
            
        } else{
            throw new FileNotFoundException("No se puede abrir el fichero");
        }
        
    }//guardarFichero()
    
}//class

//-------------------------------  FIN ----------------------------------------
