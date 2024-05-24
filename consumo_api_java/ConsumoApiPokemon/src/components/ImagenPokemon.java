/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;

/**
 *
 * @author johan
 */
public class ImagenPokemon extends javax.swing.JPanel {

    JsonObject pokemon;
    String nombre_pokemon;
    ConsumoAPI consumo;
    String urlPokemon;
    DefaultTableModel  modelo;
    int pokemonActual;
    public ImagenPokemon(JsonObject pokemon,ConsumoAPI consumo,int pokemonActual) {
        this.pokemon = pokemon;
        this.nombre_pokemon = pokemon.get("name").getAsString();
        this.consumo = consumo;
        this.urlPokemon = pokemon.get("url").getAsString();
        this.pokemonActual = pokemonActual;
        initComponents();
        initAlterntComponents();
        // System.out.println("Este es el panel de la imagen");
        obtenerImagen(urlPokemon);
    }
    
    public void initAlterntComponents(){
        
        Image icono_siguiente = getToolkit().createImage(ClassLoader.getSystemResource("img/img_siguiente.png"));
        icono_siguiente = icono_siguiente.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        etqSiguiente.setIcon(new ImageIcon(icono_siguiente));
        
        Image icono_regresar = getToolkit().createImage(ClassLoader.getSystemResource("img/img_regresar.png"));
        icono_regresar = icono_regresar.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        etqRegresar.setIcon(new ImageIcon(icono_regresar));
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombrePokemon = new javax.swing.JLabel();
        etqImagenPokemon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_habilidades = new javax.swing.JTable();
        etqSiguiente = new javax.swing.JLabel();
        etqRegresar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(460, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombrePokemon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nombrePokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePokemon.setText("Selecciona un pokemon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombrePokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombrePokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        etqImagenPokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tabla_habilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Habilidad", "Url"
            }
        ));
        jScrollPane1.setViewportView(tabla_habilidades);
        if (tabla_habilidades.getColumnModel().getColumnCount() > 0) {
            tabla_habilidades.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        etqSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etqSiguiente.setFocusable(false);
        etqSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqSiguienteMouseClicked(evt);
            }
        });

        etqRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etqRegresar.setFocusable(false);
        etqRegresar.setPreferredSize(new java.awt.Dimension(30, 30));
        etqRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(etqRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(etqImagenPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(etqSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqImagenPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(etqRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(etqSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etqSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqSiguienteMouseClicked
        pokemonActual++;
        urlPokemon = "https://pokeapi.co/api/v2/pokemon/"+pokemonActual+"/";
        obtenerImagen(urlPokemon);
        System.out.println("pokemonActual -> "+pokemonActual);
    }//GEN-LAST:event_etqSiguienteMouseClicked

    private void etqRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqRegresarMouseClicked
        pokemonActual--;
        urlPokemon = "https://pokeapi.co/api/v2/pokemon/"+pokemonActual+"/";
        obtenerImagen(urlPokemon);
    }//GEN-LAST:event_etqRegresarMouseClicked
    public void obtenerImagen(String urlPokemon){
        
        if(pokemonActual == 1){
            etqRegresar.setEnabled(false);
        }else{
            etqRegresar.setEnabled(true);
        }
        Gson gson = new Gson();
        String respuestaPokeApi = consumo.consumoGET(urlPokemon);
        JsonObject pokemones = gson.fromJson(respuestaPokeApi, JsonObject.class);
        nombre_pokemon = pokemones.get("name").getAsString();
        nombrePokemon.setText(nombre_pokemon);

        imprimirHabilidadesTabla(pokemones );
        JsonObject sprites = pokemones.get("sprites").getAsJsonObject();
        String front_default = sprites.get("front_default").getAsString();
        System.out.println("front_default "+front_default);
        JsonObject other = sprites.get("other").getAsJsonObject();
        JsonObject dream_world = other.get("dream_world").getAsJsonObject();
        String imagen_url = dream_world.get("front_default").getAsString();

        System.out.println("Datos pokemon: "+imagen_url);
        
        try {
            // Leer la imagen desde la URL
            URL url = new URL(front_default);
            System.out.println("url -- "+url);
            Image imagen = ImageIO.read(url);

            // Escalar la imagen a un tamaño específico
            Image imagenEscalada = imagen.getScaledInstance(200, 155, Image.SCALE_SMOOTH);

            // Crear un ImageIcon con la imagen escalada
            ImageIcon fotoPokemon = new ImageIcon(imagenEscalada);

            // Establecer el ImageIcon en el JLabel
            etqImagenPokemon.setIcon(fotoPokemon);
        } catch (IOException e) {
            e.printStackTrace();
        }
                
        //listaPokemones = pokemones.getAsJsonArray("results");
    }
    public void imprimirHabilidadesTabla(JsonObject pokemones ){
        modelo = (DefaultTableModel) tabla_habilidades.getModel();
        modelo.setRowCount(0);
        JsonArray listaHabilidades = pokemones.getAsJsonArray("abilities");
        for(int i= 0; i < listaHabilidades.size(); i++){
            JsonObject temp = listaHabilidades.get(i).getAsJsonObject();
            JsonObject habilidadObjecto = temp.get("ability").getAsJsonObject();
            String urlPokemon = habilidadObjecto.get("url").getAsString();
            String nombreHabilidad = habilidadObjecto.get("name").getAsString();
            
            Object dato = new Object[]{(i+1),nombreHabilidad,urlPokemon};
            modelo.addRow((Object[]) dato);
        }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqImagenPokemon;
    private javax.swing.JLabel etqRegresar;
    private javax.swing.JLabel etqSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrePokemon;
    private javax.swing.JTable tabla_habilidades;
    // End of variables declaration//GEN-END:variables
}
