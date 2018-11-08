/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres.bien;

import Otros.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Postre {
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    
}
