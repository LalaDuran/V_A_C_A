package Vistas;

import AccesoADatos.RecetaData;
import Entidades.TipoDeComida_Horario;
import Entidades.Receta;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class BusquedaPorGluten extends javax.swing.JPanel {

    private static Object PdfWriter;

    Color violeta = new Color(153, 0, 153);
    Color naranja = new Color(255, 153, 0);

    private final DefaultTableModel modelo = new DefaultTableModel() {
        //Hacemos la tabla no-editable en todas sus celdas
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public BusquedaPorGluten() {

        initComponents();

        //Carga los colores de los radioButtons
        jrbConGluten.setBackground(Color.white);
        jrbSinGluten.setBackground(Color.white);
        jrbConGluten.setForeground(violeta);
        jrbSinGluten.setForeground(violeta);

    
        //Carga la estructura de la tabla
        armarTabla();

        //Carga el PopUp
        popUpTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jpLienzoDeTrabajo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPorGluten = new javax.swing.JTable();
        jrbConGluten = new javax.swing.JRadioButton();
        jrbSinGluten = new javax.swing.JRadioButton();
        jbCerrar = new javax.swing.JButton();
        jlFotoDeFondo = new javax.swing.JLabel();

        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLienzoDeTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        jpLienzoDeTrabajo.setForeground(new java.awt.Color(0, 0, 0));
        jpLienzoDeTrabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTitulo.setBackground(new java.awt.Color(153, 0, 153));
        jlTitulo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(153, 0, 153));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Búsqueda Por Con o Sin Gluten (SinTACC)");
        jpLienzoDeTrabajo.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 30, 630, -1));

        jtTablaPorGluten.setBackground(new java.awt.Color(255, 255, 255));
        jtTablaPorGluten.setForeground(new java.awt.Color(0, 0, 0));
        jtTablaPorGluten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTablaPorGluten.setGridColor(new java.awt.Color(255, 255, 255));
        jtTablaPorGluten.setSelectionBackground(new java.awt.Color(255, 153, 255));
        jtTablaPorGluten.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtTablaPorGluten);

        jpLienzoDeTrabajo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 790, 210));

        jrbConGluten.setText("Con Gluten");
        jrbConGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConGlutenActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jrbConGluten, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jrbSinGluten.setText("Sin Gluten");
        jrbSinGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSinGlutenActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jrbSinGluten, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jbCerrar.setBackground(new java.awt.Color(153, 0, 153));
        jbCerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrar.setText("X");
        jbCerrar.setPreferredSize(new java.awt.Dimension(90, 32));
        jbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCerrarMouseExited(evt);
            }
        });
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, -1));

        jpBackground.add(jpLienzoDeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 810, 340));

        jlFotoDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foto de base 980x654.png"))); // NOI18N
        jpBackground.add(jlFotoDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrbConGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConGlutenActionPerformed
         //Instanciamos recetaData para usar luego
        RecetaData recetaD = new RecetaData();
                
        //Si está seleccionado el botón, habilitamos e inhabilitamos el otro
        if (jrbConGluten.isSelected()) {
            jrbSinGluten.setSelected(false);       
        }

        //Borramos las filas evitando repeticiones
        borrarFilas();

        //Listamos las recetas en la tabla
        for (Receta aux : recetaD.listarReceta()) {
            //si la receta listada no es sintacc, que la agregue a la tabla
            if (aux.isSinTACC()==false){
                modelo.addRow(new Object[]{aux.getTitulo(), aux.getCategoria(), aux.getIngredientePrincipal(), aux.getTipoDeComida(), aux.getTipoDeCocina(), aux.getFormaDeCoccion()});
            }
            
        }
        
        
    }//GEN-LAST:event_jrbConGlutenActionPerformed

    private void jrbSinGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSinGlutenActionPerformed
         //Instanciamos recetaData para usar luego
        RecetaData recetaD = new RecetaData();
                
        //Si está seleccionado el botón, habilitamos e inhabilitamos el otro
        if (jrbSinGluten.isSelected()) {
            jrbConGluten.setSelected(false);       
        }

        //Borramos las filas evitando repeticiones
        borrarFilas();

        //Listamos las recetas en la tabla
        for (Receta aux : recetaD.listarReceta()) {
            //si la receta listada es sintacc, que la agregue a la tabla
            if (aux.isSinTACC() == true){
                modelo.addRow(new Object[]{aux.getTitulo(), aux.getCategoria(), aux.getIngredientePrincipal(), aux.getTipoDeComida(), aux.getTipoDeCocina(), aux.getFormaDeCoccion()});
            }
            
        }
    }//GEN-LAST:event_jrbSinGlutenActionPerformed

    private void jbCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseEntered
        jbCerrar.setBackground(naranja);
        jbCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jbCerrarMouseEntered

    private void jbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseExited
        jbCerrar.setBackground(violeta);
        jbCerrar.setForeground(Color.white);

    }//GEN-LAST:event_jbCerrarMouseExited

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        MenuPrincipal.volverALaFotoDeFondo();
    }//GEN-LAST:event_jbCerrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel jlFotoDeFondo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpLienzoDeTrabajo;
    private javax.swing.JRadioButton jrbConGluten;
    private javax.swing.JRadioButton jrbSinGluten;
    private javax.swing.JTable jtTablaPorGluten;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {
        //Agregamos las cabeceras a la tabla
        modelo.addColumn("Título");
        modelo.addColumn("Categoría");
        modelo.addColumn("Ingrediente Ppal.");
        modelo.addColumn("Horario");
        modelo.addColumn("Tipo de Cocina");
        modelo.addColumn("Forma de Cocción");

        //Seteamos el modelo a la tabla
        jtTablaPorGluten.setModel(modelo);

        //Impedimos el reordenamiento de la cabecera
        jtTablaPorGluten.getTableHeader().setReorderingAllowed(false);

//       Para hacer uso de la clase MyRenderer solo es necesario escribir este código en el lugar donde esta el jTable:
        jtTablaPorGluten.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorGluten.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorGluten.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorGluten.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorGluten.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorGluten.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(violeta, Color.white));

//La clase MyRenderer tiene definido un constructor que recibe 2 parámetros Color, los cuales corresponden a los colores de fondo y de fuente.
        DefaultTableCellRenderer tcr0 = new DefaultTableCellRenderer();

        //para centrar los datos de la segunda columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorGluten.getColumnModel().getColumn(1).setCellRenderer(tcr0);

        //para centrar los datos de la tercera columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorGluten.getColumnModel().getColumn(2).setCellRenderer(tcr0);

        //Para centrar los datos de la cuarta columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorGluten.getColumnModel().getColumn(3).setCellRenderer(tcr0);

        //Para centrar los datos de la quinta columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorGluten.getColumnModel().getColumn(4).setCellRenderer(tcr0);

        //Para centrar los datos de la sexta columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorGluten.getColumnModel().getColumn(5).setCellRenderer(tcr0);

        
        //Para establecer los anchos de columna
        jtTablaPorGluten.getColumnModel().getColumn(0).setPreferredWidth(130);
        jtTablaPorGluten.getColumnModel().getColumn(1).setPreferredWidth(20);
        jtTablaPorGluten.getColumnModel().getColumn(2).setPreferredWidth(48);
        jtTablaPorGluten.getColumnModel().getColumn(3).setPreferredWidth(18);
        jtTablaPorGluten.getColumnModel().getColumn(4).setPreferredWidth(18);
        jtTablaPorGluten.getColumnModel().getColumn(5).setPreferredWidth(25);

        //Para hacer blanco el fondo de la tabla
        jtTablaPorGluten.setOpaque(true);
        jtTablaPorGluten.setBackground(Color.white);

    }

    private void borrarFilas() {
        //Evita la repetición de las filas en la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    
    //para agregar la ventana pop-up a la tabla
    public void popUpTable() {
        //crea la carcaza vacía, el marco
        JPopupMenu popUpMenu = new JPopupMenu();
        //crea la línea de menú
        JMenuItem menuItem1 = new JMenuItem("Visualizar la receta", new ImageIcon(getClass().getResource("/Imagenes/lupa.png")));

        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Esperando un pdf", "Receta", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        //agrega la línea de menú al marco
        popUpMenu.add(menuItem1);
        //agrega el marco con la línea a la tabla
        jtTablaPorGluten.setComponentPopupMenu(popUpMenu);
    }

}
