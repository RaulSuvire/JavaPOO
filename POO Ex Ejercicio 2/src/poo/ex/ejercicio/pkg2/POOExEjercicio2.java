/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ex.ejercicio.pkg2;

import Service.PuntoService;

/**
 *
 * @author Raul
 */
public class POOExEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoService ps = new PuntoService();
        ps.crearPuntos();
        System.out.println("----------------");
        ps.calcularDistancia();
    }
    
}
