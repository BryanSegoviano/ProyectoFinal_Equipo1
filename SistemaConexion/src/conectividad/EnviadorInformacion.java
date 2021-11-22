package conectividad;

import dominio.Cuadro;
import dominio.Jugador;
import dominio.Linea;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EnviadorInformacion extends Thread{
    
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter printWriter;
    
    public void run(){
        
    }

    public Linea enviaLinea(){
        Linea linea = new Linea();
        return linea;
    }
    
    public Jugador enviaJugador(){
        Jugador jugador = new  Jugador();
        return jugador;
    }
    
    public Cuadro enviarCuadro(){
        Cuadro cuadro = new Cuadro();
        return cuadro;
    }
    
}
