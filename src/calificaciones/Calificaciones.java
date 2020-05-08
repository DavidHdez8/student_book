/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Calificaciones extends javax.swing.JFrame {
    public static double calificacion1, calificacion2, calificacion3, calificacion4, calificacion5, suma, prom;

    /**
     * Creates new form Calificaciones
     */
    public Calificaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNoControl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCalificacion1 = new javax.swing.JTextField();
        txtCalificacion2 = new javax.swing.JTextField();
        txtCalificacion3 = new javax.swing.JTextField();
        txtCalificacionFinal = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCalificacion4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        txtPromediar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtCalificacion5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtNuevo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Número de control");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setText("Calificación Tema 2");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel10.setText("Calificación Tema 1");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel11.setText("Calificación Tema 3");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel12.setText("Calificación Tema 5");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel13.setText("Calificación Tema 4");

        txtCalificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacion1ActionPerformed(evt);
            }
        });

        txtCalificacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacion2ActionPerformed(evt);
            }
        });

        txtCalificacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacion3ActionPerformed(evt);
            }
        });

        txtCalificacionFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacionFinalActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Ingrese el número de control del alumno");

        txtCalificacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacion4ActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtPromediar.setText("Promediar");
        txtPromediar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPromediarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText("Calificación Final");

        txtCalificacion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacion5ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtNuevo.setText("Nuevo registro");
        txtNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCalificacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCalificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCalificacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3))
                                .addGap(86, 86, 86))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCalificacionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCalificacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCalificacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPromediar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(79, 79, 79))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_status)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoControl, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtCalificacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCalificacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtCalificacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCalificacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalificacionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPromediar)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(txtNuevo)))
                .addGap(58, 58, 58)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_status)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCalificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacion1ActionPerformed
        //Calificacion 1
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("insert into calificaciones_alumnos values(?,?,?,?,?,?,?,?)");
            
            pre.setString(3, txtCalificacion1.getText());
            pre.executeUpdate();
            
            txtCalificacion1.setText("");
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_txtCalificacion1ActionPerformed

    private void txtCalificacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacion2ActionPerformed
        //Calificacion2
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("insert into calificaciones_alumnos values(?,?,?,?,?,?,?,?)");
            
            pre.setString(4, txtCalificacion2.getText());
            pre.executeUpdate();

            txtCalificacion2.setText("");
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_txtCalificacion2ActionPerformed

    private void txtCalificacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacion3ActionPerformed
        //Calificacion 3
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("insert into calificaciones_alumnos values(?,?,?,?,?,?,?,?)");
            
            pre.setString(5, txtCalificacion3.getText());
            pre.executeUpdate();
 
            txtCalificacion3.setText("");

        }catch(Exception e){
            
        }
    }//GEN-LAST:event_txtCalificacion3ActionPerformed

    private void txtCalificacionFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacionFinalActionPerformed
        //Calificacion 5
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("insert into calificaciones_alumnos values(?,?,?,?,?,?,?,?)");
            
            pre.setString(8, txtCalificacionFinal.getText());
            pre.executeUpdate();

            txtCalificacionFinal.setText("");
            
            
        }catch(Exception e){
            
        }
            
    }//GEN-LAST:event_txtCalificacionFinalActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtCalificacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacion4ActionPerformed
        //Calificacion 4
        
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("insert into calificaciones_alumnos values(?,?,?,?,?,?,?,?)");
            
            pre.setString(6, txtCalificacion4.getText());
            pre.executeUpdate();
            
            txtCalificacion4.setText("");        
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_txtCalificacion4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("insert into calificaciones_alumnos values(?,?,?,?,?,?,?,?)");
            
            pre.setString(1, txtNoControl.getText().trim()); //No. Control
            pre.setString(2, txtNombre.getText().trim()); //Nombre
            pre.setString(3, txtCalificacion1.getText());
            pre.setString(4, txtCalificacion2.getText());
            pre.setString(5, txtCalificacion3.getText());
            pre.setString(6, txtCalificacion4.getText());
            pre.setString(7, txtCalificacion5.getText());
            pre.setString(8, txtCalificacionFinal.getText());
            pre.executeUpdate();
           
            txtNoControl.setText("");
            txtNombre.setText("");
            txtCalificacion1.setText("");
            txtCalificacion2.setText("");
            txtCalificacion3.setText("");
            txtCalificacion4.setText("");
            txtCalificacion5.setText("");
            txtCalificacionFinal.setText("");
            label_status.setText("Registro Exitoso.");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrioun error al querer registrar los datos: " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("select * from calificaciones_alumnos where NUM_CONTROL = ?");
            
            pre.setString(1, txtBuscar.getText().trim());
            
            ResultSet rs = pre.executeQuery();
            
            if(rs.next()){
                txtNombre.setText(rs.getString("NOMBRE"));
                txtNoControl.setText(rs.getString("NUM_CONTROL"));
                txtCalificacion1.setText(rs.getString("TEMA1"));
                txtCalificacion2.setText(rs.getString("TEMA2"));
                txtCalificacion3.setText(rs.getString("TEMA3"));
                txtCalificacion4.setText(rs.getString("TEMA4"));
                txtCalificacion5.setText(rs.getString("TEMA5"));
                txtCalificacionFinal.setText(rs.getString("CAL_FINAL"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
            }
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCalificacion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalificacion5ActionPerformed

    private void txtPromediarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPromediarActionPerformed
        int n1, n2, n3, n4, n5;
        double promedio;
        
        n1 = Integer.parseInt(txtCalificacion1.getText());
        n2 = Integer.parseInt(txtCalificacion2.getText());
        n3 = Integer.parseInt(txtCalificacion3.getText());
        n4 = Integer.parseInt(txtCalificacion4.getText());
        n5 = Integer.parseInt(txtCalificacion5.getText());
        
        promedio = (n1 + n2 + n3 + n4 + n5) / 5;
        
        txtCalificacionFinal.setText(String.valueOf(promedio));
    }//GEN-LAST:event_txtPromediarActionPerformed

    private void txtNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoActionPerformed
        txtNombre.setText("");
        txtNoControl.setText("");
        txtCalificacion1.setText("");
        txtCalificacion2.setText("");
        txtCalificacion3.setText("");
        txtCalificacion4.setText("");
        txtCalificacion5.setText("");
        txtCalificacionFinal.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_txtNuevoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try{
            String NUM_CONTROL = txtBuscar.getText().trim();
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("update calificaciones_alumnos set NOMBRE = ?, TEMA1 = ?, TEMA2 = ?, TEMA3 = ?, TEMA4 = ?, TEMA5 = ?, CAL_FINAL = ? where NUM_CONTROL = " + NUM_CONTROL);
            
            pre.setString(1, txtNombre.getText().trim());
            pre.setString(2, txtCalificacion1.getText());
            pre.setString(3, txtCalificacion2.getText());
            pre.setString(4, txtCalificacion3.getText());
            pre.setString(5, txtCalificacion4.getText());
            pre.setString(6, txtCalificacion5.getText());
            pre.setString(7, txtCalificacionFinal.getText());
            pre.executeUpdate();
            
            label_status.setText("Modificacion realizada.");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al querer modificar los datos: " + e);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            PreparedStatement pre = connect.prepareStatement("delete from calificaciones_alumnos where NUM_CONTROL = ?");
            
            pre.setString(1, txtBuscar.getText().trim());
            pre.executeUpdate();
        
            label_status.setText("Registro eliminado exitosamente.");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al querer eliminar los datos: " + e);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCalificacion1;
    private javax.swing.JTextField txtCalificacion2;
    private javax.swing.JTextField txtCalificacion3;
    private javax.swing.JTextField txtCalificacion4;
    private javax.swing.JTextField txtCalificacion5;
    private javax.swing.JTextField txtCalificacionFinal;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JButton txtNuevo;
    private javax.swing.JButton txtPromediar;
    // End of variables declaration//GEN-END:variables
}
