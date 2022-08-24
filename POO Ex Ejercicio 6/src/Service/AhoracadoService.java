/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class AhoracadoService {
    Ahorcado a;
    String[] letraEncontrada;
    
    public void crearJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese palabra");
        String palabra = leer.nextLine();
        String[] pal = palabra.split("");
        System.out.println("Cantidad de jugadas maximas");
        int cantj = leer.nextInt();
        a = new Ahorcado(pal,0,cantj);
        letraEncontrada = new String[a.getPalabra().length];
    }
    public void longitud(){
        System.out.println("La longitud de la palabra: " + a.getPalabra().length);
    }
    public void buscar(String letra){
        //fore para validar si se ingreso antes la letra
        for (String letras : letraEncontrada) {
            if (letra.equalsIgnoreCase(letras)) {
                System.out.println("*****************");
                System.out.println("La letra ya fue ingresada anteriormente");
                System.out.println("*****************");
                return;
            }
        }
        if (encontradas(letra)) {
            letraEncontrada[a.getPalabra().length-a.getCantLetrasEncontradas()] = letra;
            System.out.println("***** SE ENCONTRÓ LA LETRA INGRESADA *****");
        }else{
            System.out.println("XXXXX--- LA LETRA NO SE ENCUENTRA ---XXXXX");
        }
    }

    public boolean encontradas(String letra){
        int acum = 0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a.getPalabra()[i])) {
                acum++;
            }
        }
        if (acum != 0) {
            a.setCantLetrasEncontradas(a.getCantLetrasEncontradas()+acum);
            System.out.println("Encontradas: "+ a.getCantLetrasEncontradas());
            System.out.println("Faltantes: "+ (a.getPalabra().length-a.getCantLetrasEncontradas()));
            return true;
        }else{
            a.setCantJugadas(a.getCantJugadas()-1);
            System.out.println("Encontradas: "+ a.getCantLetrasEncontradas());
            System.out.println("Faltantes: "+ (a.getPalabra().length-a.getCantLetrasEncontradas()));
            return false;
        }
    }
    public void intentos(){
        System.out.println("Intentos restantes: "+ a.getCantJugadas());
    }
    public void juego(){
        String letra;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (a.getCantJugadas() > 0 && a.getCantLetrasEncontradas() < a.getPalabra().length) {
            System.out.println("------------------");
            System.out.println("Ingrese una letra: ");
            letra = leer.nextLine();
            longitud();
            buscar(letra);
            intentos();
        }
        if (a.getCantJugadas()>0) {
            System.out.println("***********************");
            System.out.println("FELICIDADES!!!!");
            System.out.println("ADIVINASTE LA PALABRA");
            System.out.println("LA PALABRA ES: ");
            System.out.println("");
            for (int i = 0; i < a.getPalabra().length; i++) {
                System.out.print(a.getPalabra()[i]);
            }
            System.out.println("");
            System.out.println("");
            System.out.println("***********************");
        }else{
            System.out.println("");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("PERDISTE!");
            System.out.println("SE ACABARON LOS INTENTOS :(");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
        }
    }
}
