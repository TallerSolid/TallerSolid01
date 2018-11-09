/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos.Bien;
import Leche.Bien.Leche;

/**
 *
 * @author Pedro Mendoza
 */
public class CambioLeche {
    
    private Leche leche;

    public CambioLeche(Leche leche) {
        this.leche = leche;
    }

    public void cambiarLeche(){
        this.leche.usar();
        
    }
}