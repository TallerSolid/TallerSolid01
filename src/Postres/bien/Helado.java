/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres.bien;

import Postres.*;
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
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(this.getPrecioParcial()+(this.getPrecioParcial()*0.12))+(this.getAderezos().size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + this.getSabor() + ", precioParcial=" + this.getPrecioParcial() + ", aderezos=" + this.getAderezos() + '}';
    }
    
    
    
    
    
}
