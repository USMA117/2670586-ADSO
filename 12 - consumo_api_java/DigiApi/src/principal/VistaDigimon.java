/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import com.google.gson.JsonObject;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author INSTRUCTOR
 */
public class VistaDigimon extends javax.swing.JPanel {

    JsonObject digimonActual;
    String nombreDigimon;
    String urlImagen;
    JPanel panelDigimones;
    public VistaDigimon(JsonObject digimonActual,JPanel panelDigimones) {
        this.digimonActual = digimonActual;
        this.nombreDigimon = digimonActual.get("name").getAsString();
        this.urlImagen = digimonActual.get("image").getAsString();
        this.panelDigimones = panelDigimones;
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

        setMaximumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(200, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
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
        System.out.println("holiiii "+nombreDigimon);
        panelDigimones.removeAll();

        VistaIndividualDigimon nuevo = new VistaIndividualDigimon(digimonActual,panelDigimones);
        
        panelDigimones.add(nuevo);
        
        panelDigimones.revalidate();
        panelDigimones.repaint();
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqNombreDigimon;
    private javax.swing.JLabel imgDigimon;
    // End of variables declaration//GEN-END:variables
}
