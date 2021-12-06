package conectividad;

import java.net.Socket;
import dominio.Linea;
import dominio.Jugador;
import dominio.Cuadro;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

public class JugadorHandler extends Thread {

    private OutputStream outputStream;
    private InputStream inputStream;
    private ObjectOutputStream objectoutputStream;
    private ObjectInputStream objectInputStream;
    private Socket socket;

    public JugadorHandler(Serializable objeto) {
        try {
            this.inputStream = socket.getInputStream();
            this.objectInputStream = new ObjectInputStream(inputStream);
            String message;
            List<Message> listOfMessages = (List<Message>) objectInputStream.readObject();
            System.out.println("Received [" + listOfMessages.size() + "] messages from: " + socket);
            System.out.println("All messages:");
            listOfMessages.forEach((msg) -> System.out.println(msg.getText()));
        } catch (Exception e) {
        }

    }

    @Override
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

    public class Message implements Serializable {

        private final String text;

        public Message(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
    
}
