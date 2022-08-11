/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Cuenta {
    private int numeroCuenta;
    private long DNIdelCliente;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNIdelCliente) {
        this.numeroCuenta = numeroCuenta;
        this.DNIdelCliente = DNIdelCliente;
        this.saldoActual = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNIdelCliente() {
        return DNIdelCliente;
    }

    public void setDNIdelCliente(long DNIdelCliente) {
        this.DNIdelCliente = DNIdelCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de Cuenta");
        setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        setDNIdelCliente(leer.nextLong());
        setSaldoActual(0);
    }
    
    public void ingresar(double ingreso){
        setSaldoActual(saldoActual+=ingreso);
    }
    
    public void retirar(double retiro){
        if (retiro > saldoActual) {
            setSaldoActual(0);
        } else {
            setSaldoActual(saldoActual-=retiro);
        }
    }
    
    public void extraccionRapida(){
        if ( saldoActual*0.2 <= saldoActual) {
            retirar(saldoActual*0.2);
        } else {
            System.out.println("No puede hacer la extraccion");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo es: $"+ getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Sus datos son: \nNumero de cuenta: "+ getNumeroCuenta()+ "\nDNI: "+ getDNIdelCliente());
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNIdelCliente=" + DNIdelCliente + ", saldoActual=" + saldoActual + '}';
    }
    
}
