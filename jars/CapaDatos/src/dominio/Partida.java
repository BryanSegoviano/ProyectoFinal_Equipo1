package dominio;

import java.util.LinkedList;
import java.util.List;

public class Partida {
    
    private Jugador jugador;
    private Tablero tablero;
    private List<Linea> historialCambios;
    private LinkedList<Jugador> turnos;

    public Partida() {
    }

    public Partida(Jugador jugador, Tablero tablero, List<Linea> historialCambios, LinkedList<Jugador> turnos) {
        this.jugador = jugador;
        this.tablero = tablero;
        this.historialCambios = historialCambios;
        this.turnos = turnos;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public List<Linea> getHistorialCambios() {
        return historialCambios;
    }

    public void setHistorialCambios(List<Linea> historialCambios) {
        this.historialCambios = historialCambios;
    }

    public LinkedList<Jugador> getTurnos() {
        return turnos;
    }

    public void setTurnos(LinkedList<Jugador> turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        return "Partida{" + "jugador=" + jugador + ", tablero=" + tablero + ", historialCambios=" + historialCambios + ", turnos=" + turnos + '}';
    }
        
}
