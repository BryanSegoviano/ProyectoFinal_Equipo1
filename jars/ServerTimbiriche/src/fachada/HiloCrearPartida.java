/**
 * Paquete fachada
 */
package fachada;

/**
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class HiloCrearPartida extends Thread {

    @Override
    public void run() {
        try {
            //Jugador 1 conexión
            System.out.println("Se conecto el jugador Slizzir");
            sleep(1700);

            //Jugador 2 conexión
            System.out.println("Se conecto el jugador 2");
            sleep(3000);

            //Jugador 3 conexión
            System.out.println("Se conecto el jugador Rictal");
            sleep(3000);

            //Jugador 4 conexión
            System.out.println("Se conecto el jugador JuanGod");
            sleep(1500);

        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}
