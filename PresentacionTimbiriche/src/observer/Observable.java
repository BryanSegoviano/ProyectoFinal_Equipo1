/**
 * Paquete observer
 */
package observer;

/**
 * Clase interface Observable donde se tendran los métodos que implementaran
 * otras clases
 *
 */
public interface Observable {

    /**
     * Método para establecer cambios
     */
    public void setChanged();

    /**
     * Método para notificar cambios
     */
    public void notificar();
}
