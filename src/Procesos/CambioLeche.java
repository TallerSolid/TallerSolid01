/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import Leche.Bien.Leche;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;

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