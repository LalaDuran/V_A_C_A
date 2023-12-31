package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MenuPrincipal extends javax.swing.JFrame {

    Color violeta = new Color(153,0,153);
    Color naranja = new Color(255,153,0); 

    public MenuPrincipal() {
        initComponents();
        
        //Impide el cambio de tamaño de la ventana
        this.setResizable(false);
        
        //Abre la ventana del menú en el centro
        this.setLocationRelativeTo(null);
        
        //Establece el tono violeta del panel de menúes y de los botones
        jpMenu.setBackground(violeta);
        jbPorCategoria.setBackground(violeta);

        //Establece la fecha en formato [nombreDía dd MMMM aaaa]
        establecerFecha();
        
        //Establece la foto inicial de fondo
        initContent();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondoBlanco = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jbPorCategoria = new javax.swing.JButton();
        jbPorIngrediente = new javax.swing.JButton();
        jbPorHorario = new javax.swing.JButton();
        jbPorTipoDeCocina = new javax.swing.JButton();
        jbSinGluten = new javax.swing.JButton();
        jbBusquedaCombinada = new javax.swing.JButton();
        jbAdministracion = new javax.swing.JButton();
        jpCabecera = new javax.swing.JPanel();
        jpContent = new javax.swing.JPanel();
        jlBienvenida = new javax.swing.JLabel();
        jlDia = new javax.swing.JLabel();
        jlVeganicemosElMundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        jpMenu.setBackground(new java.awt.Color(153, 0, 153));
        jpMenu.setPreferredSize(new java.awt.Dimension(290, 750));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo (1).png"))); // NOI18N

        jbPorCategoria.setBackground(new java.awt.Color(153, 0, 153));
        jbPorCategoria.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbPorCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jbPorCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/categoría de 50.png"))); // NOI18N
        jbPorCategoria.setText("   Por CATEGORÍA");
        jbPorCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbPorCategoria.setBorderPainted(false);
        jbPorCategoria.setContentAreaFilled(false);
        jbPorCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPorCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbPorCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbPorCategoria.setIconTextGap(6);
        jbPorCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPorCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbPorCategoriaMouseExited(evt);
            }
        });
        jbPorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorCategoriaActionPerformed(evt);
            }
        });

        jbPorIngrediente.setBackground(new java.awt.Color(153, 0, 153));
        jbPorIngrediente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbPorIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        jbPorIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingrediente ppal de 50.png"))); // NOI18N
        jbPorIngrediente.setText("   Por INGREDIENTE");
        jbPorIngrediente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbPorIngrediente.setBorderPainted(false);
        jbPorIngrediente.setContentAreaFilled(false);
        jbPorIngrediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPorIngrediente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbPorIngrediente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbPorIngrediente.setIconTextGap(6);
        jbPorIngrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPorIngredienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbPorIngredienteMouseExited(evt);
            }
        });
        jbPorIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorIngredienteActionPerformed(evt);
            }
        });

        jbPorHorario.setBackground(new java.awt.Color(153, 0, 153));
        jbPorHorario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbPorHorario.setForeground(new java.awt.Color(255, 255, 255));
        jbPorHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/horario de comida de 50.png"))); // NOI18N
        jbPorHorario.setText("   Por HORARIO");
        jbPorHorario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbPorHorario.setBorderPainted(false);
        jbPorHorario.setContentAreaFilled(false);
        jbPorHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPorHorario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbPorHorario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbPorHorario.setIconTextGap(6);
        jbPorHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPorHorarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbPorHorarioMouseExited(evt);
            }
        });
        jbPorHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorHorarioActionPerformed(evt);
            }
        });

        jbPorTipoDeCocina.setBackground(new java.awt.Color(153, 0, 153));
        jbPorTipoDeCocina.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbPorTipoDeCocina.setForeground(new java.awt.Color(255, 255, 255));
        jbPorTipoDeCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tipo de cocina de 50.png"))); // NOI18N
        jbPorTipoDeCocina.setText("   Por TIPO de COCINA");
        jbPorTipoDeCocina.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbPorTipoDeCocina.setBorderPainted(false);
        jbPorTipoDeCocina.setContentAreaFilled(false);
        jbPorTipoDeCocina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPorTipoDeCocina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbPorTipoDeCocina.setIconTextGap(6);
        jbPorTipoDeCocina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPorTipoDeCocinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbPorTipoDeCocinaMouseExited(evt);
            }
        });
        jbPorTipoDeCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorTipoDeCocinaActionPerformed(evt);
            }
        });

        jbSinGluten.setBackground(new java.awt.Color(153, 0, 153));
        jbSinGluten.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbSinGluten.setForeground(new java.awt.Color(255, 255, 255));
        jbSinGluten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sin gluten de 50.png"))); // NOI18N
        jbSinGluten.setText("   Sin GLUTEN");
        jbSinGluten.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbSinGluten.setBorderPainted(false);
        jbSinGluten.setContentAreaFilled(false);
        jbSinGluten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSinGluten.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbSinGluten.setIconTextGap(6);
        jbSinGluten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSinGlutenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSinGlutenMouseExited(evt);
            }
        });
        jbSinGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSinGlutenActionPerformed(evt);
            }
        });

        jbBusquedaCombinada.setBackground(new java.awt.Color(153, 0, 153));
        jbBusquedaCombinada.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbBusquedaCombinada.setForeground(new java.awt.Color(255, 255, 255));
        jbBusquedaCombinada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/búsqueda combinada de 50.png"))); // NOI18N
        jbBusquedaCombinada.setText("   Búsq. COMBINADA");
        jbBusquedaCombinada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbBusquedaCombinada.setBorderPainted(false);
        jbBusquedaCombinada.setContentAreaFilled(false);
        jbBusquedaCombinada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBusquedaCombinada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbBusquedaCombinada.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbBusquedaCombinada.setIconTextGap(6);
        jbBusquedaCombinada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBusquedaCombinadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBusquedaCombinadaMouseExited(evt);
            }
        });
        jbBusquedaCombinada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusquedaCombinadaActionPerformed(evt);
            }
        });

        jbAdministracion.setBackground(new java.awt.Color(153, 0, 153));
        jbAdministracion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jbAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administración de 50.png"))); // NOI18N
        jbAdministracion.setText("   ADMINISTRACIÓN");
        jbAdministracion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbAdministracion.setBorderPainted(false);
        jbAdministracion.setContentAreaFilled(false);
        jbAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdministracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbAdministracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbAdministracion.setIconTextGap(6);
        jbAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAdministracionMouseExited(evt);
            }
        });
        jbAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdministracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPorIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPorHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPorTipoDeCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSinGluten, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBusquedaCombinada, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlLogo)))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbPorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbPorIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbPorHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbPorTipoDeCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbSinGluten, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbBusquedaCombinada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCabecera.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );

        jlBienvenida.setBackground(new java.awt.Color(255, 153, 0));
        jlBienvenida.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jlBienvenida.setForeground(new java.awt.Color(153, 0, 153));
        jlBienvenida.setText("Bienvenida/e/o a VACA, la primera app de cocina vegana");

        jlDia.setBackground(new java.awt.Color(255, 153, 0));
        jlDia.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jlDia.setForeground(new java.awt.Color(153, 0, 153));
        jlDia.setText("Hoy es ...");

        javax.swing.GroupLayout jpCabeceraLayout = new javax.swing.GroupLayout(jpCabecera);
        jpCabecera.setLayout(jpCabeceraLayout);
        jpCabeceraLayout.setHorizontalGroup(
            jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpCabeceraLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDia)
                    .addComponent(jlBienvenida))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jpCabeceraLayout.setVerticalGroup(
            jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabeceraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlBienvenida)
                .addGap(49, 49, 49)
                .addComponent(jlDia)
                .addGap(65, 65, 65)
                .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlVeganicemosElMundo.setBackground(new java.awt.Color(255, 255, 255));
        jlVeganicemosElMundo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jlVeganicemosElMundo.setForeground(new java.awt.Color(153, 0, 153));
        jlVeganicemosElMundo.setText("¡¡¡ Veganicemos el mundo !!!");

        javax.swing.GroupLayout jpFondoBlancoLayout = new javax.swing.GroupLayout(jpFondoBlanco);
        jpFondoBlanco.setLayout(jpFondoBlancoLayout);
        jpFondoBlancoLayout.setHorizontalGroup(
            jpFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoBlancoLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFondoBlancoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jlVeganicemosElMundo)
                        .addContainerGap())))
        );
        jpFondoBlancoLayout.setVerticalGroup(
            jpFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
            .addGroup(jpFondoBlancoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlVeganicemosElMundo)
                .addGap(18, 18, 18)
                .addComponent(jpCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void initContent() {
        
        Principal ppal = new Principal();
        ppal.setSize(980, 654);
        ppal.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(ppal, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
         
    }
    
    private void establecerFecha() {
        
        //Establece la fecha de forma automática
        Date fecha = new Date(); //fecha y hora actual
        SimpleDateFormat sdf = new SimpleDateFormat("'Hoy es 'EEEE dd' de 'MMMM' de 'yyyy"); //formateo la fecha en una cadena
        jlDia.setText(sdf.format(fecha)); //seteo en el jLabel la cadena obtenida
               
    }
    
    private void jbPorCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorCategoriaMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbPorCategoria.setForeground(naranja);
    }//GEN-LAST:event_jbPorCategoriaMouseEntered

    private void jbPorCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorCategoriaMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbPorCategoria.setBackground(violeta);
        jbPorCategoria.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbPorCategoriaMouseExited

    private void jbPorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorCategoriaActionPerformed
        BusquedaPorCategoria bpcat = new BusquedaPorCategoria();
        bpcat.setSize(980, 654);
        bpcat.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(bpcat, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }//GEN-LAST:event_jbPorCategoriaActionPerformed

    private void jbPorIngredienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorIngredienteMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbPorIngrediente.setForeground(naranja);
    }//GEN-LAST:event_jbPorIngredienteMouseEntered

    private void jbPorIngredienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorIngredienteMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbPorIngrediente.setBackground(violeta);
        jbPorIngrediente.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbPorIngredienteMouseExited

    private void jbPorIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorIngredienteActionPerformed
        BusquedaPorIngrediente bping = new BusquedaPorIngrediente();
        bping.setSize(980, 654);
        bping.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(bping, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }//GEN-LAST:event_jbPorIngredienteActionPerformed

    private void jbPorHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorHorarioMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbPorHorario.setForeground(naranja);
    }//GEN-LAST:event_jbPorHorarioMouseEntered

    private void jbPorHorarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorHorarioMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbPorHorario.setBackground(violeta);
        jbPorHorario.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbPorHorarioMouseExited

    private void jbPorHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorHorarioActionPerformed
        BusquedaPorHorario bphora = new BusquedaPorHorario();
        bphora.setSize(980, 654);
        bphora.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(bphora, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }//GEN-LAST:event_jbPorHorarioActionPerformed

    private void jbPorTipoDeCocinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorTipoDeCocinaMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbPorTipoDeCocina.setForeground(naranja);
    }//GEN-LAST:event_jbPorTipoDeCocinaMouseEntered

    private void jbPorTipoDeCocinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPorTipoDeCocinaMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbPorTipoDeCocina.setBackground(violeta);
        jbPorTipoDeCocina.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbPorTipoDeCocinaMouseExited

    private void jbPorTipoDeCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorTipoDeCocinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPorTipoDeCocinaActionPerformed

    private void jbSinGlutenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSinGlutenMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbSinGluten.setForeground(naranja);
    }//GEN-LAST:event_jbSinGlutenMouseEntered

    private void jbSinGlutenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSinGlutenMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbSinGluten.setBackground(violeta);
        jbSinGluten.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbSinGlutenMouseExited

    private void jbSinGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSinGlutenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSinGlutenActionPerformed

    private void jbBusquedaCombinadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBusquedaCombinadaMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbBusquedaCombinada.setForeground(naranja);
    }//GEN-LAST:event_jbBusquedaCombinadaMouseEntered

    private void jbBusquedaCombinadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBusquedaCombinadaMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbBusquedaCombinada.setBackground(violeta);
        jbBusquedaCombinada.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbBusquedaCombinadaMouseExited

    private void jbBusquedaCombinadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBusquedaCombinadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBusquedaCombinadaActionPerformed

    private void jbAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdministracionMouseEntered
        // Seteamos letras en naranja si se acerca el mouse
        jbAdministracion.setForeground(naranja);
    }//GEN-LAST:event_jbAdministracionMouseEntered

    private void jbAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdministracionMouseExited
        // Seteamos la vuelta al violeta y blanco cuando el mouse se aleja
        jbAdministracion.setBackground(violeta);
        jbAdministracion.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_jbAdministracionMouseExited

    private void jbAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAdministracionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAdministracion;
    private javax.swing.JButton jbBusquedaCombinada;
    private javax.swing.JButton jbPorCategoria;
    private javax.swing.JButton jbPorHorario;
    private javax.swing.JButton jbPorIngrediente;
    private javax.swing.JButton jbPorTipoDeCocina;
    private javax.swing.JButton jbSinGluten;
    private javax.swing.JLabel jlBienvenida;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlVeganicemosElMundo;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpFondoBlanco;
    private javax.swing.JPanel jpMenu;
    // End of variables declaration//GEN-END:variables
}
