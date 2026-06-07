/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que gestiona el acceso de usuarios al hipotético sistema (logueo) y el alta en el mismo (agregación de usuarios)
 * @author jesus
 */
public class Usuarios {
    
    //-------------- FICHERO -----------------
    private static File f = new File("users.txt");
    
    /**
     * Comprueba si un usuario y su contraseña están en el fichero en la misma línea
     * @param usu Nombre de usuario que se busca
     * @param passw Nombre de usuario que se busca
     * @return True si coinciden usuario y contraseña. False en caso contrario
     * @throws FileNotFoundException 
     */
    public static boolean comprobarUsuario(String usu, String passw) throws FileNotFoundException{
        String linea;
        boolean encontrado=false;
        //Abrir fichero users.txt
        
        if (!f.exists()) throw new FileNotFoundException("No se puede abrir el fichero");
            
        Scanner lector=new Scanner(f);
        while (lector.hasNext()&&!encontrado) {
            linea=lector.nextLine();
            String[] trozos=linea.split(";");
            //System.out.println(trozos[0]);
            //System.out.println(trozos[1]);
            if (usu.equalsIgnoreCase(trozos[0])&&passw.equals(trozos[1])) {
                encontrado=true;
            }
        }
        lector.close();
        
        return encontrado;
    }//comprobarUsuario()
    
    
    /**
     * Añade un usuario y su contraseña al fichero en el caso de que no estén ya contenidos en el fichero de usuarios
     * @param usu Nombre de usuario que se busca
     * @param passw Nombre de usuario que se busca
     * @return True si ha podido añadir el usuario al fichero. False en caso contrario.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static boolean añadirUsuario(String usu, String passw) throws FileNotFoundException, IOException{
        String linea;
        boolean existe=false;
        boolean add=false;
        
        //Abrir fichero users.txt
        if (!f.exists()) throw new FileNotFoundException("No se puede abrir el fichero");
        
        //Abrir el fichero para lectura
        Scanner lector=new Scanner(f);
        
        //Buscar el usuario en el fichero de usuarios
        existe=comprobarUsuario(usu, passw);

        //Añadirlo si no existe
        if (!existe) {
            FileWriter fw=new FileWriter(f, true);            
            fw.write(usu+";"+passw+"\n");
            fw.close();
            add=true;
        }

        return add;
    }//añadirUsuario()
    
    
}//class
