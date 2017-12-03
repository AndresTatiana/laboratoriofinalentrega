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
public class Jugadory extends Jugador {

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
   public void Jugar(Mapa m,Jugador oponente) {
        int j3[],j4[];
        j3=m.obtenerCoordenadas(this);
        j4=m.obtenerCoordenadas(oponente);
        //vamos a mover al jugador mas cerca al otro jugador
        ((IOcupable)m.obtenerCasilla(j3[0],j3[1])).Desocupar();
        if(j3[0]<j4[0])
        {
            j3[0]++;
        }
        if(j3[1]!=j4[1]-armaEquipada.Rango)
        {
            System.out.print("jugador se mueve a "+j3[0]+"--"+j3[1]+"");
            j3[1]++;
        }
        else
        {
            this.atacar(oponente);
            System.out.print("Se ha hecho un ataque");
        }
        
          //vamos a mover al jugador mas cerca al otro jugador
        ((IOcupable)m.obtenerCasilla(j3[0],j3[1])).Ocupar(this);
    }

    private void atacar(Jugador oponente){
        oponente.Lastimar(this.armaEquipada.Fuerza);
    }
    
}