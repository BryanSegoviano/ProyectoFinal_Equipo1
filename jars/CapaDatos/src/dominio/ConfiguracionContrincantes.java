package dominio;
/**
 * Clase encargada de configurar a los contrincantes.
 * 
 * @author Administrador
 */
public class ConfiguracionContrincantes {
    
    private Jugador[] jugadoresPartida;
    /**
     * Constructor con el arreglo del jugador
     * 
     * @param jugadoresPartida 
     */
    public ConfiguracionContrincantes(Jugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }
    /**
     * Se obtienen los jugadores de la partida. 
     * 
     * @return 
     */
    public Jugador[] getJugadoresPartida() {
        return jugadoresPartida;
    }
    /**
     * Se establece los jugadores de la partida
     * 
     * @param jugadoresPartida 
     */
    public void setJugadoresPartida(Jugador[] jugadoresPartida) {
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
