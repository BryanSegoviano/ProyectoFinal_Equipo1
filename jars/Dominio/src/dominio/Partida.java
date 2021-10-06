package dominio;

import java.util.LinkedList;
import java.util.List;
/**
 * Clase partida
 * 
 * @author Administrador
 */
public class Partida {
    
    private Jugador[] jugadoresPartida;
    private Tablero tablero;
    private List<Linea> historialCambios;
    private LinkedList<Jugador> turnos;

    public Partida() {
    }
    /**
     * Constructor que inicializa los atributos de la partida 
     * 
     * @param jugador
     * @param tablero
     * @param historialCambios
     * @param turnos 
     */
    public Partida(Jugador[] jugador, Tablero tablero, List<Linea> historialCambios, LinkedList<Jugador> turnos) {
        this.jugadoresPartida = jugador;
        this.tablero = tablero;
        this.historialCambios = historialCambios;
        this.turnos = turnos;
    }
    /**
     * Se obtiene el jugadoresPartida
     * 
     * @return jugadoresPartida
     */
    public Jugador[] getJugadoresPartida() {
        return jugadoresPartida;
    }
    /**
     * Se establece el jugadoresPartida
     * 
     * @param jugadoresPartida 
     */
    public void setJugadoresPartida(Jugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }
    /**
     * Se obtiene el tablero
     * 
     * @return tablero
     */
    public Tablero getTablero() {
        return tablero;
    }
    /**
     * Se establece el tablero
     * 
     * @param tablero 
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    /**
     * Se obtiene la lista lineas de historial de cambio 
     * 
     * @return histrialCambio 
     */
    public List<Linea> getHistorialCambios() {
        return historialCambios;
    }
    /**
     * Se establece la lista linea de historal de cambio
     * 
     * @param historialCambios 
     */
    public void setHistorialCambios(List<Linea> historialCambios) {
        this.historialCambios = historialCambios;
    }
    /**
     * Se obtien la lista jugadoresPartida de turnos
     * 
     * @return turnos
     */
    public LinkedList<Jugador> getTurnos() {
        return turnos;
    }
    /**
     * Se establece la lista jugadoresPartida de turno
     * 
     * @param turnos 
     */
    public void setTurnos(LinkedList<Jugador> turnos) {
        this.turnos = turnos;
    }
    /**
     * Devuelve los atributos de la partida 
     * 
     * @return jugadoresPartida, tablero, historialCambios y turnos
     */
    @Override
    public String toString() {
        return "Partida{" + "jugador=" + jugadoresPartida + ", tablero=" + tablero + ", historialCambios=" + historialCambios + ", turnos=" + turnos + '}';
    }
        
}
