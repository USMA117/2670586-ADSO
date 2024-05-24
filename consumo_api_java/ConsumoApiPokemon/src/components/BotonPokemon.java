
package components;

import com.google.gson.JsonObject;
import java.awt.Color;
import javax.swing.JPanel;
import util.ConsumoAPI;

/**
 *
 * @author johan
 */
public class BotonPokemon extends javax.swing.JPanel {

    JsonObject pokemon;
    String nombrePokemon;
    JPanel panel_imagen_pokemon;
    ConsumoAPI consumo;
    int pokemonActual;
    public BotonPokemon(JsonObject pokemon,JPanel panel_imagen_pokemon,ConsumoAPI consumo,int pokemonActual) {
        this.nombrePokemon = pokemon.get("name").getAsString();
        this.panel_imagen_pokemon = panel_imagen_pokemon;
        this.pokemon = pokemon;
        this.consumo = consumo;
        this.pokemonActual = pokemonActual;
        initComponents();
        initAltertComponents();
    }

    public void initAltertComponents(){
        btnPokemon.setText(nombrePokemon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPokemon = new javax.swing.JButton();

        btnPokemon.setBackground(new java.awt.Color(0, 0, 0));
        btnPokemon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPokemon.setForeground(new java.awt.Color(255, 255, 255));
        btnPokemon.setText("btn");
        btnPokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPokemon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPokemon.setFocusable(false);
        btnPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokemonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokemonActionPerformed
        btnPokemon.setOpaque(true);
        btnPokemon.setBackground(Color.WHITE);
        btnPokemon.setForeground(Color.BLACK);

        ImagenPokemon nuevo = new ImagenPokemon(pokemon,consumo,pokemonActual);
        System.out.println("----++++"+nombrePokemon);
        nuevo.setPreferredSize( panel_imagen_pokemon.getPreferredSize() );
        nuevo.setSize( panel_imagen_pokemon.getSize() );
        
        panel_imagen_pokemon.removeAll();
        panel_imagen_pokemon.add(nuevo);

        panel_imagen_pokemon.repaint();
        panel_imagen_pokemon.revalidate();
    }//GEN-LAST:event_btnPokemonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPokemon;
    // End of variables declaration//GEN-END:variables
}
