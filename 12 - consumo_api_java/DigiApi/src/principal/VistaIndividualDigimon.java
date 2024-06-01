/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.net.URL;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import util.ConsumoAPI;

/**
 *
 * @author johan
 */
public class VistaIndividualDigimon extends javax.swing.JFrame {

    JsonObject digimonActual;
    String nombreDigimon;
    String url_imagen;
    String url_datos_digimon;
    ConsumoAPI consumo = new ConsumoAPI();
    public VistaIndividualDigimon(JsonObject digimonActual) {
        this.digimonActual = digimonActual;
        this.nombreDigimon = digimonActual.get("name").getAsString();
        this.url_imagen = digimonActual.get("image").getAsString();
        this.url_datos_digimon = digimonActual.get("href").getAsString();
        initComponents();
        initAlternComponents();
        imprimirDatosDigimon();
    }

    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public void imprimirDatosDigimon(){
        String consumo_datos_digimon = consumo.consumoGET(url_datos_digimon);
        JsonObject digimon_actual = JsonParser.parseString(consumo_datos_digimon).getAsJsonObject();
        JsonArray lista_campos_batalla = digimon_actual.get("fields").getAsJsonArray();
        System.out.println("Prueba--- "+lista_campos_batalla);
        panelCampoBatalla.setLayout(new BoxLayout(panelCampoBatalla,BoxLayout.X_AXIS));
        
        for (int i = 0; i < lista_campos_batalla.size(); i++) {
            JsonObject digimon_temporal =  lista_campos_batalla.get(i).getAsJsonObject();
            String nombre_campo_batalla = digimon_temporal.get("field").getAsString();
            System.out.println("nombre campo batalla "+nombre_campo_batalla);
            CampoBatalla nuevoPanel = new CampoBatalla(digimon_temporal);
            panelCampoBatalla.add(nuevoPanel);
        }
        
        panelCampoBatalla.repaint();
        panelCampoBatalla.revalidate();
        etq_nombre.setText(nombreDigimon);
        
        try {
            URL url = new URL(url_imagen);
            Image imagen = getToolkit().createImage(url);
            imagen = imagen.getScaledInstance(200, 150,Image.SCALE_SMOOTH);
            etq_imagen_digimon.setIcon(new ImageIcon(imagen));
            
        } catch (Exception e) {
            System.out.println("Error -> "+e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen_digimon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scroll_campo_batalla = new javax.swing.JScrollPane();
        panelCampoBatalla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("NOMBRE");

        etq_imagen_digimon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMPOS DE BATALLA");

        scroll_campo_batalla.setBorder(null);
        scroll_campo_batalla.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelCampoBatalla.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelCampoBatallaLayout = new javax.swing.GroupLayout(panelCampoBatalla);
        panelCampoBatalla.setLayout(panelCampoBatallaLayout);
        panelCampoBatallaLayout.setHorizontalGroup(
            panelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        panelCampoBatallaLayout.setVerticalGroup(
            panelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        scroll_campo_batalla.setViewportView(panelCampoBatalla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(etq_imagen_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_campo_batalla)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_imagen_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_campo_batalla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_imagen_digimon;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCampoBatalla;
    private javax.swing.JScrollPane scroll_campo_batalla;
    // End of variables declaration//GEN-END:variables
}
