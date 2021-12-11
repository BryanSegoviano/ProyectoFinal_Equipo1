/**
 * Paquete dibujaFiguras
 */
package dibujaFiguras;

/**
 * Import utilizados
 */
import java.awt.Canvas;
import java.awt.Graphics2D;

/**
 * Clase abstract Figura que extiende da Canvas para hacer uso de sus métodos
 */
public abstract class Figura extends Canvas {

    /**
     * Método para dibujar
     *
     * @param dato1 Coordenada 1
     * @param dato2 Coordenada 2
     * @param g Panel donde se dibujara
     */
    public abstract void dibujar(int dato1, int dato2, Graphics2D g);

}
