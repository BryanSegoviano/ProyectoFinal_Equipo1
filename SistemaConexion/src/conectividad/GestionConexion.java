package conectividad;

import dominio.Linea;
import java.io.BufferedReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class GestionConexion {

    public void inicializarConexion() {
        Scanner tec;
        ServerSocket serverSocket;
        Socket scServer;
        PrintWriter outServer;
        BufferedReader inServer;
        tec = new Scanner(System.in);
        try {
            int puerto;
            System.out.print("Ponga puerto de su servidor: ");
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
//                    outServer = new PrintWriter(scServer.getOutputStream(), true);
//                    inServer = new BufferedReader(new InputStreamReader(scServer.getInputStream()));
                    System.out.println("Cliente conectado");
//                    PrintWriter outCliente = new PrintWriter(clientSocket.getOutputStream(), true);
//                    BufferedReader inCliente = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                    tec = new Scanner(System.in);
//                    String mensaje = tec.nextLine();
//                    outCliente.println(mensaje);
//                    System.out.println(inServer.readLine());
//                    System.out.println(inCliente.readLine());
                    System.out.println("------");
                    Linea linea = new Linea(1, 1, 2, 3);
                    ObjectOutputStream oos = new ObjectOutputStream(scServer.getOutputStream());
                    oos.writeObject(linea);
                    ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                    Linea lineaStream = (Linea) ois.readObject();
                    System.out.println("del stream scserver: " + Arrays.toString(lineaStream.getCoordenadasA()) + " & " + Arrays.toString(lineaStream.getCoordenadasB()));
                    System.out.println("----");

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
