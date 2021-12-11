/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectividad;

/**
 *
 * @author l3tal
 */
public interface IGestionConexion {
    public void inicializarConexion();
    public String gestionInformacion();
    public EnviadorInformacion getEnviador();
    public JugadorHandler getRecibidor();
    
}
