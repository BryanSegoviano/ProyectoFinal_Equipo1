package control;

import dominio.ColorJ;
import dominio.Jugador;
/**
 * Clase dao que establece el arreglo de jugadores 
 * 
 * @author Administrador
 */
public class JugadoresDAO {
    //Se crean objetos estaticos de jugadores.
    public static Jugador[] jugadores;

    public JugadoresDAO() {
        jugadores = new Jugador[4];
        Jugador jugador1 = new Jugador();
        jugador1.setColor(ColorJ.VERDE);
        jugador1.setContrasenia("555");
        jugador1.setPuntuacion(0);
        Jugador jugador2 = new Jugador("Nata Cano",
                "1234",
                null,
                ColorJ.ROJO,
                0);
        Jugador jugador3 = new Jugador("God Bunny",
                "4321",
                null,
                ColorJ.INDIGO,
                0);
        Jugador jugador4 = new Jugador("Yoda",
                "yoda",
                null,
                ColorJ.AZUL,
                0);
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        jugadores[2] = jugador3;
        jugadores[3] = jugador4;
    }
    //Se agrega el jugador numero 1
    public void agregarJugador1(Jugador jugador) {
        this.jugadores[0] = jugador;
    }
    //Se agrega el jugador numero 2
    public void agregarJugador2(Jugador jugador) {
        this.jugadores[1] = jugador;
    }
    //Se agrega el jugador numero 3
    public void agregarJugador3(Jugador jugador) {
        this.jugadores[2] = jugador;
    }
    //Se agrega el jugador numero 4
    public void agregarJugador4(Jugador jugador) {
        this.jugadores[3] = jugador;
    }
    /**
     * Se obtienen los datos de los jugadores.
     * 
     * @return jugadores.
     */
    public Jugador[] obtenerJugadores() {
        return this.jugadores;
    }

//    public boolean eliminarJugador() {
//
//    }
}
