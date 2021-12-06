package dibujaFiguras;

import java.awt.Canvas;
import java.awt.Graphics2D;

public abstract class Figura extends Canvas {
    
    public abstract void dibujar(int dato1, int dato2, Graphics2D g);
    
}

        