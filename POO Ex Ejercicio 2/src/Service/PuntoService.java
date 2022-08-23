/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class PuntoService {
    Puntos p;

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las coordenadas del primer punto: ");
        int x1 = leer.nextInt();
        int y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas del segundo punto: ");
        int x2 = leer.nextInt();
        int y2 = leer.nextInt();
        p = new Puntos(x1,y1,x2,y2);
    }

    public void calcularDistancia() {
        System.out.println(Math.sqrt(((Math.pow((p.getX2()-p.getX1()), 2))+(Math.pow((p.getY2()-p.getY1()), 2)))));
    }
    
}
