/**
 * Paquete dibujaFiguras
 */
package dibujaFiguras;

/**
 * Imports utilizados
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Clase FiguraPuntos que extiende de la clase abstracta Figura para hacer uso
 * de sus métodos
 *
 */
public class FiguraPuntos extends Figura {

    /**
     * Método paint para pintar sobre un panel
     *
     * @param g panel a pintar
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.setStroke(new BasicStroke(2));
        //Datos de los cuadrados
        int coordY = 0;

        //Datos del circulo
        int coordX = 0;
        for (int i = 0; i < 41; i++) {
            for (int j = 0; j < 41; j++) {
                this.dibujarCirculo(coordX, coordY, g2d);

                coordY += 16;
            }
            coordY = 0;

            coordX += 20;
        }

    }

    /**
     * Método para dibujar en el tablero circulos/puntos
     *
     * @param x coordenada inicial eje x
     * @param y coordenada inicial eje y
     * @param g panel donde se dibujara
     */
    public void dibujarCirculo(int x, int y, Graphics2D g) {
        g.setStroke(new BasicStroke(1));
        g.setColor(Color.BLACK);
        Ellipse2D.Double elipse = new Ellipse2D.Double(x, y, 5, 5);
        g.fill(elipse);
        g.draw(elipse);
    }

    /**
     * Método para dibujar
     *
     * @param dato1 dato 1
     * @param dato2 dato 2
     * @param g panel donde se dibujara
     */
    @Override
    public void dibujar(int dato1, int dato2, Graphics2D g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
