/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.JugadoresDAO;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Bryan
 */
public class FrmPartida extends javax.swing.JFrame {

    Thread hilo;
    public static FrmPartida framePartida;

    public FrmPartida(String msj) {
        initComponents();
        setLocationRelativeTo(null);
        this.nombreJ1.setText(JugadoresDAO.jugadores[0].getUsuario());
        this.nombreJ2.setText(JugadoresDAO.jugadores[1].getUsuario());
        this.nombreJ3.setText(JugadoresDAO.jugadores[2].getUsuario());
        this.nombreJ4.setText(JugadoresDAO.jugadores[3].getUsuario());
        if (msj.equals("")) {
            ocultarPaneles();

        }

    }

//   public void SetImage(String Ruta) {
//       Image mImagen = new ImageIcon(Ruta).getImage();
//       ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(jPanelImagen.getWidth(), jPanelImagen.getHeight(), Image.SCALE_SMOOTH));
//       jPanelImagen.setIcon(mIcono);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelFondo = new javax.swing.JPanel();
        btnSolicitarInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        barraSeparar = new javax.swing.JPanel();
        jPanelJugador1 = new javax.swing.JPanel();
        jLabelJugador4 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JTextField();
        jPanelJugador2 = new javax.swing.JPanel();
        jLabelJugador = new javax.swing.JLabel();
        nombreJ2 = new javax.swing.JTextField();
        jPanelJugador3 = new javax.swing.JPanel();
        jLabelJugador11 = new javax.swing.JLabel();
        nombreJ3 = new javax.swing.JTextField();
        jPanelJugador4 = new javax.swing.JPanel();
        jLabelJugador10 = new javax.swing.JLabel();
        nombreJ4 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Partida");
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(132, 174, 220));
        jPanelFondo.setForeground(new java.awt.Color(255, 0, 0));

        btnSolicitarInicio.setBackground(new java.awt.Color(153, 0, 153));
        btnSolicitarInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSolicitarInicio.setText("Solicitar inicio de juego");
        btnSolicitarInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSolicitarInicio.setEnabled(false);
        btnSolicitarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarInicioActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(153, 0, 153));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setEnabled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        barraSeparar.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barraSepararLayout = new javax.swing.GroupLayout(barraSeparar);
        barraSeparar.setLayout(barraSepararLayout);
        barraSepararLayout.setHorizontalGroup(
            barraSepararLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        barraSepararLayout.setVerticalGroup(
            barraSepararLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelJugador1.setBackground(new java.awt.Color(132, 174, 220));

        jLabelJugador4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJugador4.setText("Jugador 1");

        nombreJ1.setEditable(false);
        nombreJ1.setBackground(new java.awt.Color(255, 255, 255));
        nombreJ1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreJ1.setText("Skinpy");
        nombreJ1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelJugador1Layout = new javax.swing.GroupLayout(jPanelJugador1);
        jPanelJugador1.setLayout(jPanelJugador1Layout);
        jPanelJugador1Layout.setHorizontalGroup(
            jPanelJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJugador4)
                    .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJugador1Layout.setVerticalGroup(
            jPanelJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJugador4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelJugador2.setBackground(new java.awt.Color(132, 174, 220));

        jLabelJugador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJugador.setText("Jugador 2");

        nombreJ2.setEditable(false);
        nombreJ2.setBackground(new java.awt.Color(255, 255, 255));
        nombreJ2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreJ2.setText("Slizzir");
        nombreJ2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelJugador2Layout = new javax.swing.GroupLayout(jPanelJugador2);
        jPanelJugador2.setLayout(jPanelJugador2Layout);
        jPanelJugador2Layout.setHorizontalGroup(
            jPanelJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJugador)
                    .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJugador2Layout.setVerticalGroup(
            jPanelJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelJugador3.setBackground(new java.awt.Color(132, 174, 220));

        jLabelJugador11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJugador11.setText("Jugador 3");

        nombreJ3.setEditable(false);
        nombreJ3.setBackground(new java.awt.Color(255, 255, 255));
        nombreJ3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreJ3.setText("Rictal");
        nombreJ3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelJugador3Layout = new javax.swing.GroupLayout(jPanelJugador3);
        jPanelJugador3.setLayout(jPanelJugador3Layout);
        jPanelJugador3Layout.setHorizontalGroup(
            jPanelJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJugador11)
                    .addComponent(nombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJugador3Layout.setVerticalGroup(
            jPanelJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJugador11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelJugador4.setBackground(new java.awt.Color(132, 174, 220));

        jLabelJugador10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJugador10.setText("Jugador 4");

        nombreJ4.setEditable(false);
        nombreJ4.setBackground(new java.awt.Color(255, 255, 255));
        nombreJ4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreJ4.setText("JuanGod");
        nombreJ4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelJugador4Layout = new javax.swing.GroupLayout(jPanelJugador4);
        jPanelJugador4.setLayout(jPanelJugador4Layout);
        jPanelJugador4Layout.setHorizontalGroup(
            jPanelJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJugador10)
                    .addComponent(nombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJugador4Layout.setVerticalGroup(
            jPanelJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugador4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJugador10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelJugador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(barraSeparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnSalir))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSolicitarInicio)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSeparar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnSolicitarInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarInicioActionPerformed
        this.solicitarInicio();
    }//GEN-LAST:event_btnSolicitarInicioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void solicitarInicio() {
        this.dispose();
        FrmTablero frmTablero = new FrmTablero();
        frmTablero.setVisible(true);
    }

    private void salir() {
        this.dispose();
        FrmPanelJuego frmPanelJuego = new FrmPanelJuego();
        frmPanelJuego.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSeparar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitarInicio;
    private javax.swing.JLabel jLabelJugador;
    private javax.swing.JLabel jLabelJugador10;
    private javax.swing.JLabel jLabelJugador11;
    private javax.swing.JLabel jLabelJugador4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelJugador1;
    public static javax.swing.JPanel jPanelJugador2;
    public static javax.swing.JPanel jPanelJugador3;
    public static javax.swing.JPanel jPanelJugador4;
    private javax.swing.JTextField nombreJ1;
    private javax.swing.JTextField nombreJ2;
    private javax.swing.JTextField nombreJ3;
    private javax.swing.JTextField nombreJ4;
    // End of variables declaration//GEN-END:variables

    void ocultarPaneles() {
        jPanelJugador2.setVisible(false);
        jPanelJugador3.setVisible(false);
        jPanelJugador4.setVisible(false);
    }

    void SetImage(String Ruta) {
    }
}
