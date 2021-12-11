package conectividad;

import dominio.Linea;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class GestionConexion implements IGestionConexion {

    private EnviadorInformacion enviador;
    private JugadorHandler recibidor;

    @Override
    public void inicializarConexion() {
        Scanner tec;
        ServerSocket serverSocket;
        Socket scServer;
        tec = new Scanner(System.in);
        try {
            int puerto;
            System.out.print("-> Puerto de su servidor: ");
            puerto = tec.nextInt();
            serverSocket = new ServerSocket(puerto);
            System.out.println("Servidor iniciado con puerto " + puerto);
            //
            tec = new Scanner(System.in);
            System.out.print("-> Puerto al que se quiere comunicar: ");
            int puertoCliente = tec.nextInt();
            Socket clientSocket = new Socket("localhost", puertoCliente);
            //
            scServer = serverSocket.accept();
            System.out.println("Conexión realizada con otro Peer");

            ObjectOutputStream oos = new ObjectOutputStream(scServer.getOutputStream());
            this.enviador = new EnviadorInformacion(oos);

            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
            this.recibidor = new JugadorHandler(ois);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public String gestionInformacion() {
        return null;
    }

    @Override
    public EnviadorInformacion getEnviador() {
        return this.enviador;
    }

    @Override
    public JugadorHandler getRecibidor() {
        return this.recibidor;
    }

    
    
}
