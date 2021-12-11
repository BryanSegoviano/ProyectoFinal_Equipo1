/**
 * Paquete conectividad
 */
package conectividad;

/**
 * Clase interface que tendra métodos que emplearan otras clases
 *
 */
public interface IGestionConexion {

    public void inicializarConexion();

    public String gestionInformacion();

    public EnviadorInformacion getEnviador();

    public JugadorHandler getRecibidor();

}
