/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ex.ejercicio.pkg6;

import Service.AhoracadoService;

/**
 *
 * @author Raul
 */
public class POOExEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhoracadoService as = new AhoracadoService();
        as.crearJuego();
        as.juego();
    }
    
}
