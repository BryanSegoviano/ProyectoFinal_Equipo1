/**
 * Paquete conectividad
 */
package conectividad;

/**
 * Imports utilizados
 */
import dominio.Linea;
import dominio.Jugador;
import dominio.Cuadro;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Clase JugadorHandler
 *
 */
public class JugadorHandler {

    private ObjectInputStream ois;

    /**
     * Constructor que inicializa la información al valor de sus parametros
     *
     * @param input
     */
    public JugadorHandler(ObjectInputStream input) {
        this.ois = input;
    }

    /**
     * Método que recibe objeto del tipo linea para poder regresarla a las
     * clases correspondientes
     *
     * @return Linea que se obtuvo
     */
    public Linea recibirLinea() {
        try {
            Linea linea = (Linea) ois.readObject();
            return linea;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

    /**
     * Método que recibe objeto del jugador linea para poder regresarla a las
     * clases correspondientes
     *
     * @return Jugador que se obtuvo
     */
    public Jugador recibirJugador() {
        try {
            Jugador jugador = (Jugador) this.ois.readObject();
            return jugador;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

    /**
     * Método que recibe objeto del tipo Cuadro para poder regresarla a las
     * clases correspondientes
     *
     * @return Cuadro que se obtuvo
     */
    public Cuadro recibirCuadro() {
        try {
            Cuadro cuadro = (Cuadro) this.ois.readObject();
            return cuadro;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public Object[] recibirLineaCuadro() {
        try {
            Object[] arreglo = (Object[]) this.ois.readObject();
            Cuadro cuadro =  (Cuadro) arreglo[0];
            Linea linea = (Linea) arreglo[1];
            return arreglo;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

}
