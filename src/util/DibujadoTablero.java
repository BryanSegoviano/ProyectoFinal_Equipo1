/**
 * Paquete util
 */
package util;

/**
 * Imports utilizados
 */
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

/**
 * Clase encargada de los metodos de dibujado en tablero con uso de java2d.
 *
 * @author Administrador
 */
public class DibujadoTablero extends Canvas {

    /**
     * Metodo que se encarga de hacer el dibujado de cuadrado.
     *
     * @param g Grafica que recibe
     */
    @Override
    public void paint(Graphics g) {
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
                this.dibujarCirculo(x, y, g2d);

                y += 16;
            }
            y = 0;

            x += 20;
        }
        this.dibujaCuadrado(x, y, 50, 50, 41, g2d);
    }

    /**
     * Método que dibuja el cuadrado en el panel según las coordenadas y el
     * panel que recibe.
     *
     * @param x Coordenada en eje X
     * @param y Coordenada en eje y
     * @param ancho Ancho de línea
     * @param alto Alto de línea
     * @param cuantos Tamanio
     * @param g Panel en el que se dibujara
     */
    public void dibujaCuadrado(int x, int y, int ancho, int alto, int cuantos, Graphics2D g) {
        Rectangle rect = new Rectangle();
        for (int i = 0; i < cuantos; i++) {
            rect.setBounds(x, y, ancho, alto);
            g.draw(rect);
            x += ancho;
        }
    }

    /**
     * Método que dibuja los ciruclos base para el juego del timbiriche en el
     * panel
     *
     * @param x Coordenada en eje X
     * @param y Coordenada en eje Y
     * @param g Panel en el que se dibujara
     */
    public void dibujarCirculo(int x, int y, Graphics2D g) {
        g.setStroke(new BasicStroke(1));
        g.setColor(Color.BLACK);
        Ellipse2D.Double elipse = new Ellipse2D.Double(x, y, 5, 5);
        g.fill(elipse);
        g.draw(elipse);
    }

    /**
     * Método que dibujara las líneas correspondientes según el jugador, esto
     * para poder formar los cuadrados en el tablero de timbiriche
     *
     * @param x Coordenada de inicio en eje X
     * @param y Coordenada de inicio en eje Y
     * @param x2 Coordenada final del eje X
     * @param y2 Coordenada final del eje Y
     * @param g Panel en el que se dibujara
     * @param color Color del cual se pintara la línea
     */
    public void dibujarLinea(int x, int y, int x2, int y2, Graphics2D g, Color color) {
        g.setStroke(new BasicStroke(3));
        g.setColor(color);
        g.drawLine(x, y, x2, y2);
    }

    /**
     * Método que valida los puntos en el tablero, para darle formato a la línea
     * en relación con el circulo
     *
     * @param x Coordenada en eje X
     * @param y Coordenada en eje Y
     * @return Arreglo de enteros con validación
     */
    public int[] validaCoordenadas(int x, int y) {
        int arreglo[] = new int[2];
        arreglo[0] = x;
        arreglo[1] = y;
        int aux;
        //Coordenadas bien aplastadas
        if ((x % 20) - 2 == 0 && (y % 16) - 2 == 0) {
        } else {
            //Error en coordenada x
            if ((x % 20) - 2 != 0) {
                //Cerca de un punto a la derecha
                if (x % 20 > 10) {
                    aux = 20 - (x % 20);
                    arreglo[0] = x + aux + 2;
                } else {
                    aux = (x % 20) - 2;
                    arreglo[0] = x - aux;
                }

            }
            //Error en coordenada y
            if ((y % 16) - 2 != 0) {
                if (y % 16 > 8) {
                    aux = 16 - (y % 16);
                    arreglo[1] = y + aux + 2;
                } else {
                    aux = (y % 16) - 2;
                    arreglo[1] = y - aux;
                }
            }
        }
        return arreglo;
    }

    /**
     * Metodo encargado de verificar coordenadas fuera de lugar.
     *
     * @param x1 coordenada x1 Primera coordenada en eje X clickeada
     * @param y1 coordenada y1 Primera coordenada en eje Y clickeada
     * @param x2 coordenada x2 Segunda coordenada en eje X clickeada
     * @param y2 coordenada y2 Segunda coordenada en eje Y clickeada
     * @return arreglo.
     */
    public int[] validaSegundoClick(int x1, int y1, int x2, int y2) {
        int arreglo[];
        int arreglo2[];
        arreglo = validaCoordenadas(x1, y1);
        arreglo2 = validaCoordenadas(x2, y2);
        x1 = arreglo[0];
        y1 = arreglo[1];
        //verifica X
        //x2 esta fuera de rango
        if (x2 + 20 != x1 || x2 - 20 != x1) {
            //x2 muy a la derecha, mover a la izquierda
            int diferencia = x1 - x2;
            if (diferencia > 0) {
                x2 = x1 + 20;
            } else {
                x2 = x1 - 20;
            }
        }
        //verifica Y
        if (y2 + 16 != y1 || y2 - 16 != y1) {
            //y2 muy a la derecha, mover a la izquierda
            int diferencia = y1 - y2;
            if (diferencia > 0) {
                y2 = y1 + 16;
            } else {
                y2 = y1 - 16;
            }
        }

        arreglo[0] = x2;
        arreglo[1] = y2;
        return arreglo;
    }

}
