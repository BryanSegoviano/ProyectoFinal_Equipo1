package dominio;


public class Linea {
    
    private float coordenadasHorizontales;
    private float coordenadasVerticales;

    public Linea() {
    }
    
    public Linea(float coordenadasHorizontales, float coordenadasVerticales) {
        this.coordenadasHorizontales = coordenadasHorizontales;
        this.coordenadasVerticales = coordenadasVerticales;
    }

    public float getCoordenadasHorizontales() {
        return coordenadasHorizontales;
    }

    public void setCoordenadasHorizontales(float coordenadasHorizontales) {
        this.coordenadasHorizontales = coordenadasHorizontales;
    }

    public float getCoordenadasVerticales() {
        return coordenadasVerticales;
    }

    public void setCoordenadasVerticales(float coordenadasVerticales) {
        this.coordenadasVerticales = coordenadasVerticales;
    }
    
}
