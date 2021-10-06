package dominio;

import java.util.List;
/**
 * Clase que establece la dimension de los cuadros  
 * 
 * @author Administrador
 */
public class Tablero {
    
    private int dimension;
    private List<Cuadro> listaCuadros;

    public Tablero() {
        
    }
    /**
     * Constructor que inicializa la dimencion y la lista de los cuadros.
     * 
     * @param dimension
     * @param listaCuadros 
     */
    public Tablero(int dimension, List<Cuadro> listaCuadros) {
        this.dimension = dimension;
        this.listaCuadros = listaCuadros;
    }
    /**
     * Se obtienen las dimensiones 
     * 
     * @return dimension
     */
    public int getDimension() {
        return dimension;
    }
    /**
     * Se establecen las dimensiones
     * 
     * @param dimension 
     */
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    /**
     * Se obtiene la lista de cuadros 
     * 
     * @return listaCuadros
     */
    public List<Cuadro> getListaCuadros() {
        return listaCuadros;
    }
    /**
     * Se establece la lista de cuadros
     * 
     * @param listaCuadros 
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
