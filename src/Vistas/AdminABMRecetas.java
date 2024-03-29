package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.awt.*;
import javax.swing.*;

public class AdminABMRecetas extends javax.swing.JPanel {

    Color violeta = new Color(153, 0, 153);
    Color naranja = new Color(255, 153, 0);

    public AdminABMRecetas() {

        initComponents();

        //Carga los colores de los radioButtons y botones
        jrbConGluten.setBackground(Color.white);
        jrbSinGluten.setBackground(Color.white);
        jrbConGluten.setForeground(violeta);
        jrbSinGluten.setForeground(violeta);
        jbBuscar.setBackground(violeta);
        jbBuscar.setForeground(Color.white);
        jbLimpiar.setBackground(violeta);
        jbLimpiar.setForeground(Color.white);
        jbEliminar.setBackground(violeta);
        jbEliminar.setForeground(Color.white);
        jbCerrar.setBackground(violeta);
        jbCerrar.setForeground(Color.white);
        

        //Carga los comboBox
        cargarCategoriasAlComboBox();
        cargarIngredientesAlComboBox();
        cargarHorariosAlComboBox();
        cargarTiposDeCocinaAlComboBox();
        cargarFormasDeCoccionAlComboBox();
        
        //Por defecto la receta se considera con gluten
        jrbConGluten.setSelected(true);
        
        //Al inicio, inhabilita los botones 'Limpiar' (para cargar una nueva) y 'Elim.'
        jbLimpiar.setEnabled(false);
        jbEliminar.setEnabled(false);

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
        jrbConGluten = new javax.swing.JRadioButton();
        jrbSinGluten = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbIngredientes = new javax.swing.JComboBox<>();
        jcbCategorias = new javax.swing.JComboBox<>();
        jcbHorarios = new javax.swing.JComboBox<>();
        jcbTipoDeCocina = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfIDReceta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbFormaDeCoccion = new javax.swing.JComboBox<>();
        jbLimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaCuerpo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaIngredientes = new javax.swing.JTextArea();
        jbGuardar = new javax.swing.JButton();
        jlFotoDeFondo = new javax.swing.JLabel();
        jlCerrar = new javax.swing.JLabel();

        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLienzoDeTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        jpLienzoDeTrabajo.setForeground(new java.awt.Color(0, 0, 0));
        jpLienzoDeTrabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTitulo.setBackground(new java.awt.Color(153, 0, 153));
        jlTitulo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(153, 0, 153));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("ABM de Recetas");
        jpLienzoDeTrabajo.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 650, -1));

        jrbConGluten.setText("Con Gluten");
        jrbConGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConGlutenActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jrbConGluten, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 100, -1));

        jrbSinGluten.setText("Sin Gluten");
        jrbSinGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSinGlutenActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jrbSinGluten, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 100, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Cuerpo:");
        jpLienzoDeTrabajo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 60, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Cocción:");
        jpLienzoDeTrabajo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Horario:");
        jpLienzoDeTrabajo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 50, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Tipo de Cocina:");
        jpLienzoDeTrabajo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, -1));

        jcbIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        jcbIngredientes.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jcbIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, -1));

        jcbCategorias.setBackground(new java.awt.Color(255, 255, 255));
        jcbCategorias.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jcbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, -1));

        jcbHorarios.setBackground(new java.awt.Color(255, 255, 255));
        jcbHorarios.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jcbHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 190, -1));

        jcbTipoDeCocina.setBackground(new java.awt.Color(255, 255, 255));
        jcbTipoDeCocina.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jcbTipoDeCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 190, -1));

        jbBuscar.setText("Buscar por ID");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 150, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Categoría:");
        jpLienzoDeTrabajo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, -1));

        jtfIDReceta.setBackground(new java.awt.Color(255, 255, 255));
        jtfIDReceta.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jtfIDReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 190, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("ID Receta:");
        jpLienzoDeTrabajo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jtfTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jtfTitulo.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jtfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 660, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Ingred. Ppal:");
        jpLienzoDeTrabajo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, -1));

        jcbFormaDeCoccion.setBackground(new java.awt.Color(255, 255, 255));
        jcbFormaDeCoccion.setForeground(new java.awt.Color(153, 0, 153));
        jpLienzoDeTrabajo.add(jcbFormaDeCoccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, -1));

        jbLimpiar.setBackground(new java.awt.Color(153, 0, 153));
        jbLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setMaximumSize(new java.awt.Dimension(90, 32));
        jbLimpiar.setPreferredSize(new java.awt.Dimension(90, 32));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 120, -1));

        jbEliminar.setBackground(new java.awt.Color(153, 0, 153));
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.setPreferredSize(new java.awt.Dimension(90, 32));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 110, 30));

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

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Título:");
        jpLienzoDeTrabajo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Ingredientes:");
        jpLienzoDeTrabajo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, -1));

        jtaCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jtaCuerpo.setColumns(20);
        jtaCuerpo.setForeground(new java.awt.Color(153, 0, 153));
        jtaCuerpo.setRows(5);
        jScrollPane1.setViewportView(jtaCuerpo);

        jpLienzoDeTrabajo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 430, 140));

        jtaIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        jtaIngredientes.setColumns(20);
        jtaIngredientes.setForeground(new java.awt.Color(153, 0, 153));
        jtaIngredientes.setRows(5);
        jScrollPane2.setViewportView(jtaIngredientes);

        jpLienzoDeTrabajo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 120));

        jbGuardar.setBackground(new java.awt.Color(153, 0, 153));
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.setPreferredSize(new java.awt.Dimension(90, 32));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jpLienzoDeTrabajo.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 110, -1));

        jpBackground.add(jpLienzoDeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 810, 450));

        jlFotoDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foto de base 980x654.png"))); // NOI18N
        jpBackground.add(jlFotoDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlCerrar.setBackground(new java.awt.Color(153, 0, 153));
        jlCerrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jlCerrar.setText("X");
        jpBackground.add(jlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 40, 40));

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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        //Si no completa el campo 'ID Receta'
        if (jtfIDReceta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo 'ID Receta'");

        } else {
            try {
                //Asignamos a una variable el dato ingresado en la vista
                int idRecetaBuscada = Integer.parseInt(jtfIDReceta.getText());

                //Instanciamos una receta y recetaData para usar luego
                RecetaData recetaD = new RecetaData();
                Receta recetaBuscada = new Receta();

                //Buscamos una receta por su id usando buscar de recetaData
                recetaBuscada = recetaD.buscarRecetaPorID(idRecetaBuscada);

                //Mostramos en la vista los datos de la receta encontrada
                jtfIDReceta.setText(Integer.toString(recetaBuscada.getId_receta()));
                jtfTitulo.setText(recetaBuscada.getTitulo());
                jtaIngredientes.setText(recetaBuscada.getIngredientes());
                jtaCuerpo.setText(recetaBuscada.getCuerpo());
                jcbCategorias.setSelectedItem(recetaBuscada.getCategoria());
                jcbIngredientes.setSelectedItem(recetaBuscada.getIngredientePrincipal());
                jcbHorarios.setSelectedItem(recetaBuscada.getTipoDeComida());
                jcbFormaDeCoccion.setSelectedItem(recetaBuscada.getFormaDeCoccion());
                jcbTipoDeCocina.setSelectedItem(recetaBuscada.getTipoDeCocina());
                
                if (recetaBuscada.isSinTACC()==true){
                    jrbSinGluten.setSelected(true);
                    jrbConGluten.setSelected(false);
                } else {
                    jrbConGluten.setSelected(true);
                    jrbSinGluten.setSelected(false);
                }
              
                
                //Habilitamos los botones 'Limpiar' y 'Eliminar'
                jbLimpiar.setEnabled(true);
                jbEliminar.setEnabled(true);

            } catch (NumberFormatException nfe) {
                //si ingresa letras o símbolos
                JOptionPane.showMessageDialog(this, "Ingrese sólo números");
                jtfIDReceta.setText("");
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(this,npe.getStackTrace());
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrbConGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConGlutenActionPerformed
        //Si está seleccionado el botón inhabilitamos el otro
        if (jrbConGluten.isSelected()) {
            jrbSinGluten.setSelected(false);
        }
    }//GEN-LAST:event_jrbConGlutenActionPerformed

    private void jrbSinGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSinGlutenActionPerformed
        //Si está seleccionado el botón inhabilitamos el otro
        if (jrbSinGluten.isSelected()) {
            jrbConGluten.setSelected(false);
        }

    }//GEN-LAST:event_jrbSinGlutenActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpia la pantalla para cargar una receta nueva
        jtfIDReceta.setText("");
        jtfTitulo.setText("");
        jtaIngredientes.setText("");
        jtaCuerpo.setText("");
        jcbCategorias.setSelectedItem("Selecciona la categoría:");
        jcbFormaDeCoccion.setSelectedItem("Selecciona la forma de cocción:");
        jcbIngredientes.setSelectedItem("Selecciona el Ingrediente:");
        jcbHorarios.setSelectedItem("Selecciona el horario:");
        jcbTipoDeCocina.setSelectedItem("Selecciona el tipo de cocina:");
        jrbConGluten.setSelected(true);
        jrbSinGluten.setSelected(false);
        jbLimpiar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
       AdminMenuPrincipal.volverALaFotoDeFondo();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //Si el campo ID Receta está vacío
        if (jtfIDReceta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo 'ID Receta'");

        } else {
            try {
                 //Creamos una variable con el ID tipeado en la vista
                int IDRecetaAEliminar = Integer.parseInt(jtfIDReceta.getText());
                
                //Instanciamos receta y recetaData para usar luego
                Receta rec = new Receta();
                RecetaData recetaD = new RecetaData();

                //Buscamos la receta con ese id y lo enviamos a la receta ya creada
                rec = recetaD.buscarRecetaPorID(IDRecetaAEliminar);

                //Eliminamos la receta llamando al método de recetaData
                recetaD.eliminarReceta(rec.getId_receta());

                //Limpiamos los campos de la vista
                jtfIDReceta.setText("");
                jtfTitulo.setText("");
                jtaIngredientes.setText("");
                jtaCuerpo.setText("");
                jrbConGluten.setSelected(false);
                jrbSinGluten.setSelected(false);
                jcbCategorias.setSelectedItem("Selecciona la categoría:");
                jcbIngredientes.setSelectedItem("Selecciona el Ingrediente:");
                jcbHorarios.setSelectedItem("Selecciona el horario:");
                jcbFormaDeCoccion.setSelectedItem("Selecciona la forma de cocción:");
                jcbTipoDeCocina.setSelectedItem("Selecciona el tipo de cocina:");
                

            } catch (NumberFormatException ex) {
                //Si no tipea un documento en la vista
                JOptionPane.showMessageDialog(null, "Ingrese un ID Receta");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
         //Instanciamos recetaData para usar luego
        RecetaData recetaD = new RecetaData();

        if (jtfIDReceta.getText().isEmpty()) {
            jtfIDReceta.setText("-1");
        }

        try {
            //creamos las variables y asignamos los valores de la vista
            String tituloAGuardar = jtfTitulo.getText();
            String ingredAGuardar = jtaIngredientes.getText();
            String cuerpoAGuardar = jtaCuerpo.getText();
            String categAGuardar = (String) jcbCategorias.getSelectedItem();
            String ingPpalAGuardar = (String) jcbIngredientes.getSelectedItem();
            String horarioAGuardar = (String) jcbHorarios.getSelectedItem();
            String formaAGuardar = (String) jcbFormaDeCoccion.getSelectedItem();
            String tipoAGuardar = (String) jcbTipoDeCocina.getSelectedItem();
            boolean sinGlutenAGuardar = false;
            if (jrbSinGluten.isSelected()){
                sinGlutenAGuardar = true;
            }

            //Instanciamos una receta con los parámetros anteriores
            Receta recetaAGuardar = new Receta(tituloAGuardar, ingredAGuardar, cuerpoAGuardar, sinGlutenAGuardar, categAGuardar, ingPpalAGuardar, horarioAGuardar, formaAGuardar, tipoAGuardar);

            //declaramos una variable bandera por si ya existe el id tipeado en vista
            boolean existeID = false;

            //Recorremos la lista de recetas existentes
            for (Receta existingReceta : recetaD.listarReceta()) {

                if (existingReceta.getId_receta() == Integer.parseInt(jtfIDReceta.getText())) {
                    //Si existe la receta, seteamos el id para poder acceder al método modificar; si no existe se activa la bandera más abajo 
                    recetaAGuardar.setId_receta(recetaD.buscarRecetaPorID(Integer.parseInt(jtfIDReceta.getText())).getId_receta());
                    existeID = true;
                    break;
                }
            }
            //Si existe la receta usa el método modificarReceta; si no, guardarReceta
            if (existeID == true) {
                recetaD.modificarReceta(recetaAGuardar);
            } else {
                recetaD.guardarReceta(recetaAGuardar);
            }

            //Habilitamos los botones 'Eliminar' y 'Limpiar'
            jbEliminar.setEnabled(true);
            jbLimpiar.setEnabled(true);
            
            //Limpiamos los campos de la vista
            jtfIDReceta.setText("");
            jtfTitulo.setText("");
            jtaIngredientes.setText("");
            jtaCuerpo.setText("");
            jcbCategorias.setSelectedItem("Selecciona la categoría:");
            jcbIngredientes.setSelectedItem("Selecciona el Ingrediente:");
            jcbHorarios.setSelectedItem("Selecciona el horario:");
            jcbFormaDeCoccion.setSelectedItem("Selecciona la forma de cocción:");
            jcbTipoDeCocina.setSelectedItem("Selecciona el tipo de cocina:");
            jrbConGluten.setSelected(true);
            jrbSinGluten.setSelected(false);
            

        } catch (NullPointerException ex) {
            //Si algún campo está vacío
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } catch (NumberFormatException ex) {
            //Si no usa números enteros en todos los campos
            JOptionPane.showMessageDialog(null, "Use sólo números enteros");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseEntered
        jbCerrar.setBackground(naranja);
        jbCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jbCerrarMouseEntered

    private void jbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseExited
       jbCerrar.setBackground(violeta);
       jbCerrar.setForeground(Color.white);
       
    }//GEN-LAST:event_jbCerrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbCategorias;
    private javax.swing.JComboBox<String> jcbFormaDeCoccion;
    private javax.swing.JComboBox<String> jcbHorarios;
    private javax.swing.JComboBox<String> jcbIngredientes;
    private javax.swing.JComboBox<String> jcbTipoDeCocina;
    private javax.swing.JLabel jlCerrar;
    private javax.swing.JLabel jlFotoDeFondo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpLienzoDeTrabajo;
    private javax.swing.JRadioButton jrbConGluten;
    private javax.swing.JRadioButton jrbSinGluten;
    private javax.swing.JTextArea jtaCuerpo;
    private javax.swing.JTextArea jtaIngredientes;
    private javax.swing.JTextField jtfIDReceta;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables


    private void cargarCategoriasAlComboBox() {

        jcbCategorias.addItem("Selecciona la categoría:");
        jcbCategorias.addItem(Categoria.AGRIDULCE.toString());
        jcbCategorias.addItem(Categoria.ARROCES_GUISOS_SALTEADOS_RELLENOS.toString());
        jcbCategorias.addItem(Categoria.BURGERS_SEITAN_MILANESAS.toString());
        jcbCategorias.addItem(Categoria.DULCES_TRUFAS.toString());
        jcbCategorias.addItem(Categoria.ENSALADAS.toString());
        jcbCategorias.addItem(Categoria.LICORES.toString());
        jcbCategorias.addItem(Categoria.PANES.toString());
        jcbCategorias.addItem(Categoria.PARRILLADA_EMPANADAS_BROCHETTES.toString());
        jcbCategorias.addItem(Categoria.PROBIOTICOS_ESCABECHES.toString());
        jcbCategorias.addItem(Categoria.QUESOS_PATES.toString());
        jcbCategorias.addItem(Categoria.SALSAS.toString());
        jcbCategorias.addItem(Categoria.SMOOTHIES_LECHES.toString());
        jcbCategorias.addItem(Categoria.SNACKS_FINGERFOOD.toString());
        jcbCategorias.addItem(Categoria.TARTAS_TORTILLAS.toString());
        jcbCategorias.addItem(Categoria.TOFU.toString());
        jcbCategorias.addItem(Categoria.TORTAS_MUFFINS.toString());

    }

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

    private void cargarHorariosAlComboBox() {

        jcbHorarios.addItem("Selecciona el horario:");
        jcbHorarios.addItem(TipoDeComida_Horario.ADEREZO.toString());
        jcbHorarios.addItem(TipoDeComida_Horario.DESAYUNO_MERIENDA.toString());
        jcbHorarios.addItem(TipoDeComida_Horario.ENTRADA.toString());
        jcbHorarios.addItem(TipoDeComida_Horario.HORA_DEL_CAFE_O_MATE.toString());
        jcbHorarios.addItem(TipoDeComida_Horario.PLATO_PRINCIPAL.toString());
        jcbHorarios.addItem(TipoDeComida_Horario.POSTRE.toString());

    }

    private void cargarTiposDeCocinaAlComboBox() {

        jcbTipoDeCocina.addItem("Selecciona el tipo de cocina:");
        jcbTipoDeCocina.addItem(TipoDeCocina.AMERICANA.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.ARABE.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.CRIOLLA.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.ESPAÑOLA.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.EUROPEA.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.FESTIVA.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.HINDU.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.ITALIANA.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.ORIENTAL.toString());
        jcbTipoDeCocina.addItem(TipoDeCocina.UNIVERSAL.toString());

    }

    private void cargarFormasDeCoccionAlComboBox() {

        jcbFormaDeCoccion.addItem("Selecciona la forma de cocción:");
        jcbFormaDeCoccion.addItem(FormaDeCoccion.A_LA_OLLA.toString());
        jcbFormaDeCoccion.addItem(FormaDeCoccion.A_LA_SARTEN.toString());
        jcbFormaDeCoccion.addItem(FormaDeCoccion.AL_HORNO.toString());
        jcbFormaDeCoccion.addItem(FormaDeCoccion.AL_VAPOR.toString());
        jcbFormaDeCoccion.addItem(FormaDeCoccion.SIN_COCCION.toString());
        
    }
}
