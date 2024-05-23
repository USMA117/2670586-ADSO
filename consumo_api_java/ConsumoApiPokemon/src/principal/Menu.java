
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import components.BotonPokemon;
import components.ImagenPokemon;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import util.ConsumoAPI;

/**
 *
 * @author johan
 */
public class Menu extends javax.swing.JFrame {
    ConsumoAPI consumo = new ConsumoAPI();
    Gson gson = new Gson();
    JsonArray listaPokemones;
    JsonObject pokemones;
    String respuestaPokeApi;
    String endpoint;
    int paginaActual;
    int pokemonActual;
    public Menu() {
        this.paginaActual = 1;
        this.endpoint = "https://pokeapi.co/api/v2/pokemon";
        initComponents();
        initAlterntComponents();
        
    }
    
    public void initAlterntComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        imprimirListaBotones(endpoint);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_imagen_pokemon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scroll_contenedor_botones = new javax.swing.JScrollPane();
        panelBotonesPokemon = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        etqPaginaActual = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnUltimaPagina = new javax.swing.JButton();
        btnPrimeraPagina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_imagen_pokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido, Selecciona un pokemon");

        javax.swing.GroupLayout panel_imagen_pokemonLayout = new javax.swing.GroupLayout(panel_imagen_pokemon);
        panel_imagen_pokemon.setLayout(panel_imagen_pokemonLayout);
        panel_imagen_pokemonLayout.setHorizontalGroup(
            panel_imagen_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_imagen_pokemonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_imagen_pokemonLayout.setVerticalGroup(
            panel_imagen_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_imagen_pokemonLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        scroll_contenedor_botones.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout panelBotonesPokemonLayout = new javax.swing.GroupLayout(panelBotonesPokemon);
        panelBotonesPokemon.setLayout(panelBotonesPokemonLayout);
        panelBotonesPokemonLayout.setHorizontalGroup(
            panelBotonesPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        panelBotonesPokemonLayout.setVerticalGroup(
            panelBotonesPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        scroll_contenedor_botones.setViewportView(panelBotonesPokemon);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        etqPaginaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSiguiente.setBackground(new java.awt.Color(51, 51, 51));
        btnSiguiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.setFocusable(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(51, 51, 51));
        btnAtras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Regresar");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setFocusable(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnUltimaPagina.setBackground(new java.awt.Color(153, 153, 153));
        btnUltimaPagina.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimaPagina.setText(">>");
        btnUltimaPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUltimaPagina.setFocusable(false);
        btnUltimaPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimaPaginaActionPerformed(evt);
            }
        });

        btnPrimeraPagina.setBackground(new java.awt.Color(153, 153, 153));
        btnPrimeraPagina.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeraPagina.setText("<<");
        btnPrimeraPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrimeraPagina.setFocusable(false);
        btnPrimeraPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeraPaginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnPrimeraPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras)
                .addGap(52, 52, 52)
                .addComponent(etqPaginaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqPaginaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAtras)
                                .addComponent(btnPrimeraPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSiguiente)
                                .addComponent(btnUltimaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_contenedor_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_imagen_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_contenedor_botones)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_imagen_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        pokemones = gson.fromJson(respuestaPokeApi, JsonObject.class);
        String next = pokemones.get("next").getAsString();
        
        System.out.println("prueba next - "+next);
        paginaActual++;
        imprimirListaBotones(next);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        String Previous = pokemones.get("previous").getAsString();
        
        if(Previous == null){
            System.out.println("No puedes volver mas atras :(");
        }else{
            System.out.println("prueba Previous - "+Previous);
            paginaActual--;
            imprimirListaBotones(Previous);
        }
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnPrimeraPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeraPaginaActionPerformed
        paginaActual = 1;
        imprimirListaBotones("https://pokeapi.co/api/v2/pokemon?offset=0&limit=20");
    }//GEN-LAST:event_btnPrimeraPaginaActionPerformed

    private void btnUltimaPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimaPaginaActionPerformed
        paginaActual = 65;
        imprimirListaBotones("https://pokeapi.co/api/v2/pokemon?offset=1298&limit=2");
    }//GEN-LAST:event_btnUltimaPaginaActionPerformed

    
    public void imprimirListaBotones(String endpoint){
        etqPaginaActual.setText(String.valueOf(paginaActual));
        respuestaPokeApi = consumo.consumoGET(endpoint);
        
        Gson gson = new Gson();
        pokemones = gson.fromJson(respuestaPokeApi, JsonObject.class);
        listaPokemones = pokemones.getAsJsonArray("results");
        
        panelBotonesPokemon.removeAll();
        panelBotonesPokemon.setLayout(new BoxLayout(panelBotonesPokemon, BoxLayout.Y_AXIS));
        
        for(int i =0; i<listaPokemones.size();i++){
            JsonObject temp = listaPokemones.get(i).getAsJsonObject();
            String nombre = temp.get("name").getAsString();
            System.out.println("Pokemon "+(i+1)+": "+nombre);
            pokemonActual ++;
            BotonPokemon boton = new BotonPokemon(temp,panel_imagen_pokemon,consumo,pokemonActual);
            
            panelBotonesPokemon.add(boton);
            
        }
        repaint();
        revalidate();
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnPrimeraPagina;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimaPagina;
    private javax.swing.JLabel etqPaginaActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBotonesPokemon;
    private javax.swing.JPanel panel_imagen_pokemon;
    private javax.swing.JScrollPane scroll_contenedor_botones;
    // End of variables declaration//GEN-END:variables
}
