package dibujaFiguras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class FiguraPuntos implements Figura {

    /**
     * Método que dibuja los ciruclos base para el juego del timbiriche en el
     * panel
     *
     * @param x1 Coordenada en eje X
     * @param y1 Coordenada en eje Y
     * @param x2 Coordenada en eje Y
     * @param y2 Coordenada en eje Y
     * @param g2d Panel en el que se dibujara
     * @param color color de la figura
     */
    @Override
    public void dibujar(int x1, int y1, int x2, int y2, Graphics2D g2d, Color color) {
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.BLACK);
        Ellipse2D.Double elipse = new Ellipse2D.Double(x1, y1, 5, 5);
        g2d.fill(elipse);
        g2d.draw(elipse);
    }
    
    public void DibujaTablero(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.setStroke(new BasicStroke(2));
        //Datos de los cuadrados
        int y = 0;

        //Datos del circulo
        int x = 0;
        y = 0;
        for (int i = 0; i < 41; i++) {
            for (int j = 0; j < 41; j++) {
                this.dibujar(x, y, x, y, g2d, Color.yellow);
                y += 16;
            }
            y = 0;

            x += 20;
        }
        //this.dibujaCuadrado(x, y, 50, 50, 41, g2d);
    }

}
