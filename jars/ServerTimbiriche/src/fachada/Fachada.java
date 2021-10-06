package fachada;

/**
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class Fachada implements IFachada{

    private final HiloCrearPartida hiloCrearPartida;
    private final HiloUnirsePartida hiloUnirsePartida;
    
    public Fachada(){
        this.hiloCrearPartida = new HiloCrearPartida();
        this.hiloUnirsePartida = new HiloUnirsePartida();
    }
    
    @Override
    public void crearPartida() {
        this.hiloCrearPartida.start();
    }

    @Override
    public void unirsePartida() {
        this.hiloUnirsePartida.start();
    }
    
}
