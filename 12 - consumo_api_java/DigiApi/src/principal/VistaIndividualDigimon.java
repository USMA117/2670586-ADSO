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
public class VistaIndividualDigimon extends javax.swing.JPanel {

    JsonObject digimonActual;
    JPanel panelDigimones;
    String nombreDigimon;
    String urlImagen;
    String id;
    public VistaIndividualDigimon(JsonObject digimonActual,JPanel panelDigimones) {
        this.digimonActual = digimonActual;
        this.nombreDigimon = digimonActual.get("name").getAsString();
        this.urlImagen = digimonActual.get("image").getAsString();
        this.id = digimonActual.get("id").getAsString();
        this.panelDigimones = panelDigimones;
        initComponents();
        setVisible(true);
        imprimirDigimon();
    }

    public void imprimirDigimon(){
        id_digimon.setText(id);
        etq_nombre.setText(nombreDigimon);
        try {
            URL url = new URL(urlImagen);
            Image imagen = getToolkit().createImage(url);
            imagen = imagen.getScaledInstance(250, 250,Image.SCALE_SMOOTH);
            etq_imagen_digimon.setIcon(new ImageIcon(imagen));
            
        } catch (Exception e) {
            System.out.println("Error -> "+e.getMessage());
        }
        etq_imagen_digimon.setText(nombreDigimon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_digimon = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen_digimon = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 540));

        id_digimon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_digimon.setText("ID");

        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("Nombre");

        etq_imagen_digimon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_imagen_digimon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_regresar.setText("REGRESAR");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_regresar)
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(etq_imagen_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(id_digimon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_nombre)
                    .addComponent(btn_regresar))
                .addGap(18, 18, 18)
                .addComponent(etq_imagen_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        PaginaInicial inicio = new PaginaInicial();
        panelDigimones.removeAll();
        panelDigimones.add(inicio);
        
    }//GEN-LAST:event_btn_regresarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel etq_imagen_digimon;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel id_digimon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
