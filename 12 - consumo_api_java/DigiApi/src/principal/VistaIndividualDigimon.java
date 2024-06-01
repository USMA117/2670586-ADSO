/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
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
    String consumo_datos_digimon;
    JsonObject datos_digimon_actual;
    ConsumoAPI consumo = new ConsumoAPI();
    public VistaIndividualDigimon(JsonObject digimonActual) {
        this.digimonActual = digimonActual;
        this.nombreDigimon = digimonActual.get("name").getAsString();
        this.url_imagen = digimonActual.get("image").getAsString();
        this.url_datos_digimon = digimonActual.get("href").getAsString();
        this.consumo_datos_digimon = consumo.consumoGET(url_datos_digimon);
        this.datos_digimon_actual = JsonParser.parseString(consumo_datos_digimon).getAsJsonObject();
        initComponents();
        initAlternComponents();
        imprimirDatosTablas();
        imprimirDatosDigimon();
    }

    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        tabla_niveles.getTableHeader().setBackground(Color.black);
        tabla_atributos.getTableHeader().setBackground(Color.black);
        tabla_tipos.getTableHeader().setBackground(Color.black);
        
        tabla_niveles.getTableHeader().setForeground(Color.white);
        tabla_atributos.getTableHeader().setForeground(Color.white);
        tabla_tipos.getTableHeader().setForeground(Color.white);
    }
    
    public void imprimirDatosDigimon(){
        JsonArray lista_campos_batalla = datos_digimon_actual.get("fields").getAsJsonArray();
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
    
    public void imprimirDatosTablas(){
        DefaultTableModel modelo_tabla_niveles = (DefaultTableModel) tabla_niveles.getModel();
        DefaultTableModel modelo_tabla_atributos = (DefaultTableModel) tabla_atributos.getModel();
        DefaultTableModel modelo_tabla_tipos = (DefaultTableModel) tabla_tipos.getModel();
        
        modelo_tabla_niveles.setRowCount(0);
        modelo_tabla_atributos.setRowCount(0);
        modelo_tabla_tipos.setRowCount(0);

        JsonArray lista_niveles = datos_digimon_actual.get("levels").getAsJsonArray();
        JsonArray lista_atributos = datos_digimon_actual.get("attributes").getAsJsonArray();
        JsonArray lista_tipos = datos_digimon_actual.get("types").getAsJsonArray();
        
        System.out.println("Lista niveles "+lista_niveles);
        System.out.println("Lista atributos "+lista_atributos);
        System.out.println("Lista tipos "+lista_tipos);
        
        for (int i = 0; i < lista_niveles.size(); i++) {
            JsonObject nivel = lista_niveles.get(i).getAsJsonObject();
            String nombre_nivel = nivel.get("level").getAsString();
            Object dato = new Object[]{nombre_nivel};
            modelo_tabla_niveles.addRow((Object[]) dato);
        }
        
        for (int i = 0; i < lista_atributos.size(); i++) {
            JsonObject atributo = lista_atributos.get(i).getAsJsonObject();
            String nombre_atributo = atributo.get("attribute").getAsString();
            Object dato = new Object[]{nombre_atributo};
            modelo_tabla_atributos.addRow((Object[]) dato);
        }
        
        for(int i = 0;i < lista_tipos.size();i++){
            JsonObject tipo = lista_tipos.get(i).getAsJsonObject();
            String nombre_tipo = tipo.get("type").getAsString();
            Object dato = new Object[]{nombre_tipo};
            modelo_tabla_tipos.addRow((Object[]) dato);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tipos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_niveles = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_atributos = new javax.swing.JTable();

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
            .addGap(0, 440, Short.MAX_VALUE)
        );
        panelCampoBatallaLayout.setVerticalGroup(
            panelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        scroll_campo_batalla.setViewportView(panelCampoBatalla);

        jScrollPane1.setBorder(null);

        tabla_tipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tipos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_tipos);
        if (tabla_tipos.getColumnModel().getColumnCount() > 0) {
            tabla_tipos.getColumnModel().getColumn(0).setResizable(false);
        }

        jScrollPane2.setBorder(null);

        tabla_niveles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_niveles.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabla_niveles);
        if (tabla_niveles.getColumnModel().getColumnCount() > 0) {
            tabla_niveles.getColumnModel().getColumn(0).setResizable(false);
        }

        jScrollPane3.setBorder(null);

        tabla_atributos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Atributos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_atributos);
        if (tabla_atributos.getColumnModel().getColumnCount() > 0) {
            tabla_atributos.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll_campo_batalla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(etq_imagen_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_imagen_digimon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCampoBatalla;
    private javax.swing.JScrollPane scroll_campo_batalla;
    private javax.swing.JTable tabla_atributos;
    private javax.swing.JTable tabla_niveles;
    private javax.swing.JTable tabla_tipos;
    // End of variables declaration//GEN-END:variables
}
