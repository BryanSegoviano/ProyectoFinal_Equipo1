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
            //Jugador 2 conexión
            System.out.println("Se ha conectado el jugador 2");
            sleep(3000);

            //Jugador 3 conexión
            System.out.println("Se ha conectado el jugador 3");
            sleep(3000);

            //Jugador 4 conexión
            System.out.println("Se ha conectado el jugador 4");
            sleep(1500);

        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}
