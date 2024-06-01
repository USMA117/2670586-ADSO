
package principal;

import com.google.gson.JsonObject;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author johan
 */
public class CampoBatalla extends javax.swing.JPanel {

    JsonObject digimon_actual;
    String nombre_campo_batalla;
    String url_imagen_campo_batalla;
    public CampoBatalla(JsonObject digimon_actual) {
        this.digimon_actual = digimon_actual;
        this.nombre_campo_batalla = digimon_actual.get("field").getAsString();
        this.url_imagen_campo_batalla = digimon_actual.get("image").getAsString();
        initComponents();
        imprimirCampoBatalla();
    }
    public void imprimirCampoBatalla(){
        try {
            URL url_imagen = new URL(url_imagen_campo_batalla);
            Image imagen_digimon = getToolkit().createImage(url_imagen);
            imagen_digimon = imagen_digimon.getScaledInstance(70, 60, Image.SCALE_SMOOTH);
            etq_imagen_campo_batalla.setIcon(new ImageIcon(imagen_digimon));
        } catch (Exception e) {
            System.out.println("Error en: "+e.getMessage());
        }
        etq_nombre_campo_batalla.setText(nombre_campo_batalla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_imagen_campo_batalla = new javax.swing.JLabel();
        etq_nombre_campo_batalla = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        etq_imagen_campo_batalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nombre_campo_batalla.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        etq_nombre_campo_batalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etq_nombre_campo_batalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_imagen_campo_batalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_imagen_campo_batalla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre_campo_batalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_imagen_campo_batalla;
    private javax.swing.JLabel etq_nombre_campo_batalla;
    // End of variables declaration//GEN-END:variables
}
