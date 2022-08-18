/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8.poo;

import Entidades.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cad = new Cadena();
        CadenaService cs = new CadenaService();
        String frase1, frase2, letra;
        System.out.println("Ingrese una frase: ");
        frase1 = leer.nextLine();
        cad.setFrase(frase1);
        cad.setLongitud(frase1.length());
        System.out.println("-----------------");
        System.out.println(cad.toString());
        System.out.println("-----------------");
        System.out.println("MOSTRAR CANTIDAD DE VOCALES");
        cs.mostrarVocales(cad);
        System.out.println("-----------------");
        System.out.println("INVERTIR FRASE");
        cs.invertirFrase(cad);
        System.out.println("-----------------");
        System.out.println("MOSTRAR CANTIDAD DE VECES QUE HAY UN CARACTER INGRESADO POR TECLADO");
        System.out.println("Ingrese un caracter a buscar en la frase:");
        letra = leer.nextLine();
        cs.vecesRepetido(cad, letra);
        System.out.println("-----------------");
        System.out.println("COMPARAR LONGITUDES DE CADENAR DEL OBJETO CON UNA INGRESADA POR TECLADO");
        System.out.println("Ingrese una frase: ");
        frase2 = leer.nextLine();
        cs.compararLonguitud(cad, frase2);
        System.out.println("-----------------");
        System.out.println("UNION DE FRASES");
        cs.unirFrases(cad, frase2);
        System.out.println("-----------------");
        System.out.println("REEMPLAZAR UN CARACTER EN LA CADENA DEL OBJETO");
        System.out.println("Ingrese un caracter para reemplazar la letra 'a' de la cadena: ");
        letra = leer.nextLine();
        cs.reemplazar(cad, letra);
        System.out.println("-----------------");
        System.out.println("BUSCAR LETRA EN CADENA DEL OBJETO Y RETORNA BOOLEANO");
        System.out.println("Ingrese una letra a buscar en la cadena: ");
        letra = leer.nextLine();
        if (cs.contiene(cad, letra)) {
            System.out.println("La letra se encuentra en la cadena");
        }else{
            System.out.println("La letra no se encuentra en la cadena");
        }
    }
    
}
