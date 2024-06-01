/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author INSTRUCTOR
 */
public class VistaDigimon extends javax.swing.JPanel {

    JsonObject digimonActual;
    String nombreDigimon;
    String urlImagen;
    public VistaDigimon(JsonObject digimonActual) {
        this.digimonActual = digimonActual;
        this.nombreDigimon = digimonActual.get("name").getAsString();
        this.urlImagen = digimonActual.get("image").getAsString();
        initComponents();
        imprimirDigimon();
        setVisible(true);
    }

    public void imprimirDigimon(){
        try {
            URL url = new URL(urlImagen);
            Image imagen = getToolkit().createImage(url);
            imagen = imagen.getScaledInstance(180, 150,Image.SCALE_SMOOTH);
            imgDigimon.setIcon(new ImageIcon(imagen));
            
        } catch (Exception e) {
            System.out.println("Error -> "+e.getMessage());
        }
        etqNombreDigimon.setText(nombreDigimon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgDigimon = new javax.swing.JLabel();
        etqNombreDigimon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(200, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        imgDigimon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDigimon.setMaximumSize(new java.awt.Dimension(186, 152));

        etqNombreDigimon.setBackground(new java.awt.Color(255, 255, 255));
        etqNombreDigimon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgDigimon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqNombreDigimon, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imgDigimon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombreDigimon, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        VistaIndividualDigimon nuevo = new VistaIndividualDigimon(digimonActual);
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        Border borde = new LineBorder(Color.BLUE, 2);
        this.setBorder(borde);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        Border borde = new LineBorder(Color.WHITE, 2);
        this.setBorder(borde);
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqNombreDigimon;
    private javax.swing.JLabel imgDigimon;
    // End of variables declaration//GEN-END:variables
}
