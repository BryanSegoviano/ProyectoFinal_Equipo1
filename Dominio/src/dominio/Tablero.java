/**
 * Paquete dominio
 */
package dominio;

import java.util.List;

/**
 * Clase que establece la dimension de los cuadros
 *
 */
public class Tablero {

    private int dimension;
    private List<Cuadro> listaCuadros;

    public Tablero() {

    }

    /**
     * Constructor que inicializa la dimencion y la lista de los cuadros.
     *
     * @param dimension Dimension del tablero 
     * @param listaCuadros Lista de cuadros 
     */
    public Tablero(int dimension, List<Cuadro> listaCuadros) {
        this.dimension = dimension;
        this.listaCuadros = listaCuadros;
    }

    /**
     * Se obtienen las dimensiones
     *
     * @return dimension Regresa la dimension del tablero
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * Se establecen las dimensiones
     *
     * @param dimension Dimension a establecer 
     */
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    /**
     * Se obtiene la lista de cuadros
     *
     * @return listaCuadros Lista de cuadros 
     */
    public List<Cuadro> getListaCuadros() {
        return listaCuadros;
    }

    /**
     * Se establece la lista de cuadros
     *
     * @param listaCuadros Lista de cuadros a establecer
     */
    public void setListaCuadros(List<Cuadro> listaCuadros) {
        this.listaCuadros = listaCuadros;
    }

    /**
     * Devuelve los atributos del tablero
     *
     * @return dimension, listaCuadros
     */
    @Override
    public String toString() {
        return "Tablero{" + "dimension=" + dimension + ", listaCuadros=" + listaCuadros + '}';
    }

}
