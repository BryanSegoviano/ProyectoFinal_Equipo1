package gui;

import control.JugadoresDAO;
import javax.swing.JOptionPane;
import server.HiloCrearPartida;
import server.HiloUnirsePartida;
/**
 * 
 * @author Administrador
 */
public class FrmPanelJuego extends javax.swing.JFrame {

    private Thread hilo;
    private JugadoresDAO jugadoresDAO;
    /**
     * Este metodo inicializa el panelJuego.
     * 
     */
    public FrmPanelJuego() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelFondoUsuario = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        panelImagen = new javax.swing.JPanel();
        jPanelImagen = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        btnCreaAvatar = new javax.swing.JButton();
        jPanelFondoBotones = new javax.swing.JPanel();
        btnCrearPartida = new javax.swing.JButton();
        btnUnirsePartida = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanelFondoUsuario.setBackground(new java.awt.Color(153, 0, 153));
        jPanelFondoUsuario.setForeground(new java.awt.Color(255, 0, 0));

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setText("Bienvenido");

        panelImagen.setBackground(new java.awt.Color(255, 255, 255));
        panelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagenLayout.createSequentialGroup()
                .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImagenLayout.createSequentialGroup()
                .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(255, 255, 153));
        jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreUsuario.setText("Usuario");

        btnCreaAvatar.setBackground(new java.awt.Color(153, 0, 153));
        btnCreaAvatar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreaAvatar.setText("Crea tu avatar");
        btnCreaAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaAvatarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoUsuarioLayout = new javax.swing.GroupLayout(jPanelFondoUsuario);
        jPanelFondoUsuario.setLayout(jPanelFondoUsuarioLayout);
        jPanelFondoUsuarioLayout.setHorizontalGroup(
            jPanelFondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelFondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreaAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelFondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBienvenido)
                            .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelFondoUsuarioLayout.setVerticalGroup(
            jPanelFondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBienvenido)
                .addGap(32, 32, 32)
                .addComponent(jLabelNombreUsuario)
                .addGap(18, 18, 18)
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreaAvatar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelFondoBotones.setBackground(new java.awt.Color(132, 174, 220));

        btnCrearPartida.setBackground(new java.awt.Color(153, 0, 153));
        btnCrearPartida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearPartida.setText("Crear partida");
        btnCrearPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });

        btnUnirsePartida.setBackground(new java.awt.Color(153, 0, 153));
        btnUnirsePartida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUnirsePartida.setText("Unirse a partida");
        btnUnirsePartida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 0, 153));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoBotonesLayout = new javax.swing.GroupLayout(jPanelFondoBotones);
        jPanelFondoBotones.setLayout(jPanelFondoBotonesLayout);
        jPanelFondoBotonesLayout.setHorizontalGroup(
            jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoBotonesLayout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoBotonesLayout.createSequentialGroup()
                            .addComponent(btnUnirsePartida)
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoBotonesLayout.createSequentialGroup()
                            .addComponent(btnSalir)
                            .addGap(84, 84, 84)))))
        );
        jPanelFondoBotonesLayout.setVerticalGroup(
            jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnCrearPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUnirsePartida)
                .addGap(42, 42, 42)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelFondoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFondoBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelFondoBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFondoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        this.crearPartida();
    }//GEN-LAST:event_btnCrearPartidaActionPerformed

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        this.unirsePartida();
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCreaAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaAvatarActionPerformed
        this.creaAvatar();
    }//GEN-LAST:event_btnCreaAvatarActionPerformed
     /**
     * Este metodo se encarga de crear el avatar.
     * 
     */
    private void creaAvatar() {
        DlgRegistro frmRegistro = new DlgRegistro(this, true);
        frmRegistro.setVisible(true);
        if (JugadoresDAO.jugadores[0] != null) {
            this.jPanelImagen.setIcon(JugadoresDAO.jugadores[0].getAvatar());
            this.jLabelNombreUsuario.setText(JugadoresDAO.jugadores[0].getUsuario());
        }

    }
    //Se establece crear partida mediante el uso de un hilo.
    private void crearPartida() {
        if (jLabelNombreUsuario.getText().equals("Usuario") || jPanelImagen.getIcon() == null) {
            JOptionPane.showOptionDialog(null, "No ha creado un avatar", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        } else {
            this.dispose();
            hilo = new HiloCrearPartida();
            hilo.start();
        }

    }
     //Se establece unirse a partida mediante el uso de un hilo.
    private void unirsePartida() {
        if (jLabelNombreUsuario.getText().equals("Usuario") || jPanelImagen.getIcon() == null) {
            JOptionPane.showOptionDialog(null, "No ha creado un avatar", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        } else {
            this.dispose();
            hilo = new HiloUnirsePartida();
            hilo.start();
        }
    }
    //Salir de partida. 
    private void salir() {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreaAvatar;
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFondoBotones;
    private javax.swing.JPanel jPanelFondoUsuario;
    public javax.swing.JLabel jPanelImagen;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables

}
