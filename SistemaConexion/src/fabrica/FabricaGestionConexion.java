/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import conectividad.GestionConexion;
import conectividad.IGestionConexion;

/**
 *
 * @author l3tal
 */
public class FabricaGestionConexion {
    
    public static IGestionConexion crearInstancia(){
        IGestionConexion conexion= new GestionConexion();
        return conexion;
    }
}
