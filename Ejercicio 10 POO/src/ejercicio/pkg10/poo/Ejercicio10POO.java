/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.poo;

import java.util.Arrays;

/**
 *
 * @author Raul
 */
public class Ejercicio10POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 12, m = 6;
        double A[] = new double[n];
        double B[] = new double[m];
        rellenarA(A,n);
        System.out.println("ARREGLO A");
        mostrarArreglo(A,n);
        System.out.println("-----------------");
        Arrays.sort(A); //ORDENA EL ARREGLO
        System.out.println("ARREGLO A ORDENADO");
        mostrarArreglo(A,n);
        System.out.println("-----------------");
        rellenarB(A,B,m);
        System.out.println("ARREGLO B");
        mostrarArreglo(B,m);
    }
    public static void rellenarA(double A[],int n){
        for (int i = 0; i < A.length; i++) {
            A[i]=(double)(Math.random()*100);
        }
    }
    public static void mostrarArreglo(double X[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " / ");
        }
        System.out.println("");
    }
    public static void rellenarB(double A[], double B[], int m){
        for (int i = 0; i < m; i++) {
            if (i < m/2) {
                B[i] = A[i];
            } else {
                B[i] = 0.5;
            }
        }
    }
}
