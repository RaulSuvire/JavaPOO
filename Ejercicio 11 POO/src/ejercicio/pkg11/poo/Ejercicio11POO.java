/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dia, mes, anio;
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        anio = leer.nextInt();
        Date fecha = new Date(anio,mes-1,dia);
        System.out.println(fecha.toString());
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        if (fechaActual.before(fecha)) {
            System.out.println("Diferencia entre los años: " + (fechaActual.getYear()-fecha.getYear()));
        } else {
            System.out.println("Diferencia entre los años: " + ((fechaActual.getYear()-fecha.getYear())-1));
        }
    }
    
}
