/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Matematica;

/**
 *
 * @author Raul
 */
public class MatematicaService {
    
    Matematica m = new Matematica();

    public MatematicaService(Matematica m) {
        this.m = m;
    }

    
    public double devolverMayor(){
        if (m.getNumero1() > m.getNumero2()) {
            return m.getNumero1();
        }else{
            if (m.getNumero1() < m.getNumero2()) {
                return m.getNumero2();
            } else {
                return 0;
            }
        }
    }
    public void calcularPotencia(){
        double num = devolverMayor();
        if (num == m.getNumero1()) {
            System.out.println((int)Math.pow(((int)num),((int)m.getNumero2())));
        } else {
            System.out.println(Math.pow((int)m.getNumero2(),(int)num));
        }
    }
    public void calcularRaiz(){
        double num = devolverMayor();
        if (num == m.getNumero1()) {
            System.out.println(Math.sqrt(Math.abs(m.getNumero2())));
        } else {
            System.out.println(Math.sqrt(Math.abs(m.getNumero1())));
        }
    }
}
