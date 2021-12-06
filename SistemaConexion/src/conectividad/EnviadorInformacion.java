package conectividad;

import dominio.Cuadro;
import dominio.Jugador;
import dominio.Linea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnviadorInformacion extends Thread {

    Socket socket;
    InputStream inputStream;
    
    public EnviadorInformacion(int puertos) {
        //Se asignan los puertos
        this.socket = new Socket();
    }

    @Override
    public void run() {
        try {
            while (true) {
                //El accept es para que el sockect se quede escuchando a respuestas
//                Socket socket = this.serverSocket.accept();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
                while (true) {
                    //se manda las lineas que se leyeron
                       this.enviarMsj(printWriter, bufferedReader);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void enviarMsj(PrintWriter printWriter, BufferedReader bufferedReader){
        try {
            printWriter.println(bufferedReader.readLine());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public Linea enviaLinea() {
        Linea linea = new Linea();
        return linea;
    }

    public Jugador enviaJugador() {
        Jugador jugador = new Jugador();
        return jugador;
    }

    public Cuadro enviarCuadro() {
        Cuadro cuadro = new Cuadro();
        return cuadro;
    }

}
