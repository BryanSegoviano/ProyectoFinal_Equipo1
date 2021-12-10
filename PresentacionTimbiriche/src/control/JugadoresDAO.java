/**
 * Paquete control
 */
package control;

/**
 * Imports utilizados
 */
import dominio.ColorJ;
import dominio.Jugador;

/**
 * Clase JugadoresDAO que se utiliza para hacer uso de un arreglo de los
 * jugadores
 *
 */
public class JugadoresDAO {

    /**
     * Atributos de clase
     */
    public static Jugador[] jugadores;

    /**
     * Constructor que no recibe nada en sus parametros
     */
    public JugadoresDAO() {
        jugadores = new Jugador[4];
        Jugador jugador1 = new Jugador();
        jugador1.setColor(ColorJ.VERDE);
        jugador1.setPuntuacion(0);
        Jugador jugador2 = new Jugador("Gusgri", null, ColorJ.ROJO, 0);
        Jugador jugador3 = new Jugador("Drath", null, ColorJ.INDIGO, 0);
        Jugador jugador4 = new Jugador("Varoonmorte", null, ColorJ.AZUL, 0);
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        jugadores[2] = jugador3;
        jugadores[3] = jugador4;
    }

    /**
     * Método que agrega al jugador número 1
     *
     * @param jugador Jugador a agregar
     */
    public void agregarJugador1(Jugador jugador) {
        this.jugadores[0] = jugador;
    }

    /**
     * Método que agrega al jugador número 2
     *
     * @param jugador Jugador a agregar
     */
    public void agregarJugador2(Jugador jugador) {
        this.jugadores[1] = jugador;
    }

    /**
     * Método que agrega al jugador número 3
     *
     * @param jugador Jugador a agregar
     */
    public void agregarJugador3(Jugador jugador) {
        this.jugadores[2] = jugador;
    }

    /**
     * Método que agrega al jugador número 4
     *
     * @param jugador Jugador a agregar
     */
    public void agregarJugador4(Jugador jugador) {
        this.jugadores[3] = jugador;
    }

    /**
     * Se obtienen los datos de los jugadores.
     *
     * @return Arreglo de jugadores
     */
    public Jugador[] obtenerJugadores() {
        return this.jugadores;
    }

}
