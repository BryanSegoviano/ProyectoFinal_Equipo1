package server;

import gui.FrmPartida;
import gui.FrmTablero;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class HiloCrearPartida extends Thread {

    @Override
    public void run() {
        try {
            FrmPartida frmPartida = new FrmPartida("");
            frmPartida.setVisible(true);
            sleep(1700);

            //Jugador 2 conexión
            FrmPartida.jPanelJugador2.setVisible(true);
            System.out.println("Se conecto el jugador Slizzir");
            sleep(3000);

            //Jugador 3 conexión
            FrmPartida.jPanelJugador3.setVisible(true);
            System.out.println("Se conecto el jugador Rictal");
            sleep(3000);

            //Jugador 4 conexión
            FrmPartida.jPanelJugador4.setVisible(true);
            System.out.println("Se conecto el jugador JuanGod");
            sleep(1500);
            frmPartida.setVisible(false);
            frmPartida.dispose();
            FrmTablero frmTablero = new FrmTablero();
            frmTablero.setVisible(true);

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloCrearPartida.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
