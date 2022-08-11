/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class LibroServicio {
    
    public Libro crearLibro(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String ISBN, titulo, autor, numeroPaginas;
        
        System.out.println("Ingrese ISBN");
        ISBN = leer.nextLine();
        System.out.println("Ingrese título del libro");
        titulo = leer.nextLine();
        System.out.println("Ingrese autor");
        autor = leer.nextLine();
        System.out.println("Ingrese el número total de páginas");
        numeroPaginas = leer.nextLine();
        Libro libro = new Libro(ISBN, titulo, autor, numeroPaginas);
        return libro;
    }

    public void mostarLibro(Libro libro) {
        System.out.println(libro.toString());
    }
}
