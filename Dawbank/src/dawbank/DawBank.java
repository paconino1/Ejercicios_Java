/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package dawbank;

import java.util.Scanner;

/**
 *
 * @author Francsico Niño Caballero
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        double cantidad;
        
        System.out.println("--- CREACION DE CUENTA ---");
        System.out.print("Introduce el IBAN: ");
        String IBAN = sc.nextLine().toUpperCase();
        
        System.out.print("Introduce el Titular: ");
        String TITULAR = sc.nextLine();
        
        CuentaBancaria cuenta1=new CuentaBancaria(IBAN, TITULAR);
        
        do {            
            mostrarMenu();          //Llamamos al método
            opcion=sc.nextInt();    //Recogemos el valor
            switch (opcion) {
                case 1:
                    System.out.println("IBAN: "+cuenta1.getIBAN());
                    System.out.println("TITULAR: "+cuenta1.getTITULAR());
                    System.out.println("SALDO: "+cuenta1.getSaldo());
                    break;
                case 2:
                    System.out.println("IBAN: "+cuenta1.getIBAN());
                    break;
                case 3:
                    System.out.println("TITULAR: "+cuenta1.getTITULAR());
                    break;
                case 4:
                    System.out.println("SALDO: "+cuenta1.getSaldo());
                    break;
                case 5:
                    System.out.println("INGRESO: ");
                    cantidad=sc.nextDouble();
                    if (cantidad>0) {
                        cuenta1.ingresar(cantidad);
                        if (cuenta1.hacienda(cantidad)) {
                            System.err.println("AVISO: Notificar a Hacienda");
                        }
                    } else {
                        System.err.println("ERROR | Entrada no valida");
                    }
                    break;
                case 6:
                    System.out.println("RETIRADA: ");
                    cantidad=sc.nextDouble();
                    if (cantidad>0) {
                        cuenta1.retirar(cantidad);
                        if (cuenta1.getSaldo()>-50 && cuenta1.getSaldo()<=0) {
                            System.err.println("AVISO: Saldo negativo");
                        }
                    } else {
                        System.err.println("ERROR | Entrada no valida");
                    }
                    break;
                case 7:
                    System.out.println("--- LISTADO DE MOVIMIENTOS ---");
                    if (cuenta1.getNumMovimientos() == 0) {
                        System.out.println("No hay movimientos registrados.");
                    } else {
                        double[] historial = cuenta1.getMovimientos();
                        for (int i = 0; i < cuenta1.getNumMovimientos(); i++) {
                            // Imprimimos solo hasta donde hay datos
                            System.out.println((i+1) + ". " + historial[i] + " euros");
                        }
                    }
                    break;
                default:
                    System.err.println("Opcion no valida.");
            }
        } while (opcion!=8);
    }
    
    //Creamos un método estático (de clase) para mostrar el menú para que esté todo más organizado.
    public static void mostrarMenu() {
        System.out.println("\n--- BIENVENIDO A DAWBANK ---");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    //Creamos un método para validar el formato del IBAN
    public static boolean validarIBAN (String IBAN) {
        boolean esValido = false;
        
        if (IBAN!=null && IBAN.length()==24) {
            if (Character.isLetter(IBAN.charAt(0)) && Character.isLetter(IBAN.charAt(1))) {
                esValido=true;
                for (int i = 2; i < IBAN.length(); i++) {
                    if (!Character.isDigit(IBAN.charAt(i))) {
                        esValido=false;
                    }
                }
            }
        }
        return esValido;
    }
}
