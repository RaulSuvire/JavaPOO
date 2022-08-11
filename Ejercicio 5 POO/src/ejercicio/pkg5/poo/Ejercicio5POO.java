/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.poo;

import Entidades.Cuenta;

/**
 *
 * @author Raul
 */
public class Ejercicio5POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cliente = new Cuenta(123456,35318134);
        cliente.consultarDatos();
        cliente.ingresar(200);
        System.out.println(cliente.toString());
        cliente.retirar(100);
        cliente.consultarSaldo();
        cliente.extraccionRapida();
        cliente.consultarSaldo();
    }
    
}
