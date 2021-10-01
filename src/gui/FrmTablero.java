package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import util.DibujadoTablero;

public class FrmTablero extends javax.swing.JFrame {

    public static DibujadoTablero dibujar;

    public FrmTablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dibujar = new DibujadoTablero();
//      Establecer el bound hace que no sirva el evento mouseclicked   
        dibujar.setBounds(5, 5, 690, 650);
        this.dibujar.addMouseListener(eventos);
        this.panelTablero.add(dibujar);
        this.dibujarTablero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelJugadores = new javax.swing.JPanel();
        panelJ1 = new javax.swing.JPanel();
        avatarJ1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        colorJugador1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        puntosJ1 = new javax.swing.JLabel();
        panelJ2 = new javax.swing.JPanel();
        avatarJ2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        colorJugador2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        puntosJ2 = new javax.swing.JLabel();
        panelJ3 = new javax.swing.JPanel();
        avatarJ3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        colorJugador3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        puntosJ3 = new javax.swing.JLabel();
        panelJ4 = new javax.swing.JPanel();
        avatarJ4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        colorJugador4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        puntosJ4 = new javax.swing.JLabel();
        panelTablero = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAbandonar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero");

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));

        panelJugadores.setBackground(new java.awt.Color(255, 255, 255));

        panelJ1.setBackground(java.awt.Color.yellow);
        panelJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatarJ1.setBackground(new java.awt.Color(255, 255, 255));
        avatarJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        avatarJ1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout avatarJ1Layout = new javax.swing.GroupLayout(avatarJ1);
        avatarJ1.setLayout(avatarJ1Layout);
        avatarJ1Layout.setHorizontalGroup(
            avatarJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        avatarJ1Layout.setVerticalGroup(
            avatarJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Puntuación: ");

        colorJugador1.setBackground(new java.awt.Color(245, 18, 9));
        colorJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorJugador1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorJugador1Layout = new javax.swing.GroupLayout(colorJugador1);
        colorJugador1.setLayout(colorJugador1Layout);
        colorJugador1Layout.setHorizontalGroup(
            colorJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        colorJugador1Layout.setVerticalGroup(
            colorJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Skinpy");

        puntosJ1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        puntosJ1.setForeground(new java.awt.Color(51, 51, 51));
        puntosJ1.setText("5");

        javax.swing.GroupLayout panelJ1Layout = new javax.swing.GroupLayout(panelJ1);
        panelJ1.setLayout(panelJ1Layout);
        panelJ1Layout.setHorizontalGroup(
            panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(colorJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puntosJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        panelJ1Layout.setVerticalGroup(
            panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addComponent(avatarJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntosJ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colorJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelJ2.setBackground(java.awt.Color.white);
        panelJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatarJ2.setBackground(new java.awt.Color(255, 255, 255));
        avatarJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        avatarJ2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout avatarJ2Layout = new javax.swing.GroupLayout(avatarJ2);
        avatarJ2.setLayout(avatarJ2Layout);
        avatarJ2Layout.setHorizontalGroup(
            avatarJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        avatarJ2Layout.setVerticalGroup(
            avatarJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Puntuación: ");

        colorJugador2.setBackground(new java.awt.Color(244, 244, 0));
        colorJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorJugador2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorJugador2Layout = new javax.swing.GroupLayout(colorJugador2);
        colorJugador2.setLayout(colorJugador2Layout);
        colorJugador2Layout.setHorizontalGroup(
            colorJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        colorJugador2Layout.setVerticalGroup(
            colorJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Slizzir");

        puntosJ2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        puntosJ2.setForeground(new java.awt.Color(51, 51, 51));
        puntosJ2.setText("5");

        javax.swing.GroupLayout panelJ2Layout = new javax.swing.GroupLayout(panelJ2);
        panelJ2.setLayout(panelJ2Layout);
        panelJ2Layout.setHorizontalGroup(
            panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(colorJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puntosJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        panelJ2Layout.setVerticalGroup(
            panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addComponent(avatarJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntosJ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colorJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelJ3.setBackground(java.awt.Color.white);
        panelJ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatarJ3.setBackground(new java.awt.Color(255, 255, 255));
        avatarJ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        avatarJ3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout avatarJ3Layout = new javax.swing.GroupLayout(avatarJ3);
        avatarJ3.setLayout(avatarJ3Layout);
        avatarJ3Layout.setHorizontalGroup(
            avatarJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        avatarJ3Layout.setVerticalGroup(
            avatarJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Puntuación: ");

        colorJugador3.setBackground(new java.awt.Color(24, 210, 233));
        colorJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorJugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorJugador3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorJugador3Layout = new javax.swing.GroupLayout(colorJugador3);
        colorJugador3.setLayout(colorJugador3Layout);
        colorJugador3Layout.setHorizontalGroup(
            colorJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        colorJugador3Layout.setVerticalGroup(
            colorJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Rictal");

        puntosJ3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        puntosJ3.setForeground(new java.awt.Color(51, 51, 51));
        puntosJ3.setText("5");

        javax.swing.GroupLayout panelJ3Layout = new javax.swing.GroupLayout(panelJ3);
        panelJ3.setLayout(panelJ3Layout);
        panelJ3Layout.setHorizontalGroup(
            panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelJ3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)))
                .addGroup(panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(colorJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puntosJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        panelJ3Layout.setVerticalGroup(
            panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelJ3Layout.createSequentialGroup()
                        .addComponent(avatarJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(panelJ3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntosJ3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colorJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ4.setBackground(java.awt.Color.white);
        panelJ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatarJ4.setBackground(new java.awt.Color(255, 255, 255));
        avatarJ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        avatarJ4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout avatarJ4Layout = new javax.swing.GroupLayout(avatarJ4);
        avatarJ4.setLayout(avatarJ4Layout);
        avatarJ4Layout.setHorizontalGroup(
            avatarJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        avatarJ4Layout.setVerticalGroup(
            avatarJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Puntuación: ");

        colorJugador4.setBackground(new java.awt.Color(104, 203, 60));
        colorJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorJugador4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorJugador4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorJugador4Layout = new javax.swing.GroupLayout(colorJugador4);
        colorJugador4.setLayout(colorJugador4Layout);
        colorJugador4Layout.setHorizontalGroup(
            colorJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        colorJugador4Layout.setVerticalGroup(
            colorJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Juan");

        puntosJ4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        puntosJ4.setForeground(new java.awt.Color(51, 51, 51));
        puntosJ4.setText("5");

        javax.swing.GroupLayout panelJ4Layout = new javax.swing.GroupLayout(panelJ4);
        panelJ4.setLayout(panelJ4Layout);
        panelJ4Layout.setHorizontalGroup(
            panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelJ4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addGroup(panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(colorJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puntosJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        panelJ4Layout.setVerticalGroup(
            panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelJ4Layout.createSequentialGroup()
                        .addComponent(avatarJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(panelJ4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntosJ4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colorJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelJugadoresLayout = new javax.swing.GroupLayout(panelJugadores);
        panelJugadores.setLayout(panelJugadoresLayout);
        panelJugadoresLayout.setHorizontalGroup(
            panelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(panelJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJugadoresLayout.setVerticalGroup(
            panelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJ2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJ3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJ4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelTablero.setBackground(new java.awt.Color(255, 255, 255));
        panelTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelTablero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTableroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jMenuAbandonar.setText("Abandonar partida");
        jMenuAbandonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAbandonarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAbandonar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAbandonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAbandonarMouseClicked
        this.dispose();
        FrmPanelJuego menu = new FrmPanelJuego();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuAbandonarMouseClicked

    private void colorJugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorJugador1MouseClicked
        this.pantallaColores("Jugador1");
        this.cambiarColor("Jugador1");
    }//GEN-LAST:event_colorJugador1MouseClicked

    private void colorJugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorJugador2MouseClicked
        this.pantallaColores("Jugador2");
        this.cambiarColor("Jugador2");
    }//GEN-LAST:event_colorJugador2MouseClicked

    private void colorJugador3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorJugador3MouseClicked
        this.pantallaColores("Jugador3");
        this.cambiarColor("Jugador3");
    }//GEN-LAST:event_colorJugador3MouseClicked

    private void colorJugador4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorJugador4MouseClicked
        this.pantallaColores("Jugador4");
        this.cambiarColor("Jugador4");
    }//GEN-LAST:event_colorJugador4MouseClicked

    private void panelTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTableroMouseClicked
        this.coordenadasClick(evt);
    }//GEN-LAST:event_panelTableroMouseClicked

    private void pantallaColores(String jugador) {
        DlgColores dlgColores = new DlgColores(this, true, jugador);
        dlgColores.setVisible(true);
    }

    private void coordenadasClick(java.awt.event.MouseEvent evt) {
        System.out.println(evt.getX());
        System.out.println(evt.getY());
        this.dibujar.dibujarLinea(coordenadaX, coordenadaY, (Graphics2D) dibujar.getGraphics(), color);

    }

    private void cambiarColor(String jugador) {
        if (!(DlgColores.color.isEmpty())) {
            if (jugador.equals("Jugador1")) {
                this.colorJugador1.setBackground(Color.decode(DlgColores.color));
            }
            if (jugador.equals("Jugador2")) {
                this.colorJugador2.setBackground(Color.decode(DlgColores.color));
            }
            if (jugador.equals("Jugador3")) {
                this.colorJugador3.setBackground(Color.decode(DlgColores.color));
            }
            if (jugador.equals("Jugador4")) {
                this.colorJugador4.setBackground(Color.decode(DlgColores.color));
            }
        }
    }

    private void dibujarTablero() {
        this.dibujar.paint((Graphics2D) this.panelTablero.getGraphics());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatarJ1;
    private javax.swing.JPanel avatarJ2;
    private javax.swing.JPanel avatarJ3;
    private javax.swing.JPanel avatarJ4;
    private javax.swing.JPanel colorJugador1;
    private javax.swing.JPanel colorJugador2;
    private javax.swing.JPanel colorJugador3;
    private javax.swing.JPanel colorJugador4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenuAbandonar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelJ1;
    private javax.swing.JPanel panelJ2;
    private javax.swing.JPanel panelJ3;
    private javax.swing.JPanel panelJ4;
    private javax.swing.JPanel panelJugadores;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JLabel puntosJ1;
    private javax.swing.JLabel puntosJ2;
    private javax.swing.JLabel puntosJ3;
    private javax.swing.JLabel puntosJ4;
    // End of variables declaration//GEN-END:variables

    int coordenadaX, coordenadaY;
    Color color;
    MouseListener eventos = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            coordenadaX = e.getX();
            coordenadaY = e.getY();
            System.out.println(panelJ1.getBackground());
            System.out.println(Color.YELLOW);

            if (panelJ1.getBackground().equals(Color.YELLOW)) {
                panelJ1.setBackground(Color.WHITE);
                panelJ2.setBackground(Color.YELLOW);
                color = colorJugador1.getBackground();
                coordenadasClick(e);

                return;
            }
            if (panelJ2.getBackground() == Color.YELLOW) {
                panelJ2.setBackground(Color.WHITE);
                panelJ3.setBackground(Color.YELLOW);
                color = colorJugador2.getBackground();

                coordenadasClick(e);

                return;
            }
            if (panelJ3.getBackground() == Color.YELLOW) {
                panelJ3.setBackground(Color.WHITE);
                panelJ4.setBackground(Color.YELLOW);
                color = colorJugador3.getBackground();

                coordenadasClick(e);

                return;
            }
            if (panelJ4.getBackground() == Color.YELLOW) {
                panelJ4.setBackground(Color.WHITE);
                panelJ1.setBackground(Color.YELLOW);
                color = colorJugador4.getBackground();

                coordenadasClick(e);

                return;
            }

//            colorJugador1.getBackground();
//            panelJ1.setBackground(Color.YELLOW);
        }

        @Override

        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    };
}
