/**
 * Paquete fabrica
 */
package fabrica;

/**
 * Imports utilizados
 */
import conectividad.GestionConexion;
import conectividad.IGestionConexion;

/**
 * Clase FabricaGestionConexion que regresara instancias de la clase
 * GestionConexion
 *
 */
public class FabricaGestionConexion {

    /**
     * Método para crear instancias
     *
     * @return instancia creada
     */
    public static IGestionConexion crearInstancia() {
        return new GestionConexion();
    }
}
