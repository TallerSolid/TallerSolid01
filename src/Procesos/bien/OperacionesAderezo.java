/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos.bien;
 import Procesos.*;
import Otros.Aderezo;
import Postres.Pastel;
import Postres.Helado;
import Postres.bien.Postre;
 /**
 *
 * @author Pedro Mendoza
 */
public class OperacionesAderezo {
    
    public static void anadirAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
    
}