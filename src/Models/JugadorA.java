/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
/**
 *
 * @author andrescontreras
 */
public class JugadorA extends Jugador{

    @Override
    public void EquiparArma(Arma arma) {
        super.armaEquipada=arma;
    }

    @Override
    public void Curar(int valorCura) {
        if(super.vida+valorCura>=100)
           super.vida=100;
       else
           super.vida+=valorCura; 
    }

    @Override
    public void Jugar(Mapa m, Jugador oponente) {
        System.out.print("El jugador no hizo nada");;
    }
   
    
}
