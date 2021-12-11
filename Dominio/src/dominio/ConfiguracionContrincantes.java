/**
 * Paquete dominio
 */
package dominio;
/**
 * Clase encargada de configurar a los contrincantes.
 * 
 */
public class ConfiguracionContrincantes {
    
    private IDatosJugador[] jugadoresPartida;
    /**
     * Constructor con el arreglo del jugador
     * 
     * @param jugadoresPartida 
     */
    public ConfiguracionContrincantes(IDatosJugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }
    /**
     * Se obtienen los jugadores de la partida. 
     * 
     * @return 
     */
    public IDatosJugador[] getJugadoresPartida() {
        return jugadoresPartida;
    }
    /**
     * Se establece los jugadores de la partida
     * 
     * @param jugadoresPartida 
     */
    public void setJugadoresPartida(IDatosJugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }
    /**
     * Devuelve los configuracion contrincante. 
     * 
     * @return jugadoresPartida.
     */
    @Override
    public String toString() {
        return "ConfiguracionContrincantes{" + "jugadoresPartida=" + jugadoresPartida + '}';
    }
        
}
