package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AdminBusquedaPorIngrediente extends javax.swing.JPanel {

    private static Object PdfWriter;

    Color violeta = new Color(153, 0, 153);
    Color naranja = new Color(255, 153, 0);

    private final DefaultTableModel modelo = new DefaultTableModel() {
        //Hacemos la tabla no-editable en todas sus celdas
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AdminBusquedaPorIngrediente() {

        initComponents();

        //Carga los colores del ComboBox
        jcbIngredientes.setBackground(Color.white);
        jcbIngredientes.setForeground(violeta);

        //Carga las categorías al comboBox
        cargarIngredientesAlComboBox();

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPorIngPpal = new javax.swing.JTable();
        jcbIngredientes = new javax.swing.JComboBox<>();
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
        jlTitulo.setText("Búsqueda Por Ingrediente");
        jpLienzoDeTrabajo.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 30, 630, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Categoría:");
        jpLienzoDeTrabajo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jtTablaPorIngPpal.setBackground(new java.awt.Color(255, 255, 255));
        jtTablaPorIngPpal.setForeground(new java.awt.Color(0, 0, 0));
        jtTablaPorIngPpal.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaPorIngPpal.setGridColor(new java.awt.Color(255, 255, 255));
        jtTablaPorIngPpal.setSelectionBackground(new java.awt.Color(255, 153, 255));
        jtTablaPorIngPpal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtTablaPorIngPpal);

        jpLienzoDeTrabajo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 790, 210));

        jcbIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        jcbIngredientes.setForeground(new java.awt.Color(153, 0, 153));
        jcbIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIngredientesActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jcbIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 250, -1));

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

    private void jcbIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIngredientesActionPerformed
        //Instanciamos receta y recetaData para usar luego
        RecetaData recetaData = new RecetaData();
        Receta receta = new Receta();

        //Creamos una variable y le asignamos el ingrediente seleccionado en la vista
        String ingredienteSeleccionado = (String) jcbIngredientes.getSelectedItem();

        //Borramos las filas evitando repeticiones
        borrarFilas();

        for (Receta aux : recetaData.listarReceta()) {
            if (aux.getIngredientePrincipal().equals(ingredienteSeleccionado)) {

                //Creo esto para que no aparezca false o true por pantalla
                String esSinGluten = null;
                if (aux.isSinTACC() == false) {
                    esSinGluten = "No";
                } else {
                    esSinGluten = "Si";
                }

                modelo.addRow(new Object[]{aux.getTitulo(), aux.getCategoria(), aux.getTipoDeComida(), aux.getTipoDeCocina(), aux.getFormaDeCoccion(), esSinGluten});
            }
        }

    }//GEN-LAST:event_jcbIngredientesActionPerformed

    private void jbCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseEntered
        jbCerrar.setBackground(naranja);
        jbCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jbCerrarMouseEntered

    private void jbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseExited
        jbCerrar.setBackground(violeta);
        jbCerrar.setForeground(Color.white);

    }//GEN-LAST:event_jbCerrarMouseExited

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        AdminMenuPrincipal.volverALaFotoDeFondo();
    }//GEN-LAST:event_jbCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JComboBox<String> jcbIngredientes;
    private javax.swing.JLabel jlFotoDeFondo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpLienzoDeTrabajo;
    private javax.swing.JTable jtTablaPorIngPpal;
    // End of variables declaration//GEN-END:variables

   
    private void cargarIngredientesAlComboBox() {

        jcbIngredientes.addItem("Selecciona el Ingrediente:");
        jcbIngredientes.addItem(Ingredientes.ACEITUNAS.toString());
        jcbIngredientes.addItem(Ingredientes.AJO.toString());
        jcbIngredientes.addItem(Ingredientes.AKUSAI.toString());
        jcbIngredientes.addItem(Ingredientes.ALBAHACA.toString());
        jcbIngredientes.addItem(Ingredientes.ANANÁ.toString());
        jcbIngredientes.addItem(Ingredientes.ANÍS.toString());
        jcbIngredientes.addItem(Ingredientes.AQUAFABA.toString());
        jcbIngredientes.addItem(Ingredientes.ARROZ.toString());
        jcbIngredientes.addItem(Ingredientes.AVENA.toString());
        jcbIngredientes.addItem(Ingredientes.AZÚCAR.toString());
        jcbIngredientes.addItem(Ingredientes.AZÚCAR_IMPALPABLE.toString());
        jcbIngredientes.addItem(Ingredientes.BANANAS.toString());
        jcbIngredientes.addItem(Ingredientes.BATATAS.toString());
        jcbIngredientes.addItem(Ingredientes.BERENJENAS.toString());
        jcbIngredientes.addItem(Ingredientes.BOLDO.toString());
        jcbIngredientes.addItem(Ingredientes.BRÓCOLI.toString());
        jcbIngredientes.addItem(Ingredientes.CACAO_CHOCOLATE.toString());
        jcbIngredientes.addItem(Ingredientes.CAFÉ.toString());
        jcbIngredientes.addItem(Ingredientes.CALABAZA.toString());
        jcbIngredientes.addItem(Ingredientes.CEBOLLAS.toString());
        jcbIngredientes.addItem(Ingredientes.CHÍA.toString());
        jcbIngredientes.addItem(Ingredientes.CHOCLO.toString());
        jcbIngredientes.addItem(Ingredientes.COCO.toString());
        jcbIngredientes.addItem(Ingredientes.COLIFLOR.toString());
        jcbIngredientes.addItem(Ingredientes.COUS_COUS.toString());
        jcbIngredientes.addItem(Ingredientes.DÁTILES.toString());
        jcbIngredientes.addItem(Ingredientes.DURAZNOS.toString());
        jcbIngredientes.addItem(Ingredientes.ESPINACAS.toString());
        jcbIngredientes.addItem(Ingredientes.FRUTILLAS.toString());
        jcbIngredientes.addItem(Ingredientes.FRUTOS_SECOS.toString());
        jcbIngredientes.addItem(Ingredientes.GARBANZOS.toString());
        jcbIngredientes.addItem(Ingredientes.GIRASOL.toString());
        jcbIngredientes.addItem(Ingredientes.GLUTEN_PURO.toString());
        jcbIngredientes.addItem(Ingredientes.HARINA_COMÚN.toString());
        jcbIngredientes.addItem(Ingredientes.HIGOS.toString());
        jcbIngredientes.addItem(Ingredientes.HONGOS.toString());
        jcbIngredientes.addItem(Ingredientes.JENGIBRE.toString());
        jcbIngredientes.addItem(Ingredientes.KALE.toString());
        jcbIngredientes.addItem(Ingredientes.KETCHUP.toString());
        jcbIngredientes.addItem(Ingredientes.LECHE_VEGETAL.toString());
        jcbIngredientes.addItem(Ingredientes.LENTEJAS.toString());
        jcbIngredientes.addItem(Ingredientes.LIMÓN.toString());
        jcbIngredientes.addItem(Ingredientes.LINO.toString());
        jcbIngredientes.addItem(Ingredientes.MAICENA.toString());
        jcbIngredientes.addItem(Ingredientes.MAÍZ.toString());
        jcbIngredientes.addItem(Ingredientes.MANDARINAS.toString());
        jcbIngredientes.addItem(Ingredientes.MANDIOCA.toString());
        jcbIngredientes.addItem(Ingredientes.MANZANAS.toString());
        jcbIngredientes.addItem(Ingredientes.MAYONESA.toString());
        jcbIngredientes.addItem(Ingredientes.MIJO.toString());
        jcbIngredientes.addItem(Ingredientes.MOSTAZA.toString());
        jcbIngredientes.addItem(Ingredientes.NARANJAS.toString());
        jcbIngredientes.addItem(Ingredientes.PALTA.toString());
        jcbIngredientes.addItem(Ingredientes.PAPAS.toString());
        jcbIngredientes.addItem(Ingredientes.PEPINO.toString());
        jcbIngredientes.addItem(Ingredientes.PERAS.toString());
        jcbIngredientes.addItem(Ingredientes.PIMIENTOS.toString());
        jcbIngredientes.addItem(Ingredientes.POLENTA.toString());
        jcbIngredientes.addItem(Ingredientes.POROTOS.toString());
        jcbIngredientes.addItem(Ingredientes.PUERROS.toString());
        jcbIngredientes.addItem(Ingredientes.QUINOA.toString());
        jcbIngredientes.addItem(Ingredientes.REMOLACHA.toString());
        jcbIngredientes.addItem(Ingredientes.REPOLLOS.toString());
        jcbIngredientes.addItem(Ingredientes.ROMERO.toString());
        jcbIngredientes.addItem(Ingredientes.SALSA_DE_SOJA.toString());
        jcbIngredientes.addItem(Ingredientes.SALVIA.toString());
        jcbIngredientes.addItem(Ingredientes.SOJA_TEXTURIZADA.toString());
        jcbIngredientes.addItem(Ingredientes.TÉS.toString());
        jcbIngredientes.addItem(Ingredientes.TOFU.toString());
        jcbIngredientes.addItem(Ingredientes.TOMATES.toString());
        jcbIngredientes.addItem(Ingredientes.VAINILLA.toString());
        jcbIngredientes.addItem(Ingredientes.YERBA.toString());
        jcbIngredientes.addItem(Ingredientes.ZANAHORIAS.toString());
        jcbIngredientes.addItem(Ingredientes.ZUQUINI.toString());

    }

     private void armarTabla() {
        //Agregamos las cabeceras a la tabla
        modelo.addColumn("Título");
        modelo.addColumn("Categoría");
        modelo.addColumn("Horario");
        modelo.addColumn("Tipo de Cocina");
        modelo.addColumn("Forma de Cocción");
        modelo.addColumn("Sin Gluten");

        //Seteamos el modelo a la tabla
        jtTablaPorIngPpal.setModel(modelo);

        //Impedimos el reordenamiento de la cabecera
        jtTablaPorIngPpal.getTableHeader().setReorderingAllowed(false);

//       Para hacer uso de la clase MyRenderer solo es necesario escribir este código en el lugar donde esta el jTable:
        jtTablaPorIngPpal.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorIngPpal.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorIngPpal.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorIngPpal.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorIngPpal.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(violeta, Color.white));
        jtTablaPorIngPpal.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(violeta, Color.white));

//La clase MyRenderer tiene definido un constructor que recibe 2 parámetros Color, los cuales corresponden a los colores de fondo y de fuente.


        DefaultTableCellRenderer tcr0 = new DefaultTableCellRenderer();

        //para centrar los datos de la segunda columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorIngPpal.getColumnModel().getColumn(1).setCellRenderer(tcr0);

        //para centrar los datos de la tercera columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorIngPpal.getColumnModel().getColumn(2).setCellRenderer(tcr0);

        //Para centrar los datos de la cuarta columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorIngPpal.getColumnModel().getColumn(3).setCellRenderer(tcr0);

        //Para centrar los datos de la quinta columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorIngPpal.getColumnModel().getColumn(4).setCellRenderer(tcr0);

        //Para centrar los datos de la sexta columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPorIngPpal.getColumnModel().getColumn(5).setCellRenderer(tcr0);

        
        //Para establecer los anchos de columna
        jtTablaPorIngPpal.getColumnModel().getColumn(0).setPreferredWidth(130);
        jtTablaPorIngPpal.getColumnModel().getColumn(1).setPreferredWidth(90);
        jtTablaPorIngPpal.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtTablaPorIngPpal.getColumnModel().getColumn(3).setPreferredWidth(20);
        jtTablaPorIngPpal.getColumnModel().getColumn(4).setPreferredWidth(25);
        jtTablaPorIngPpal.getColumnModel().getColumn(5).setPreferredWidth(10);

        //Para hacer blanco el fondo de la tabla
        jtTablaPorIngPpal.setOpaque(true);
        jtTablaPorIngPpal.setBackground(Color.white);

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
        JMenuItem menuItem1 = new JMenuItem("Generar Receta.doc", new ImageIcon(getClass().getResource("/Imagenes/expediente de 20x20.png")));

        
        //agrega la línea de menú al marco
        popUpMenu.add(menuItem1);
        //agrega el marco con la línea a la tabla
        jtTablaPorIngPpal.setComponentPopupMenu(popUpMenu);
        
        //Agrega la acción al popup
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                RecetaData recetaD = new RecetaData();
                Receta recetaAImprimir = recetaD.buscarRecetaPorTitulo((String)jtTablaPorIngPpal.getValueAt(jtTablaPorIngPpal.getSelectedRow(),0));
                guardarWord(recetaAImprimir.toString());
                
            }
        });
        
    }

    public void guardarWord(final String linea){
        
        File archivo;
        PrintWriter escribir;
        
        archivo = new File ("C:\\Users\\Adriana\\Desktop\\Receta.doc");
        if (!archivo.exists()){
            try{
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "La receta se guardó correctamente");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            try{
                escribir = new PrintWriter(archivo,"utf-8");
                escribir.println(linea);
                escribir.close();
                JOptionPane.showMessageDialog(null, "La receta se guardó correctamente");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        
    }

}
