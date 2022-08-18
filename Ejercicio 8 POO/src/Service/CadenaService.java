/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cadena;

/**
 *
 * @author Raul
 */
public class CadenaService {
    public void mostrarVocales(Cadena frase){
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i+1).equals("a") || frase.getFrase().substring(i, i+1).equals("e") || frase.getFrase().substring(i, i+1).equals("i") || frase.getFrase().substring(i, i+1).equals("o") || frase.getFrase().substring(i, i+1).equals("u")) {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: "+ cont);
    }
    /*el metodo reverse de la clase StringBuilder sirve para invertir un string*/
    public void invertirFrase(Cadena frase){
        System.out.println(frase.getFrase());
        //Se crea un objeto de la clase StringBuilder y se envía como arg un String
        StringBuilder invertirFrase = new StringBuilder(frase.getFrase());
        //Se invoca el metodo .reverse().toString()
        System.out.println(invertirFrase.reverse().toString());
    }
    public void vecesRepetido(Cadena frase, String letra){
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i+1).equals(letra)){
                cont++;
            }
        }
        System.out.println("La letra "+letra+" está "+cont+" veces");
    }
    public void compararLonguitud(Cadena frase, String nfrase){
        if (frase.getLongitud() < nfrase.length()) {
            System.out.println("La frase '"+ nfrase + "' tiene mayor longitud");
        } else {
            if (frase.getLongitud() > nfrase.length()) {
                System.out.println("La frase '"+ frase.getFrase() + "' tiene mayor longitud");
            } else {
                System.out.println("La dos frases tienen la misma longitud");
            }
        }
    }
    public void unirFrases(Cadena frase, String nfrase){
        System.out.println(frase.getFrase() +" "+nfrase);
    }
    public void reemplazar(Cadena frase, String letra){
        String aux = frase.getFrase();
        frase.setFrase(aux.replace("a", letra));
        System.out.println(frase.getFrase());
    }
    public boolean contiene(Cadena frase, String letra){
        return frase.getFrase().contains(letra);
    }
}
