/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6poo;

import Entidades.Cafetera;

/**
 *
 * @author Raul
 */
public class Ejercicio6POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera caf = new Cafetera();
        System.out.println(caf.toString());
        caf.agregarCafe(1000);
        System.out.println(caf.toString());
        caf.agregarCafe(1500);
        System.out.println(caf.toString());
        caf.vaciarCafetera();
        System.out.println(caf.toString());
        caf.llenarCafetera();
        System.out.println(caf.toString());
        caf.servirTaza(500);
        System.out.println(caf.toString());
        caf.servirTaza(1750);
    }
    
}
