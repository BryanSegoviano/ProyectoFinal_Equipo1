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
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class HiloUnirsePartida extends Thread {

    private Timer tiempo;
    private TimerTask task;
    private int duracion = 3;
    private boolean isRun = false;

    public void mostrarAviso(int duracion) {
        this.duracion = duracion;
        JOptionPane.showOptionDialog(null, "Buscando partida", "Unirse a partida", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        comenzarConteo();

    }

    public void comenzarConteo() {
        isRun = true;
        tiempo = new Timer();
        task = new TimerTask() {
            int contador = 0;

            @Override
            public void run() {
                contador++;
                if (contador == duracion) {
                    detener();
                }
            }
        };
        tiempo.schedule(task, 0, 1000);
    }

    public void detener() {
        isRun = false;
        tiempo.cancel();
        task.cancel();
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);

        } catch (AWTException ex) {
            Logger.getLogger(HiloUnirsePartida.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        System.out.println("Buscando partida");
//        mostrarAviso(3);
        JOptionPane.showOptionDialog(null, "Buscando partida", "Unirse a partida", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        
    }

}
