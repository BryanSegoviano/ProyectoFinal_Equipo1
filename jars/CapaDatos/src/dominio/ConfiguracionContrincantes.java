package dominio;

public class ConfiguracionContrincantes {
    
    private Jugador[] jugadoresPartida;

    public ConfiguracionContrincantes(Jugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }

    public Jugador[] getJugadoresPartida() {
        return jugadoresPartida;
    }

    public void setJugadoresPartida(Jugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }

    @Override
    public String toString() {
        return "ConfiguracionContrincantes{" + "jugadoresPartida=" + jugadoresPartida + '}';
    }
        
}
