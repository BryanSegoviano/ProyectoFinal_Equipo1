package conectividad;

import dominio.Linea;
import dominio.Jugador;
import dominio.Cuadro;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JugadorHandler {

    private ObjectInputStream ois;

    public JugadorHandler(ObjectInputStream input) {
        this.ois = input;
    }

    public Linea recibirLinea() {
        try {
            Linea linea = (Linea) ois.readObject();
            return linea;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public Jugador recibirJugador() {
        try {
            Jugador jugador = (Jugador) this.ois.readObject();
            return jugador;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public Cuadro recibirCuadro() {
        try {
            Cuadro cuadro = (Cuadro) this.ois.readObject();
            return cuadro;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

}
