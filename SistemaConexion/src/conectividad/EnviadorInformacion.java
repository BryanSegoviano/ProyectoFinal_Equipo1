/**
 * Paquete conectividad
 */
package conectividad;

/**
 * Imports utilizados
 */
import dominio.Cuadro;
import dominio.Jugador;
import dominio.Linea;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Clase EnviadorInformacion para poder enviar los datos a las demas clases
 */
public class EnviadorInformacion {

    private ObjectOutputStream oos;

    /**
     * Constructor que inicialia los datos al valor de su parametro
     *
     * @param output
     */
    public EnviadorInformacion(ObjectOutputStream output) {
        this.oos = output;
    }

    /**
     * Método que envia objeto del tipo Linea
     *
     * @param linea Linea que se enviara
     */
    public void enviaLinea(Linea linea) {
        try {
            this.oos.writeObject(linea);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Método que envia objeto del tipo jugador
     *
     * @param jugador Jugador que se enviara
     */
    public void enviaJugador(Jugador jugador) {
        try {
            this.oos.writeObject(jugador);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Método que envia objeto del tipo Cuadro
     *
     * @param cuadro Cuadro que se enviara
     */
    public void enviarCuadro(Cuadro cuadro) {
        try {
            this.oos.writeObject(cuadro);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
