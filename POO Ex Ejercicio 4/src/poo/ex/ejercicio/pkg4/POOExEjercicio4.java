/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ex.ejercicio.pkg4;

import Service.NifService;

/**
 *
 * @author Raul
 */
public class POOExEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifService nf = new NifService();
        nf.crearNif();
        nf.mostrar();
    }
    
}
