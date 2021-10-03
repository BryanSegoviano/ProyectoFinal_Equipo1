package util;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class DibujadoTablero extends Canvas {
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.setStroke(new BasicStroke(2));
        //Datos de los cuadrados
        int y = 0;
//        for (int i = 0; i < 40; i++) {
//            this.dibujaCuadrado(0, y, 17, 16, 40, g2d);
//            y += 16;
//        }

//        Datos del circulo
        int x = 0;
        y = 0;
        for (int i = 0; i < 41; i++) {
            for (int j = 0; j < 41; j++) {
                this.dibujarCirculo(x, y, g2d);
                
                y += 16;
            }
            y = 0;
            
            x += 20;
        }
        this.dibujaCuadrado(x, y, 50, 50, 41, g2d);
    }
    
    public void dibujaCuadrado(int x, int y, int ancho, int alto, int cuantos, Graphics2D g) {
        Rectangle rect = new Rectangle();
        for (int i = 0; i < cuantos; i++) {
            rect.setBounds(x, y, ancho, alto);
            g.draw(rect);
            x += ancho;
        }
    }
    
    public void dibujarCirculo(int x, int y, Graphics2D g) {
        g.setStroke(new BasicStroke(1));
        g.setColor(Color.BLACK);
        Ellipse2D.Double elipse = new Ellipse2D.Double(x, y, 5, 5);
        g.fill(elipse);
        g.draw(elipse);
    }
    
   public void dibujarLinea(int x, int y, int x2, int y2 ,Graphics2D g, Color color) {
        g.setStroke(new BasicStroke(3));
        g.setColor(color);
        g.drawLine(x, y, x2, y2);
//        Line2D linea1 = new Line2D.Double(x, y, x + 20, y);//función para dibujar la línea
//        g.draw(linea1);  //la función draw() permite dibujar cualquier elemento creado 
    }
    
}
