package fachada;

import fabrica.HilosFabrica;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IFachada fachada = HilosFabrica.getInstance();
        
        fachada.crearPartida();
        fachada.unirsePartida();
    }
    
}
