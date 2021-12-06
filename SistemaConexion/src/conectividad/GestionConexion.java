package conectividad;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionConexion {

//    DataInputStream inServer;
//    DataOutputStream outServer;
    public void inicializarConexion() {
        Scanner tec;
        ServerSocket serverSocket;
        Socket scServer;
        PrintWriter outServer;
        BufferedReader inServer;
        tec = new Scanner(System.in);
        try {
            int puerto;
            System.out.print("Ponga puerto del su servidor: ");
            puerto = tec.nextInt();
            serverSocket = new ServerSocket(puerto);
            System.out.println("Servidor iniciado con puerto " + puerto);
            //Server
            while (true) {
                tec = new Scanner(System.in);
                System.out.println("Ponga puerto al que se quiere conectar:");
                int puertoCliente = tec.nextInt();
                Socket clientSocket = new Socket("localhost", puertoCliente);
                //Cliente
                while (true) {
                    scServer = serverSocket.accept();
                    outServer = new PrintWriter(scServer.getOutputStream(), true);
                    inServer = new BufferedReader(new InputStreamReader(scServer.getInputStream()));
                    System.out.println("Cliente conectado");
                    PrintWriter outCliente = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader inCliente = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    tec = new Scanner(System.in);
                    String mensaje = tec.nextLine();
                    outCliente.println(mensaje);
//                    outServer.println("Mensaje 1");
                    System.out.println(inServer.readLine());
                    System.out.println(inCliente.readLine());

//                    this.inServer = new DataInputStream(this.scServer.getInputStream());
//                    this.outServer = new DataOutputStream(this.scServer.getOutputStream());
//
//                    String mensaje = this.inServer.readUTF();
//                    System.outServer.println(mensaje);
//                    this.outServer.writeUTF("Mensaje del serverSocket");
//                    this.scServer.close();
//                    System.outServer.println("Cliente deesconectado");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
//        String nombre;
//        int puerto;
//        this.tec = new Scanner(System.inServer);
//        System.outServer.print("Nombre: ");
//        nombre = tec.nextLine();
//        System.outServer.print("Puerto: ");
//        puerto = tec.nextInt();
//        EnviadorInformacion server = new EnviadorInformacion(puerto);
//        server.start();
//        new GestionConexion().gestionInformacion(nombre, server);
    }

    public void gestionInformacion(String nombre, EnviadorInformacion serverThread) {
//        try {
//            this.tec = new Scanner(System.inServer);
//            String host = "localhost";
//            int puerto;
//            Socket socket;
//            System.outServer.println("----");
//            System.outServer.print("Poner puerto: ");
//            puerto = tec.nextInt();
//            String datosConexion = host+puerto;
//            System.outServer.println(datosConexion);
//            socket = new Socket(host,puerto);
//            System.outServer.print("Manda tu mensaje: ");
//            this.tec = new Scanner(System.inServer);
//            String mensaje = tec.nextLine();
//        } catch (IOException ex) {
//            Logger.getLogger(GestionConexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
