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
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo");
        setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        setAltura(leer.nextInt());
    }
    
    public int calcularSuperficie(){
        return getBase() * getAltura();
    }
    
    public int calcularPerimetro(){
        return (getBase()+getAltura())*2;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < getAltura(); i++) {
            if (i == 0 || i == getAltura()-1) {
                for (int j = 0; j < getBase(); j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < getBase(); j++) {
                    if (j == 0 || j == getBase()-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
