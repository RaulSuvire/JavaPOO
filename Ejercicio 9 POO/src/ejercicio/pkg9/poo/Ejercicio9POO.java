/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9.poo;

import Entidades.Matematica;
import Service.MatematicaService;

/**
 *
 * @author Raul
 */
public class Ejercicio9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica numero = new Matematica();
        MatematicaService ms = new MatematicaService(numero);
        numero.setNumero1((Math.random()*10));
        numero.setNumero2((Math.random()*10));
        System.out.println(numero.toString());
        if (ms.devolverMayor() != 0) {
            System.out.println("El mayor es: "+ms.devolverMayor());
        } else {
            System.out.println("Los números son igual");
        }
        System.out.println("---------------");
        System.out.println("Calculo de potencia");
        ms.calcularPotencia();
        System.out.println("---------------");
        System.out.println("Calculo de raiz");
        ms.calcularRaiz();
        
    }
    
}
