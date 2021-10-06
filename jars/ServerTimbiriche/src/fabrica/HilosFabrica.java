/**
 * Paquete fabrica
 */
package fabrica;

/**
 * Imports utilizados
 */
import fachada.Fachada;
import fachada.IFachada;

/**
 * Clase HilosFabrica que se encarga de regresas instancias de IFachada
 *
 */
public class HilosFabrica {

    /**
     * Método getInstance que crea y regresa una instancia del tipo IFachada
     *
     * @return Instancia IFachada
     */
    public static IFachada getInstance() {
        return new Fachada();
    }

}
