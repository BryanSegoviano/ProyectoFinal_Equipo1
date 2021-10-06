/**
 * Paquete fachada
 */
package fachada;

//Imports utilizados para la clase HIloUnirsePartida
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Clase HiloUnirsePartida que extiende de la clase Thread(hilos), que se
 * utiliza para simular la unión a una partida ya creada.
 */
public class HiloUnirsePartida extends Thread {

    /**
     * Método run() que se ejecuta en segundo plano para unirse a una partida.
     */
    @Override
    public void run() {
        JOptionPane jop = new JOptionPane();
        jop.setMessageType(JOptionPane.PLAIN_MESSAGE);
        jop.setMessage("Cargando partida");
        jop.setOptions(new Object[]{});
        JDialog dialog = jop.createDialog(null, "Partida timbiriche");

        // 2 Segundos de tiempo
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            dialog.dispose();
        }).start();
        dialog.setVisible(true);

    }
}
