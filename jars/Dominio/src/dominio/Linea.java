package dominio;

/**
 * Clase linea con sus metodos get y set
 * 
 * @author Administrador
 */
public class Linea {
    
    private float coordenadasHorizontales;
    private float coordenadasVerticales;

    public Linea() {
    }
    /**
     * Constructor que inicializa los atributos de la linea
     * 
     * @param coordenadasHorizontales
     * @param coordenadasVerticales 
     */
    public Linea(float coordenadasHorizontales, float coordenadasVerticales) {
        this.coordenadasHorizontales = coordenadasHorizontales;
        this.coordenadasVerticales = coordenadasVerticales;
    }
    /**
     * Se obtienen las coordenadas horizontales
     * 
     * @return coordenadasHorizontales
     */
    public float getCoordenadasHorizontales() {
        return coordenadasHorizontales;
    }
    /**
     * Se establecen las coordenadas horizontales
     * 
     * @param coordenadasHorizontales 
     */
    public void setCoordenadasHorizontales(float coordenadasHorizontales) {
        this.coordenadasHorizontales = coordenadasHorizontales;
    }
    /**
     * Se obtienen las coordenadas verticales
     * 
     * @return coordenadasVerticales
     */
    public float getCoordenadasVerticales() {
        return coordenadasVerticales;
    }
    /**
     * Se establecen las coordenadas verticales 
     * 
     * @param coordenadasVerticales 
     */
    public void setCoordenadasVerticales(float coordenadasVerticales) {
        this.coordenadasVerticales = coordenadasVerticales;
    }
    
}
