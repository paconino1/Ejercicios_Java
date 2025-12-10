/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ud3_MatricesMultidimensionales;

import java.util.Scanner;


/*  ----------------------------Ud3-----------------------------------
Arrays de 3 dimensiones. La cadena de restaurantes Roteña Fast, se dedica a la elaboración y venta de comida rápida
(arranque, tortilla de patatas con cebolla, tortilla de patatas sin cebolla y pescaíto frito variado) y cuenta con
3 establecimientos repartidos por el término municipal de la localidad: uno en la Costilla, otro en el Molino y otro en Costa Ballena.
El dueño de la misma te contrata como programador y te pide que diseñes un algoritmo que represente
las ventas de cada uno de sus establecimientos durante cada uno de los meses del último trimestre del año que estamos finalizando.
Para cada uno de ellos necesita saber qué cantidad ha vendido de cada una de las cuatro elaboraciones que tiene a la venta.
De esta manera, se pide:
- Diseñar un array de 3 dimensiones que represente de manera adecuada el planteamiento anterior. ************
- Dibujar la estructura de datos diseñada a mano en un papel, indicando el significado de los datos representados. ************
- Rellenarlo con valores monetarios aleatorios (tipo double) entre 5000 y 9000 euros. **********
- Indicar el total de ventas de cada establecimiento. *********
- La media total de ventas de cada establecimiento. **********
- El total de ventas de la empresa.  ********
- El total de ventas del mes de diciembre.
- ¿Te atreves a calcular algún otro resultado? Te animo a que lo intentes.
- Por otro lado, el algoritmo quedaría mejor con un menú del tipo:
    1. Listado de todas las ventas por establecimiento
    2. Mostrar el total de ventas de cada establecimiento.
    3. Mostrar la media de cada establecimiento.
    4. Mostrar el total de ventas de la empresa.
    5. Mostrar las ventas del mes de diciembre.
*/

/**
 *
 * @author Francisco Niño Caballero
 */
public class Ud3DEj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        double sumatorioVentasEstablecimiento, totalVentasGeneral, totalVentasDiciembre;
        double totalVentasEstablecimiento[]=new double[3];
        double mediaEstablecimientoMes[]=new double[3];
        double mediaEstablecimientoProducto[]=new double[3];
        
        double cadenaRestaurantes [][][]= new double [3][3][4];
        
        totalVentasGeneral=0;
        totalVentasDiciembre=0;
        sumatorioVentasEstablecimiento=0;
        
        for (int i = 0; i < cadenaRestaurantes.length; i++) {
            System.out.println("PROFUNDIDAD "+i+"\n");
            for (int j = 0; j < cadenaRestaurantes[0].length; j++) {
                System.out.print("MES "+j+"\t");
                for (int k = 0; k < cadenaRestaurantes[0][0].length; k++) {
                    cadenaRestaurantes[i][j][k]= 5000+(Math.random()*4001);
                    if (cadenaRestaurantes[i][j][k]>9000) {
                        cadenaRestaurantes[i][j][k]=9000;
                    }
                    System.out.print(String.format("%.02f €\t", cadenaRestaurantes[i][j][k]));      //Quizás lo quito
                    
                    sumatorioVentasEstablecimiento+=cadenaRestaurantes[i][j][k];
                    totalVentasEstablecimiento[i]+=cadenaRestaurantes[i][j][k];
                    mediaEstablecimientoMes[i]=sumatorioVentasEstablecimiento/3;
                    mediaEstablecimientoProducto[i]=sumatorioVentasEstablecimiento/4;
                    totalVentasDiciembre+=cadenaRestaurantes[i][2][k];
                }
                System.out.println("");
            }
            totalVentasGeneral+=sumatorioVentasEstablecimiento;
            sumatorioVentasEstablecimiento=0;
            System.out.println("\n");
        }
        /*System.out.print("¿Qué acción desea realizar?");
        menu=sc.nextInt();
        
        switch (menu) {
            case 1: 
            
            default:
        }*/ //Esto al final y tengo que hacer el comentario
        
    }//main
}//class
