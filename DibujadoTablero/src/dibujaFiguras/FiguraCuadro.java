/**
 * Paquete dibujaFiguras
 */
package dibujaFiguras;

/**
 * Imports utilizados
 */
import dominio.Linea;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.List;

/**
 * Clase figuraCuadro que extiende de figura para hacer uso de sus métodos
 * abstractos
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class FiguraCuadro extends Figura {

    /**
     * Método para pintar un cuadro
     *
     * @param x coordenada inicial eje x
     * @param y coordenada inicial eje y
     * @param x2 coordenada secundaria eje x
     * @param y2 coordenada secundaria eje y
     * @param g panel a pintar
     * @param color color del cuadro
     */
    public void paint(int x, int y, int x2, int y2, Graphics2D g, Color color) {

        Graphics2D g2d = (Graphics2D) g;
        this.dibujaCuadro(x, y, g2d, color);
    }

    /**
     * Método para dibujar
     *
     * @param dato1 dato 1
     * @param dato2 dato 2
     * @param g panel a dibujar
     */
    @Override
    public void dibujar(int dato1, int dato2, Graphics2D g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Método para validar las lineas de un cuadro dentro de un panel, regresa
     * un entero dependiendo de la situación
     *
     * @param listaLineas Lista de lineas que contienen coordenadas
     * @param x1 coordenada inicial eje x
     * @param y1 coordenada inicial eje y
     * @param x2 coordenada secundaria eje x
     * @param y2 coordenada secundaria eje y
     * @return dato del tipo int segun la situacion
     */
    public int validaCuadro(List<Linea> listaLineas, int x1, int y1, int x2, int y2) {
        //Si la ultima línea fue vertical derecha
        if ((x2 == x1 && y2 > y1) || (x2 == x1 && y2 < y1)) {

            for (int i = 0; i < listaLineas.size(); i++) {
                int[] arregloAuxA = listaLineas.get(i).getCoordenadasA();
                int[] arregloAuxB = listaLineas.get(i).getCoordenadasB();

                //Verifica linea horizontal superior DERECHA
                if ((x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                        || (x1 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                        || (x1 + 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                        || (x1 + 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])) {

                    for (int j = 0; j < listaLineas.size(); j++) {
                        arregloAuxA = listaLineas.get(j).getCoordenadasA();
                        arregloAuxB = listaLineas.get(j).getCoordenadasB();

                        //Verifica linea horizontal inferior DERECHA
                        if ((x1 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                || (x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                || (x1 + 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                || (x1 + 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])) {

                            for (int k = 0; k < listaLineas.size(); k++) {
                                arregloAuxA = listaLineas.get(k).getCoordenadasA();
                                arregloAuxB = listaLineas.get(k).getCoordenadasB();

                                //Verifica linea vertical derecha DERECHA
                                if ((x1 + 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                        || (x1 + 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                        || (x1 + 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                        || (x1 + 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])) {

                                    return 0;
                                }
                            }
                        }
                    }

                } else {
                    //Verifica linea horizontal superior IZQUIERDA
                    if ((x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                            || (x1 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                            || (x1 - 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                            || (x1 - 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])) {

                        for (int j = 0; j < listaLineas.size(); j++) {
                            arregloAuxA = listaLineas.get(j).getCoordenadasA();
                            arregloAuxB = listaLineas.get(j).getCoordenadasB();

                            //Verifica linea horizontal inferior IZQUIERDA
                            if ((x1 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                    || (x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                    || (x1 - 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                    || (x1 - 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])) {

                                for (int k = 0; k < listaLineas.size(); k++) {
                                    arregloAuxA = listaLineas.get(k).getCoordenadasA();
                                    arregloAuxB = listaLineas.get(k).getCoordenadasB();

                                    //Verifica linea vertical derecha IZQUIERDA
                                    if ((x1 - 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                            || (x1 - 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                            || (x1 - 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                            || (x1 - 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])) {

                                        return 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else { //Si fue horizontal

            for (int i = 0; i < listaLineas.size(); i++) {
                int[] arregloAuxA = listaLineas.get(i).getCoordenadasA();
                int[] arregloAuxB = listaLineas.get(i).getCoordenadasB();

                //Verifica linea vertical izquierda
                if ((x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                        || (x1 - 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                        || (x1 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                        || (x1 - 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])) {

                    for (int j = 0; j < listaLineas.size(); j++) {
                        arregloAuxA = listaLineas.get(j).getCoordenadasA();
                        arregloAuxB = listaLineas.get(j).getCoordenadasB();

                        //Verifica linea horizontal 
                        if ((x1 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                || (x1 - 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                || (x1 + 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                || (x1 + 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])) {
                            for (int k = 0; k < listaLineas.size(); k++) {
                                arregloAuxA = listaLineas.get(k).getCoordenadasA();
                                arregloAuxB = listaLineas.get(k).getCoordenadasB();

                                //Verifica linea vertical derecha
                                if ((x1 + 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                        || (x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 + 16 == arregloAuxB[1])
                                        || (x1 + 20 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                        || (x1 == arregloAuxA[0] && y1 + 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 == arregloAuxB[1])) {
                                    return 2;
                                }
                            }

                        }
                    }
                } else {
                    //Verifica linea vertical DERECHA
                    if ((x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                            || (x1 + 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                            || (x1 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 == arregloAuxB[1])
                            || (x1 + 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])) {

                        for (int j = 0; j < listaLineas.size(); j++) {
                            arregloAuxA = listaLineas.get(j).getCoordenadasA();
                            arregloAuxB = listaLineas.get(j).getCoordenadasB();

                            //Verifica linea horizontal DERECHA
                            if ((x1 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                    || (x1 + 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                    || (x1 - 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 + 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                    || (x1 - 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])) {
                                for (int k = 0; k < listaLineas.size(); k++) {
                                    arregloAuxA = listaLineas.get(k).getCoordenadasA();
                                    arregloAuxB = listaLineas.get(k).getCoordenadasB();

                                    //Verifica linea vertical DERECHA
                                    if ((x1 - 20 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                            || (x1 == arregloAuxA[0] && y1 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 - 16 == arregloAuxB[1])
                                            || (x1 - 20 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 == arregloAuxB[0] && y2 == arregloAuxB[1])
                                            || (x1 == arregloAuxA[0] && y1 - 16 == arregloAuxA[1] && x2 - 20 == arregloAuxB[0] && y2 == arregloAuxB[1])) {
                                        return 3;
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }

        return -1;

    }

    /**
     * Método para poder dibujar un cuadro según el valor de sus parametros
     *
     * @param x coordenada inicial eje x
     * @param y coordenada inicial eje y
     * @param g panel donde se pintara
     * @param color color de la figura
     */
    public void dibujaCuadro(int x, int y, Graphics2D g, Color color) {
        g.setStroke(new BasicStroke(2));
        g.setColor(color);
        Rectangle cuadro = new Rectangle(x, y, 20, 16);
        g.fill(cuadro);
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.draw(cuadro);
    }
}
