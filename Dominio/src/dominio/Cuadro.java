/**
 * Paquete dominio
 */
package dominio;

import java.io.Serializable;

/**
 * Clase encargada de establecer los parametros a los cuadros.
 * 
 */
public class Cuadro implements Serializable {

    private Jugador jugador;
    private Linea[] listaLineas;

    public Cuadro() {
    }
    /**
     * Constructor con los atributos de los cuadros y una lista para las lineas. 
     * 
     * @param jugador
     * @param listaLineas 
     */
    public Cuadro(Jugador jugador, Linea[] listaLineas) {
        this.jugador = jugador;
        this.listaLineas = listaLineas;
    }
    /**
     * Se obtiene el jugador
     * 
     * @return jugador
     */
    public Jugador getJugador() {
        return jugador;
    }
    /**
     * Se establece el jugador
     * 
     * @param jugador 
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    /**
     * Se obtiene la lista de lineas
     * 
     * @return listaLineas
     */
    public Linea[] getListaLineas() {
        return listaLineas;
    }
    /**
     * Se establece la lista de lineas 
     * 
     * @param listaLineas 
     */
    public void setListaLineas(Linea[] listaLineas) {
        this.listaLineas = listaLineas;
    }

}
