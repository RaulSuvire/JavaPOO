/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class NifService {
    
    String[] charNif = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    NIF nif;

    public void crearNif() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su DNI: ");
        long dni = leer.nextLong();
        int pos = (int) dni % 23;
        nif = new NIF(dni,charNif[(pos)]);
    }

    public void mostrar() {
        System.out.println(nif.getDNI()+"-"+nif.getLetra());
    }
    
}