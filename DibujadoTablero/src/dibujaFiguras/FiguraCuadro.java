package dibujaFiguras;

import dominio.Jugador;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class FiguraCuadro implements Figura {

    public Jugador jugador;
    //public ListaLineas listaLineas;

    @Override
    public void dibujar(int x1, int y1, int x2, int y2, Graphics2D g2d, Color color) {
        Rectangle rect = new Rectangle();
        //for (int i = 0; i < cuantos; i++) {
        rect.setBounds(x1, y1, 20, 16);
        g2d.draw(rect);
        //x += ancho;
        //}
    }
}
