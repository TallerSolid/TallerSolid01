/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.bien;

import Postres.bien.*;
import Procesos.bien.*;
import Leche.*;
import Otros.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        OperacionesAderezo.anadirAderezo(helado_vainilla, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezo(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        OperacionesAderezo.quitarAderezo(pastel_chocolate, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezo(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
        
        
    }
}
