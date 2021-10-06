/**
 * Paquete fachada
 */
package fachada;

//Imports utilizados para la clase HIloUnirsePartida
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class HiloUnirsePartida extends Thread {

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
