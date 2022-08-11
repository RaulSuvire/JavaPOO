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
public class Operacion {
    int numero1;
    int numero2;

    public Operacion() {
    }
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer número");
        setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        setNumero2(leer.nextInt());
    }
    
    public int sumar(){
        return numero1 + numero2;
    }
    
    public int restar(){
        return numero1 - numero2;
    }
    
    public int multiplicar(){
        if (numero1 == 0 || numero2 == 0){
            System.out.println("No se puede calcular porque uno de los número es 0");
            return 0;
        }else {
            return numero1 * numero2;
        }            
    }
    
    public int dividir(){
        if (numero1 == 0 || numero2 == 0){
            System.out.println("No se puede calcular porque uno de los número es 0");
            return 0;
        }else {
            return numero1 / numero2;
        }     
    }
}
