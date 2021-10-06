/**
 * Paquete fabrica
 */
package fabrica;

import fachada.Fachada;
import fachada.IFachada;

/**
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class HilosFabrica {

    public static IFachada getInstance() {
        return new Fachada();
    }
    
}
