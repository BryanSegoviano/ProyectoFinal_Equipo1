package dominio;

import java.io.Serializable;

/**
 * Clase linea con sus metodos get y set
 *
 * @author Administrador
 */
public class Linea implements Serializable {

    private int[] arregloCoordenadasA = new int[2];
    private int[] arregloCoordenadasB = new int[2];

    public Linea() {
    }

    /**
     * Constructor que inicializa los valores de las coordenadas de una linea,
     * desde su punto A al punto B
     *
     * @param x1 primer coordenaa en x
     * @param x2 segunda coordenada en x
     * @param y1 primer coordenada en y
     * @param y2 segunda coordenada en y
     */
    public Linea(int x1, int y1, int x2, int y2) {
        this.arregloCoordenadasA[0] = x1;
        this.arregloCoordenadasA[1] = y1;
        this.arregloCoordenadasB[0] = x2;
        this.arregloCoordenadasB[1] = y2;
    }

    /**
     * Se obtienen las coordenadas del primer punto seleccionado
     *
     * @return arregloCoordenadasA
     */
    public int[] getCoordenadasA() {
        return arregloCoordenadasA;
    }

    /**
     *
     * @param x1 primer coordenada en x
     * @param y1 primer coordenada en y
     */
    public void setCoordenadasA(int x1, int y1) {
        this.arregloCoordenadasA[0] = x1;
        this.arregloCoordenadasA[1] = y1;
    }

    /**
     * Se obtienen las coordenadas del segundo punto seleccionado
     *
     * @return arregloCoordenadasB
     */
    public int[] getCoordenadasB() {
        return arregloCoordenadasB;
    }

    /**
     * Se establecen las coordenadas verticales
     *
     * @param x2
     * @param y2
     */
    public void setCoordenadasB(int x2, int y2) {
        this.arregloCoordenadasB[0] = x2;
        this.arregloCoordenadasB[1] = y2;
    }

    @Override
    public String toString() {
        return "Linea{" + "arregloCoordenadasA=" + arregloCoordenadasA + ", arregloCoordenadasB=" + arregloCoordenadasB + '}';
    }
    
}
