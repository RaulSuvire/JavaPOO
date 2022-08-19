/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12.poo;

import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio12POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int edad;
        PersonaService ps = new PersonaService();
        ps.crearPersona();
        System.out.println("---------------------");
        ps.calcularEdad();
        System.out.println("---------------------");
        System.out.println("Ingrese una edad para saber si la persona es menor a la edad ingresada");
        edad = leer.nextInt();
        if (ps.menorQue(edad)) {
            System.out.println("La persona es menor a la edad ingresada");
        } else {
            System.out.println("La persona es mayor a la edad ingresada");
        }
        System.out.println("---------------------");
        ps.mostrarPersona();
    }
    
}
