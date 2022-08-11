/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Raul
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        setCantidadActual(getCapacidadMaxima());
    }
    
    public void servirTaza(int taza){
        if (getCantidadActual() >= taza) {
            setCantidadActual(getCantidadActual()-taza);
            System.out.println("Se llenó la taza");
        } else {
            System.out.println("La taza quedó con: " + (taza - getCantidadActual()));
            setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    
    public void agregarCafe(int cafe){
        if (getCantidadActual()+cafe <= getCapacidadMaxima()) {
            setCantidadActual(getCantidadActual()+cafe);
        } else {
            llenarCafetera();
            System.out.println("Se pasó el límite, sobra: " + (getCantidadActual()+cafe - getCapacidadMaxima()));
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
