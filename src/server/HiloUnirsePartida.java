/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.Robot;
import gui.FrmPanelJuego;
import gui.FrmPartida;
import gui.FrmTablero;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase que implementa un hilo en unirse a partida.
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class HiloUnirsePartida extends Thread {
    //Metodo encargado de buscar partidas. 
    @Override
    public void run() {
        try {
            System.out.println("Buscando partida");
            FrmPanelJuego frmPanelJuego = new FrmPanelJuego();
            frmPanelJuego.setVisible(false);
            mostrarAviso(3);
            sleep(1400);
            FrmPartida frmPartida = new FrmPartida(".");
            frmPartida.setVisible(true);
            sleep(3000);
            frmPartida.setVisible(false);
            FrmTablero frmTablero = new FrmTablero();
            frmTablero.setVisible(true);

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloUnirsePartida.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Timer tiempo;
    private TimerTask task;
    private int duracion = 3;
    private boolean isrun = false;
    
    /**
     * Muestra un aviso en busqueda de partida. 
     * 
     * @param duracion 
     */
    public void mostrarAviso(int duracion) {
        this.duracion = duracion;
        comenzarConteo();
        JOptionPane.showOptionDialog(null, "Buscando partida", "Unirse a partida", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);

    }
    //Metodo de conteo
    public void comenzarConteo() {
        isrun = true;
        tiempo = new Timer();
        task = new TimerTask() {
            int contador = 0;
            //Contador que determina cuando detener el conteo.
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
    //Metodo de deter conteo
    public void detener() {
        isrun = false;
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
}
