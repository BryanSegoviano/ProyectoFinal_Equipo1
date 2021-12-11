package fabrica;

import conectividad.GestionConexion;
import conectividad.IGestionConexion;

public class FabricaGestionConexion {
    
    public static IGestionConexion crearInstancia(){
        return new GestionConexion();
    }
}
