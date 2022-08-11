/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import Entidades.Libro;
import Servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroServicio ls = new LibroServicio();
        Libro libro;
        libro = ls.crearLibro();
        ls.mostarLibro(libro);
    }
    
}
