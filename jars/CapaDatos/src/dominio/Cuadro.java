package dominio;
/**
 * Clase encargada de establecer los parametros a los cuadros.
 * 
 * @author Administrador
 */
public class Cuadro {

    private int idCuadro;
    private Jugador jugador;
    private Linea[] listaLineas;

    public Cuadro() {
    }
    /**
     * Constructor con los atributos de los cuadros y una lista para las lineas. 
     * 
     * @param idCuadro
     * @param jugador
     * @param listaLineas 
     */
    public Cuadro(int idCuadro, Jugador jugador, Linea[] listaLineas) {
        this.idCuadro = idCuadro;
        this.jugador = jugador;
        this.listaLineas = listaLineas;
    }
    /**
     * Se obtiene el id del cuadro 
     * 
     * @return idCudro
     */
    public int getIdCuadro() {
        return idCuadro;
    }
    /**
     * Se establece el id del cuadro 
     * 
     * @param idCuadro 
     */
    public void setIdCuadro(int idCuadro) {
        this.idCuadro = idCuadro;
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
