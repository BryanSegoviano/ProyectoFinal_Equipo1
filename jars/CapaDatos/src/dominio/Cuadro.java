package dominio;

public class Cuadro {

    private int idCuadro;
    private Jugador jugador;
    private Linea[] listaLineas;

    public Cuadro() {
    }

    public Cuadro(int idCuadro, Jugador jugador, Linea[] listaLineas) {
        this.idCuadro = idCuadro;
        this.jugador = jugador;
        this.listaLineas = listaLineas;
    }

    public int getIdCuadro() {
        return idCuadro;
    }

    public void setIdCuadro(int idCuadro) {
        this.idCuadro = idCuadro;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Linea[] getListaLineas() {
        return listaLineas;
    }

    public void setListaLineas(Linea[] listaLineas) {
        this.listaLineas = listaLineas;
    }

}
