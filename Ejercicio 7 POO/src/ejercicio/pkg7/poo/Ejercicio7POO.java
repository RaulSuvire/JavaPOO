/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7.poo;

import Entidades.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Raul
 */
public class Ejercicio7POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona[] p = new Persona[4];
        System.out.println("-------------------------");
        p[0] = ps.crearPersona();
        System.out.println(p[0].toString());
        System.out.println("-------------------------");
        p[1] = ps.crearPersona();
        System.out.println("-------------------------");
        p[2] = ps.crearPersona();
        System.out.println("-------------------------");
        p[3] = ps.crearPersona();
        System.out.println("-------------------------");
        
        double debajo = 0;
        double ideal = 0;
        double sobrepeso = 0;
        int mayorEdad = 0;
        int menorEdad = 0;
        //for each : fore + tab  (tipo <nombre de variable> : <nombre arreglo o matriz>). No hace falta variable i, debido a que recorre todo el arreglo o matriz
        for (Persona persona : p) {
            switch (ps.calcularIMC(persona)) {
                case -1:
                    System.out.println("Nombre: "+ persona.getNombre() + " \nEsta por debajo de su peso ideal");
                    System.out.println("-------------------------");
                    debajo++;
                    break;
                case 0:
                    System.out.println("Nombre: "+ persona.getNombre() + " \nTiene peso ideal");
                    System.out.println("-------------------------");
                    ideal++;
                    break;
                case 1:
                    System.out.println("Nombre: "+ persona.getNombre() + " \nTiene sobrepeso");
                    System.out.println("-------------------------");
                    sobrepeso++;
                    break;
            }
            if (ps.esMayorDeEdad(persona)) {
                mayorEdad++;
            } else {
                menorEdad++;
            }
        }
        System.out.println("Porcentaje de personas segun su peso: \nDebajo del peso ideal: "+ (debajo*100)/4+"% \nCon peso ideal: "+ (ideal*100)/4+"% \nCon sobrepeso : "+ (sobrepeso*100)/4+"% \n" );
        System.out.println("-------------------------");
        System.out.println("Porcentaje de personas segun su edad: \nMayores: "+ (mayorEdad*100)/4+"% \nMenores: "+ (menorEdad*100)/4+"%");
    }
    
}
