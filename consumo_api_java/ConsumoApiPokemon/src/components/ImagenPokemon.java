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
    public ImagenPokemon(JsonObject pokemon,ConsumoAPI consumo) {
        this.pokemon = pokemon;
        this.nombre_pokemon = pokemon.get("name").getAsString();
        this.consumo = consumo;
        this.urlPokemon = pokemon.get("url").getAsString();
        initComponents();
        initAlterntComponents();
        // System.out.println("Este es el panel de la imagen");
        obtenerImagen();
    }
    
    public void initAlterntComponents(){
        nombrePokemon.setText(nombre_pokemon);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombrePokemon = new javax.swing.JLabel();
        etqImagenPokemon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(460, 360));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        nombrePokemon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombrePokemon.setForeground(new java.awt.Color(255, 255, 255));
        nombrePokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePokemon.setText("HOLAAAAA");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqImagenPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqImagenPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void obtenerImagen(){
        Gson gson = new Gson();
        String respuestaPokeApi = consumo.consumoGET(urlPokemon);
        JsonObject pokemones = gson.fromJson(respuestaPokeApi, JsonObject.class);
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
            Image imagenEscalada = imagen.getScaledInstance(400, 400, Image.SCALE_SMOOTH);

            // Crear un ImageIcon con la imagen escalada
            ImageIcon fotoPokemon = new ImageIcon(imagenEscalada);

            // Establecer el ImageIcon en el JLabel
            etqImagenPokemon.setIcon(fotoPokemon);
        } catch (IOException e) {
            e.printStackTrace();
        }
                
        //listaPokemones = pokemones.getAsJsonArray("results");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqImagenPokemon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombrePokemon;
    // End of variables declaration//GEN-END:variables
}
