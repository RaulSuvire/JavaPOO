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
public class MesSecreto {
    String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    String mesSecreto = meses[5];

    public void adivinarMesSecreto() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean ban = true;
        String mes;
        System.out.println("********************************");
        System.out.println("JUEGO DEL MES SECRETO!!!");
        System.out.println("INTENTE ADIVINAR EL MES SECRETO!");
        while (ban) {
            System.out.println("Ingrese el nombre del mes en minusculas: ");
            mes = leer.nextLine();
            if (!mes.equals(mesSecreto)) {
                System.out.println("XXXXX-- INCORRECTO --XXXXX");
                System.out.println("Intentelo nuevamente");
                System.out.println("-----------------------------");
            } else {
                System.out.println("*****-- CORRECTO!! --*****");
                System.out.println("HA ADIVINADO EL MES SECRETO! FELICIDADES!");
                ban = false;
            }
        }
    }
    
}
