/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegofinal;

import Models.ArmaFactory;
import Models.Jugador;
import Models.JugadorA;
import Models.JugadorInutil;
import Models.JugadorPrueba;
import Models.Jugadory;
import Models.Mapa;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author Drugdu
 */
public class JuegoFinal {

    static Mapa m;
    static Jugador j1;
    static Jugador j2;
    static Jugador j3;
    static Jugador j4;
    static Jugador j5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader br = new InputStreamReader(System.in);
        Random R= new Random();
        j1= new JugadorPrueba();
        j1.EquiparArma(ArmaFactory.CreateArma(R.nextInt(10)));
        j1.setChar('1');
        j2= new JugadorInutil();
        j2.EquiparArma(ArmaFactory.CreateArma(R.nextInt(10)));
        j2.setChar('2');
        j3 = new JugadorA();
        j3.EquiparArma(ArmaFactory.CreateArma(R.nextInt(10)));
        j3.setChar('3');
        j4 = new JugadorA();
        j4.EquiparArma(ArmaFactory.CreateArma(R.nextInt(10)));
        j4.setChar('4');
        j5= new Jugadory();
        j5.EquiparArma(ArmaFactory.CreateArma(R.nextInt(10)));
        j5.setChar('5');
        CrearMapa();
        while(j2.isVivo()&&j1.isVivo()&&j3.isVivo())
        {
            j1.ImprimirJugador();
            j2.ImprimirJugador();
            j3.ImprimirJugador();
            j4.ImprimirJugador();
            j5.ImprimirJugador();
            m.ImprimirMapa();

            System.out.println("");
            j1.Jugar(m,j2);
            System.out.println("");
            j2.Jugar(m,j3);
            System.out.println("");
            j3.Jugar(m, j4);
            System.out.println("");
            j4.Jugar(m, j5);
            System.out.println("");
            j5.Jugar(m, j1);
            //br.read(); esto obliga a que exista un enter entre turnos

        }
        
    }

    private static void CrearMapa() {
        m= new Mapa(); 
        m.ubicarJugador(1,1,j1);
        m.ubicarJugador(48,48,j2);
        m.ubicarJugador(40,10,j3);
        m.ubicarJugador(10,48,j4);
        m.ubicarJugador(48,7, j5);
    }
    
}
