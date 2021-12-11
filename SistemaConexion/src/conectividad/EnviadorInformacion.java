package conectividad;

import dominio.Cuadro;
import dominio.Jugador;
import dominio.Linea;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EnviadorInformacion {

    private ObjectOutputStream oos;

    public EnviadorInformacion(ObjectOutputStream output) {
        this.oos = output;
    }

    public void enviaLinea(Linea linea) {
        try {
            this.oos.writeObject(linea);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void enviaJugador(Jugador jugador) {
        try {
            this.oos.writeObject(jugador);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void enviarCuadro(Cuadro cuadro) {
        try {
            this.oos.writeObject(cuadro);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
