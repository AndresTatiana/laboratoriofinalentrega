/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegofinal;

import Models.Arma;
import Models.Jugador;
import Models.Mapa;

/**
 *
 * @author andrescontreras
 */
public class JugadorT extends Jugador{

    @Override
    public void EquiparArma(Arma arma) {
        super.armaEquipada=arma;
    }

    @Override
    public void Curar(int valorCura) {
        if(super.vida+valorCura>=100)
           super.vida=150;
       else
           super.vida+=valorCura;
    }

    @Override
    public void Jugar(Mapa m, Jugador oponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
