/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dawbank;

/**
 *
 * @author Francisco Niño Caballero
 */
public class CuentaBancaria {
    private final String IBAN;
    private final String TITULAR;
    private double saldo;
    private double[] movimientos;
    private int numMovimientos;
    private final double MIN_SALDO = -50.0;
    
    //--------CONSTRUCTORES---------
    public CuentaBancaria(String IBAN, String TITULAR) {
        this.IBAN = IBAN;
        this.TITULAR = TITULAR;
        this.saldo = 0;
        this.movimientos = new double[100];
        this.numMovimientos=0;
    }
    
    //----GETTERS y SETTERS---------
    public String getIBAN() {
        return IBAN;
    }

    public String getTITULAR() {
        return TITULAR;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public int getNumMovimientos () {
        return numMovimientos;
    }
    
    public double[] getMovimientos() {
        return movimientos;
    }
    
    //--------MÉTODOS--------
    
    public void ingresar(double cantidad) {
        if (cantidad>0) {
            this.saldo+=cantidad;
            registrarMovimiento(cantidad);
        }
    }
    
    public void retirar(double cantidad) {
       if (cantidad > 0) {
            if (this.saldo - cantidad >= MIN_SALDO) {
                this.saldo -= cantidad;
                registrarMovimiento(-cantidad); // Guardamos el movimiento negativo
            } else {
                System.err.println("AVISO: Operacion cancelada. Supera el minimo de saldo");
            }
        }
    }
    
    private void registrarMovimiento(double cantidad) {
        if (numMovimientos < 100) {
            // Si el array no está lleno, simplemente añadimos
            movimientos[numMovimientos] = cantidad;
            numMovimientos++;
        } else {
            // Si el array ESTÁ LLENO (tenemos 100), desplazamos todo a la izquierda
            // El movimiento 0 se pierde, el 1 pasa al 0, el 2 al 1...
            for (int i = 0; i < 99; i++) {
                movimientos[i] = movimientos[i+1];
            }
            // Añadimos el nuevo al final (posición 99)
            movimientos[99] = cantidad;
        }
    }
    
    public boolean hacienda (double ingreso) {
        return ingreso>3000;
    }
    
}
