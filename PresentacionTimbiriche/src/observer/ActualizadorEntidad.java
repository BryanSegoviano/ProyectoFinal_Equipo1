/**
 * Paquete observer
 */
package observer;

/**
 * Clase ActualizarEntiendad que implemente la clase Observable para hacer uso
 * de sus métodos
 *
 */
public class ActualizadorEntidad implements Observable {

    /**
     * Método setChanged
     */
    @Override
    public void setChanged() {
        System.out.println("Cambios establecidos");
    }

    /**
     * Método para notificar cambios
     */
    @Override
    public void notificar() {
        System.out.println("Cambios realizados");
    }

}
