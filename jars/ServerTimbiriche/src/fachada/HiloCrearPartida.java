/**
 * Paquete fachada
 */
package fachada;

/**
 *
 * Clase HiloCrearPartida que extiende de la clase Thread(hilos), que se utiliza
 * para simular la creación de una partida mediante la unión de diversos
 * jugadores.
 */
public class HiloCrearPartida extends Thread {

    /**
     * Método run() que se ejecuta en segundo plano para la unión de los
     * diferentes jugadores.
     */
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
