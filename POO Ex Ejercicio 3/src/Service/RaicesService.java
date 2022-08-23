/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class RaicesService {
    Raices r;
    public void crearEcuacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ecuacion de segundo grado a.x2 + b.x + c");
        System.out.println("Ingrese la componente a");
        int a = leer.nextInt();
        System.out.println("Ingrese la componente b");
        int b = leer.nextInt();
        System.out.println("Ingrese la componente c");
        int c = leer.nextInt();
        r = new Raices(a,b,c);
    }
    public double getDiscriminante(){
        return (r.getB()^2)-4*r.getA()*r.getC();
    }
    public boolean tieneRaices(){
        return getDiscriminante() >= 0;
    }
    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
    public void obtenerRaices(){
        if (tieneRaices()) {
            calcular();
        }
    }
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            calcular();
        }
    }

    private void calcular() {
        
    }
}
