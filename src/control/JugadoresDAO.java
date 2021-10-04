package control;

import dominio.ColorJ;
import dominio.Jugador;

public class JugadoresDAO {

    public static Jugador[] jugadores = new Jugador[4];

    public JugadoresDAO() {
        Jugador jugador1 = new Jugador();
        jugador1.setColor(ColorJ.VERDE);
        jugador1.setContrasenia("555");
        jugador1.setPuntuacion(0);
        Jugador jugador2 = new Jugador("Nata Cano",
                "1234",
                null,
                ColorJ.ROJO,
                0);
        Jugador jugador3 = new Jugador("god buny",
                "4321",
                null,
                ColorJ.INDIGO,
                0);
        Jugador jugador4 = new Jugador("yoda",
                "yoda",
                null,
                ColorJ.AZUL,
                0);
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        jugadores[2] = jugador3;
        jugadores[3] = jugador4;
    }

    public void agregarJugador1(Jugador jugador) {
        this.jugadores[0] = jugador;
    }

    public void agregarJugador2(Jugador jugador) {
        this.jugadores[1] = jugador;
    }

    public void agregarJugador3(Jugador jugador) {
        this.jugadores[2] = jugador;
    }

    public void agregarJugador4(Jugador jugador) {
        this.jugadores[3] = jugador;
    }

    public Jugador[] obtenerJugadores() {
        return this.jugadores;
    }

//    public boolean eliminarJugador() {
//
//    }

}
