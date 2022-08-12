/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class PersonaService {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        String sexo;
        int edad;
        int peso;
        double altura;
        System.out.println("INGRESO DE DATOS: ");
        System.out.println("Nombre");
        nombre = leer.nextLine();
        do {
            System.out.println("Sexo, Ingrese 'H' si es hombre, 'M' si es mujer u 'O' si es otro");
            sexo = leer.nextLine();
            if (!("H".equals(sexo) || "M".equals(sexo) || "O".equals(sexo))) {
                System.out.println("El caracter que ingreso no corresponde, Intentelo nuevamente");
            }
        } while (!("H".equals(sexo) || "M".equals(sexo) || "O".equals(sexo)));
        System.out.println("Edad");
        edad = leer.nextInt();
        System.out.println("Peso");
        peso = leer.nextInt();
        System.out.println("Altura");
        altura = leer.nextDouble();
        Persona p = new Persona(nombre, sexo, edad, peso, altura);
        return p;
    }
    
    public int calcularIMC(Persona p){
        if (p.getPeso()/(p.getAltura()* p.getAltura()) < 20 ) {
            return -1;
        } else {
            if (p.getPeso()/(p.getAltura()* p.getAltura()) >= 20 && p.getPeso()/(p.getAltura()* p.getAltura()) <= 25 ){
                return 0;
            } else {
                return 1;
            }
        }
    }
    
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad() >= 18;
    }
}
