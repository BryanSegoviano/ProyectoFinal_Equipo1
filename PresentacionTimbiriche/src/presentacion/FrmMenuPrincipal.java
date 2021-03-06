/**
 * Paquete presentacion
 */
package presentacion;

/**
 * Imports utilizados
 */
import control.JugadoresDAO;
import dominio.Partida;
import javax.swing.JOptionPane;

/**
 * Clase FrmMenuPrincipal que extiende de Jframe, que ayudara para poder manejar
 * los diferentes tipos de partida a la cual se desea ingresar
 *
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Constructor que inicia y obtiene instancia de la clase IFachada
     */
    public FrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        JugadoresDAO jugadoresDAO = new JugadoresDAO();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoUsuario.setBackground(new java.awt.Color(153, 0, 153));
        jPanelFondoUsuario.setForeground(new java.awt.Color(255, 0, 0));
        jPanelFondoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setText("Bienvenido");
        jPanelFondoUsuario.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        panelImagen.setBackground(new java.awt.Color(255, 255, 255));
        panelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );

        jPanelFondoUsuario.add(panelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 100));

        jLabelNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(255, 255, 153));
        jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreUsuario.setText("Usuario");
        jPanelFondoUsuario.add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 92, -1));

        btnCreaAvatar.setBackground(new java.awt.Color(153, 0, 153));
        btnCreaAvatar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreaAvatar.setText("Crea tu avatar");
        btnCreaAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCreaAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaAvatarActionPerformed(evt);
            }
        });
        jPanelFondoUsuario.add(btnCreaAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, -1));

        jPanel1.add(jPanelFondoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 278));

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

        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Al presionar un botón se solicitará ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("en la consola los puertos");

        javax.swing.GroupLayout jPanelFondoBotonesLayout = new javax.swing.GroupLayout(jPanelFondoBotones);
        jPanelFondoBotones.setLayout(jPanelFondoBotonesLayout);
        jPanelFondoBotonesLayout.setHorizontalGroup(
            jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                .addGroup(jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                        .addGroup(jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnUnirsePartida))
                            .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnSalir))
                            .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel2)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFondoBotonesLayout.setVerticalGroup(
            jPanelFondoBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoBotonesLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(btnCrearPartida)
                .addGap(18, 18, 18)
                .addComponent(btnUnirsePartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanelFondoBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 0, 190, 278));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción de boton para crear partidas
     *
     * @param evt Tipo de eventos
     */
    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        this.crearPartida();
    }//GEN-LAST:event_btnCrearPartidaActionPerformed

    /**
     * Acción de boton para unirse a partidas
     *
     * @param evt Tipo de eventos
     */
    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        this.unirsePartida();
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

    /**
     * Acción de boton para salir de partida
     *
     * @param evt Tipo de eventos
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
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
            if (JugadoresDAO.jugadores[0].getUsuario() != null) {
                this.jLabelNombreUsuario.setText(JugadoresDAO.jugadores[0].getUsuario());
            }
        }

    }

    /**
     * Método para crear una partida en base a los hilos simulando una conexión
     * de red
     */
    private void crearPartida() {
        if (jLabelNombreUsuario.getText().equals("Usuario") || jPanelImagen.getIcon() == null) {
            JOptionPane.showOptionDialog(null, "No ha creado un avatar", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        } else {
            this.dispose();
            Partida partidaCreada = new Partida();
            FrmPartida frmPartida = new FrmPartida("", partidaCreada);
            frmPartida.setVisible(true);
            this.dispose();
        }

    }

    /**
     * Método para unirse a una partida en base a los hilos simulando una
     * conexión de red
     */
    private void unirsePartida() {
        if (jLabelNombreUsuario.getText().equals("Usuario") || jPanelImagen.getIcon() == null) {
            JOptionPane.showOptionDialog(null, "No ha creado un avatar", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        } else {
            this.dispose();
            Partida partidaCreada = new Partida();
            FrmPartida frmPartida = new FrmPartida(".", partidaCreada);
            frmPartida.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreaAvatar;
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFondoBotones;
    private javax.swing.JPanel jPanelFondoUsuario;
    public javax.swing.JLabel jPanelImagen;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables

}
