/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class PersonaService {
    
    private Persona p;
    
    public void crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt()-1; 
        System.out.println("Año aaaa: ");
        int anio = leer.nextInt()-1900;
        Date fechaNacimiento = new Date(anio,mes,dia);
        p = new Persona(nombre,fechaNacimiento);
    }

    public void calcularEdad() {
        Date fechaActual = new Date();
        if (fechaActual.before(p.getFechaNacimiento())) {
            System.out.println("Edad: " + (fechaActual.getYear()-p.getFechaNacimiento().getYear()));
        } else {
            System.out.println("Edad: " + ((fechaActual.getYear()-p.getFechaNacimiento().getYear())-1));
        }
    }

    public boolean menorQue(int edad) {
        Date fechaActual = new Date();
        return fechaActual.getYear()-p.getFechaNacimiento().getYear() < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Fecha de nacimiento: "+ p.getFechaNacimiento().getDate()+ "/"+ (p.getFechaNacimiento().getMonth()+1) +"/"+ p.getFechaNacimiento().getYear());
        
    }
    
}
