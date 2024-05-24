/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import Utils.BaseDatos;
import Utils.Persona;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Statement;

public class ActualizarPersona extends javax.swing.JFrame {
    BaseDatos baseDatos = new BaseDatos();
    
    Connection conexion = baseDatos.getConexion();
    Statement manipularBD = baseDatos.getManipularBD();
    Persona listado[];
    String cedula;
    
    public ActualizarPersona(String cedula) {
        this.cedula = cedula;
        this.listado = baseDatos.extraerPersonas();
        initComponents();
        initAltertComponents();
        
    }
    
    public void initAltertComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        for(int i = 0; listado[i] != null;i++){
            if(cedula.equals(listado[i].getDocumento())){
                campoActualizarCedula.setText(listado[i].getDocumento());
                campoActualizarNombres.setText(listado[i].getNombres());
                campoActualizarApellidos.setText(listado[i].getApellidos());
                campoActualizarTelefono.setText(listado[i].getTelefono());
                campoActualizarDireccion.setText(listado[i].getDireccion());
                campoActualizarCorreo.setText(listado[i].getCorreo());
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etqCedula1 = new javax.swing.JLabel();
        campoActualizarCedula = new javax.swing.JTextField();
        etqNombres1 = new javax.swing.JLabel();
        campoActualizarNombres = new javax.swing.JTextField();
        etqApellidos1 = new javax.swing.JLabel();
        campoActualizarApellidos = new javax.swing.JTextField();
        campoActualizarTelefono = new javax.swing.JTextField();
        etqTelefono1 = new javax.swing.JLabel();
        etqDireccion1 = new javax.swing.JLabel();
        campoActualizarDireccion = new javax.swing.JTextField();
        etqCorreo1 = new javax.swing.JLabel();
        campoActualizarCorreo = new javax.swing.JTextField();
        btnActualizarPersona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR PERSONA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        etqCedula1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCedula1.setText("Cedula");

        campoActualizarCedula.setEditable(false);

        etqNombres1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqNombres1.setText("Nombres");

        campoActualizarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActualizarNombresActionPerformed(evt);
            }
        });

        etqApellidos1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqApellidos1.setText("Apellidos");

        etqTelefono1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqTelefono1.setText("Telefono");

        etqDireccion1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqDireccion1.setText("Direccion");

        etqCorreo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCorreo1.setText("Correo");

        btnActualizarPersona.setBackground(new java.awt.Color(0, 0, 255));
        btnActualizarPersona.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnActualizarPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarPersona.setText("ACTUALIZAR");
        btnActualizarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnActualizarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqCedula1)
                                .addComponent(campoActualizarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqNombres1)
                                .addComponent(campoActualizarNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqApellidos1)
                                .addComponent(campoActualizarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqTelefono1)
                                .addComponent(campoActualizarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqDireccion1)
                                .addComponent(campoActualizarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqCorreo1)
                                .addComponent(campoActualizarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(btnActualizarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etqCedula1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoActualizarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etqNombres1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoActualizarNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etqApellidos1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoActualizarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etqTelefono1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoActualizarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etqDireccion1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoActualizarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etqCorreo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoActualizarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPersonaActionPerformed
        
        String cedula = campoActualizarCedula.getText();
        String nombres = campoActualizarNombres.getText();
        String apellidos = campoActualizarApellidos.getText();
        String telefono = campoActualizarTelefono.getText();
        String direccion = campoActualizarDireccion.getText();
        String correo = campoActualizarCorreo.getText();
        
        baseDatos.actualizarPersona(cedula, nombres, apellidos, telefono, direccion, correo);
        
        dispose();
    }//GEN-LAST:event_btnActualizarPersonaActionPerformed

    private void campoActualizarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActualizarNombresActionPerformed
        
        
    }//GEN-LAST:event_campoActualizarNombresActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPersona;
    private javax.swing.JTextField campoActualizarApellidos;
    private javax.swing.JTextField campoActualizarCedula;
    private javax.swing.JTextField campoActualizarCorreo;
    private javax.swing.JTextField campoActualizarDireccion;
    private javax.swing.JTextField campoActualizarNombres;
    private javax.swing.JTextField campoActualizarTelefono;
    private javax.swing.JLabel etqApellidos1;
    private javax.swing.JLabel etqCedula1;
    private javax.swing.JLabel etqCorreo1;
    private javax.swing.JLabel etqDireccion1;
    private javax.swing.JLabel etqNombres1;
    private javax.swing.JLabel etqTelefono1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
