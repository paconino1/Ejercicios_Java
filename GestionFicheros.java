/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplo2gestionficheros;
import java.io.File;
import java.util.Date;

/*------------------------------- ENUNCIADO ------------------------------------
Ejemplos de gestión de ficheros en Java utilizando la clase File. Incluye:
- Obtención de la ruta:
    - String getParent()
    - String getName()
    - String getAbsolutePath()
- Comprobación del estado:
    - boolean exits()
    - boolean isFile()
    - boolean isDirectory()
- Propiedades de ficheros:
    - long length()
    - long lastModified()
- Gestión de ficheros:
    - boolean mkdir()
    - boolean delete()
    - boolean renameTo()
- Listado de archivos
    - File[] listFiles()

La clase File está incluida en el paquete java.io, por lo tanto será necesario
usar la correspondiente sentencia de importación e instanciar posteriormente
el objeto/s
*/

/**
 * @author Jesús Pérez 
 */
public class GestionFicheros {

    public static void main(String[] args) {
        //2.3.1. Obtención de la ruta
        obtenerRuta();
        
        //2.3.2. Comprobaciones de estado
        comprobarEstado();
        
        //2.3.3. Propiedades de los Ficheros
        propiedadesFicheros();
        
        //2.3.4. Gestión de ficheros: crear y borrar directorios
        //creaBorraDir();
        //mueveFicheros();
        
        //2.3.5. Listado de archivos
        listaDir();
        
    }//main
    
    /*--------------------------- INSTRUCCIONES ------------------------------
    Veamos un ejemplo de cómo funcionan estos tres métodos. Obsérvese que las rutas
    relativas se añaden a la ruta de la carpeta de trabajo (donde se encuentra el proyecto)
    */
    public static void obtenerRuta(){
        // Dos rutas absolutas
        File carpetaAbs = new File("/home/usuario/fotos");
        File archivoAbs = new File("/home/usuario/fotos/albania1.jpg");
        
        // Dos rutas relativas
        File carpetaRel = new File("trabajos");
        File fitxerRel = new File("trabajos/documento.txt");
        
        //Qué hace cada método
//        System.out.println("String getParent() devuelve la ruta de la carpeta donde se incluye elemento, " +
//        "eliminando dicho elemento");
//        System.out.println("String getName() devuelve el nombre del elemento que representa la ruta, ya sea una" +
//        "carpeta o un archivo.");
//        System.out.println("String getAbsolutePath() devuelve la ruta absoluta.\n");
        
        // Mostrar las rutas
        mostrarRutas(carpetaAbs);
        mostrarRutas(archivoAbs);
        mostrarRutas(carpetaRel);
        mostrarRutas(fitxerRel);
    }//obtenerRuta()
    
    public static void mostrarRutas(File f) {
        System.out.println("getParent(): " + f.getParent());
        System.out.println("getName(): " + f.getName());
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("");
    }//mostrarRutas()
    
    
    /*--------------------------- INSTRUCCIONES ------------------------------
    Por ejemplo, el siguiente código hace una serie de comprobaciones sobre un conjunto de
    rutas. Para poder probarlo puedes crear la carpeta "Temp" en la raíz "C:". Dentro, un archivo
    llamado "Document.txt" (puede estar vacío) y una carpeta llamada “Fotos”. Después de probar
    el programa puedes eliminar algún elemento y volver a probar para ver la diferencia.
    */
    public static void comprobarEstado(){
        File temp = new File("/temp");
        File fotos = new File("/temp/fotos");
        File document = new File("/temp/documento.txt");
        System.out.println(temp.getAbsolutePath()+" ¿existe? "+temp.exists());
        mostrarEstado(fotos);
        mostrarEstado(document);
    }//comprobarEstado()
    
    public static void mostrarEstado(File f) {
        System.out.println(f.getAbsolutePath()+" ¿archivo? "+f.isFile());
        System.out.println(f.getAbsolutePath()+" ¿carpeta? "+f.isDirectory());
    }//mostrarEstado()    
    
    
    /*--------------------------- INSTRUCCIONES ------------------------------
    El ejemplo siguiente muestra cómo funcionan estos métodos. Para probarlos crea el archivo
    “Documento.txt" en la carpeta "C:\Temp". Primero deja el archivo vacío y ejecuta el programa.
    Luego, con un editor de texto, escribe cualquier cosa, guarda los cambios y vuelve a ejecutar el
    programa. Observa cómo el resultado es diferente. Como curiosidad, fíjate en el uso de la clase
    Date para poder mostrar la fecha en un formato legible.
    */
    public static void propiedadesFicheros(){
        File documento = new File("/temp/documento.txt");
        System.out.println(documento.getAbsolutePath());
        long milisegundos = documento.lastModified();
        Date fecha = new Date(milisegundos);
        System.out.println("\nÚltima modificación (ms): " + milisegundos);
        System.out.println("Última modificación (fecha): " + fecha);
        System.out.println("Tamaño del archivo: " + documento.length());
    }//propiedadesFicheros()
    
    
    /*--------------------------- INSTRUCCIONES ------------------------------
    Para probar el ejemplo que se muestra a continuación de manera que se pueda ver cómo
    funcionan estos métodos, primero asegúrate de que en la raíz de la unidad "C:" no hay ninguna
    carpeta llamada "Temp" y ejecute el programa. Todo fallará, ya que las rutas son incorrectas
    (no existe "Temp"). Luego, crea la carpeta "Temp" y en su interior crea un nuevo documento
    llamado "Documento.txt" (puede estar vacío). Ejecuta el programa y verás que se habrá creado
    una nueva carpeta llamada "Fotos". Si lo vuelves a ejecutar por tercera vez podrás comprobar
    que se habrá borrado.
    */
    public static void creaBorraDir(){
        File fotos = new File("/temp/fotos");
        File doc = new File("/temp/documento.txt");
        
        boolean mkdirFot = fotos.mkdir();
        if (mkdirFot) {
            System.out.println("Creada carpeta " + fotos.getName() + "? " + mkdirFot);
        }else {
            boolean delCa = fotos.delete();
            System.out.println("Borrada carpeta " + fotos.getName() + "? " + delCa);
            boolean delAr = doc.delete();
            System.out.println("Borrado archivo " + doc.getName() + "? " + delAr);
        }
    }//creaBorraDir()
    
    
    /*--------------------------- INSTRUCCIONES ------------------------------
    Una vez más, veamos un ejemplo. Dentro de la carpeta "C:/Temp" crea una carpeta llamada
    "Media" y otra llamada "Fotos". Dentro de la carpeta "Fotos" crea dos documentos llamados
    "Documento.txt" y "Fotos.txt". Después de ejecutar el programa, observa como la carpeta
    "Fotos" se ha movido y ha cambiado de nombre, pero mantiene en su interior el archivo
    "Fotos.txt". El archivo "Documento.txt" se ha movido hasta la carpeta "Temp".
    */
    public static void mueveFicheros(){
        File origenDir = new File("/temp/fotos");
        File destinoDir = new File("/temp/media/fotografies");
        File origenDoc = new File("/temp/media/fotografies/documento.txt");
        File destinoDoc = new File("/temp/documento.txt");
        
        boolean res = origenDir.renameTo(destinoDir);
        System.out.println("Se ha movido y renombrado la carpeta? " + res);
        res = origenDoc.renameTo(destinoDoc);
        System.out.println("Se ha movido el documento? " + res);
    }//mueveFicheros()
    
    /*--------------------------- INSTRUCCIONES ------------------------------
    Veamos un ejemplo. Antes de ejecutarlo, crea una carpeta "Temp" en la raíz de la unidad
    "C:". Dentro crea o copia cualquier cantidad de carpetas o archivos.
    */
    public static void listaDir(){
        File dir = new File("/temp");
        File[] lista = dir.listFiles();
        System.out.println("\nContenido de " + dir.getAbsolutePath() + " :");
        
        // Recorremos el array y mostramos el nombre de cada elemento
        for (int i = 0; i < lista.length; i++) {
            File f = lista[i];
            if (f.isDirectory()) {
                System.out.println("[DIR] " + f.getName());
            } else {
                System.out.println("[ARX] " + f.getName());
            }   
        }//for   
    }//listaDir()
    
}//class
