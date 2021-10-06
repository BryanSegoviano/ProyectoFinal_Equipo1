/**
 * Paquete fachada
 */
package fachada;

/**
 * Clase fachada que implementa la Interface IFachada, donde usa sus métodos
 * para el llamado oculto de los mismos.
 *
 */
public class Fachada implements IFachada {

    /**
     * Atributos de clase
     */
    private final HiloCrearPartida hiloCrearPartida;
    private final HiloUnirsePartida hiloUnirsePartida;

    /**
     * Construción vacío que inicializa sus atributos.
     */
    public Fachada() {
        this.hiloCrearPartida = new HiloCrearPartida();
        this.hiloUnirsePartida = new HiloUnirsePartida();
    }

    /**
     * Método abstracto implementado de IFachada, en la cual se tendra un hilo
     * que creara una partida.
     */
    @Override
    public void crearPartida() {
        this.hiloCrearPartida.start();
    }

    /**
     * Método abstracto implementado de IFachada, en la cual se tendra un hilo
     * que se una a una partida.
     */
    @Override
    public void unirsePartida() {
        this.hiloUnirsePartida.run();
    }

}
