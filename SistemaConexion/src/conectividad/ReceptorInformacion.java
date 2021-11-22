package conectividad;

import java.io.BufferedReader;
import java.net.Socket;
import dominio.Linea;
import dominio.Jugador;
import dominio.Cuadro;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReceptorInformacion extends Thread {

    private BufferedReader bufferedReader;

    public ReceptorInformacion(Socket socket) {
        try {
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void run() {

    }

    public Linea recibirLinea() {
        Linea linea = new Linea();
        return linea;
    }

    public Jugador recibirJugador() {
        Jugador jugador = new Jugador();
        return jugador;
    }

    public Cuadro recibirCuadro() {
        Cuadro cuadrado = new Cuadro();
        return cuadrado;
    }
}
