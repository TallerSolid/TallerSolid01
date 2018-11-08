/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres.bien;

import java.util.ArrayList;
import Otros.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Helado(String sabor){
        super(sabor);
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + this.getSabor() + ", precioParcial=" + this.getPrecioParcial() + ", aderezos=" + this.getAderezos() + '}';
    }
    
    
    
    
    
}
