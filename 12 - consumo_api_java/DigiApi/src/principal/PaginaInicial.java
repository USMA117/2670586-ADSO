
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import util.ConsumoAPI;


public class PaginaInicial extends javax.swing.JFrame {

    ConsumoAPI consumo = new ConsumoAPI() ;
    int paginaActual;
    int cant_paginas[];
    public PaginaInicial() {
        this.consumo = consumo;
        this.paginaActual = 0;
        this.cant_paginas = new int[]{1,2,3,4,5,6,7};
        
        initComponents();
        initAlternComponents();
        imprimirDigimones();
        imprimirPaginador();
    }

    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        Image logo = getToolkit().createImage(ClassLoader.getSystemResource("img/logo.png"));
        logo = logo.getScaledInstance(120, 60,Image.SCALE_SMOOTH);
        etqLogo.setIcon(new ImageIcon(logo));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelPaginador = new javax.swing.JPanel();
        scrollDigimones = new javax.swing.JScrollPane();
        panelDigimones = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.LINE_AXIS));

        scrollDigimones.setBorder(null);
        scrollDigimones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollDigimones.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelDigimones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDigimonesLayout = new javax.swing.GroupLayout(panelDigimones);
        panelDigimones.setLayout(panelDigimonesLayout);
        panelDigimonesLayout.setHorizontalGroup(
            panelDigimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        panelDigimonesLayout.setVerticalGroup(
            panelDigimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        scrollDigimones.setViewportView(panelDigimones);

        etqLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(scrollDigimones, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollDigimones, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void imprimirDigimones(){
        String respuesta = consumo.consumoGET("https://digi-api.com/api/v1/digimon?page="+paginaActual);
        JsonObject digimones =JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray listaDigimones = digimones.get("content").getAsJsonArray();
        System.out.println(digimones);
        panelDigimones.setLayout(new GridLayout(2,3));
        
        for (int i = 0; i < listaDigimones.size(); i++) {
            JsonObject digimonActual = listaDigimones.get(i).getAsJsonObject();
            String nombreDigimon = digimonActual.get("name").getAsString();
            VistaDigimon vista = new VistaDigimon(digimonActual);
            
            panelDigimones.add(vista);
            System.out.println("nombre: "+i+" "+nombreDigimon);
        }
        revalidate();
        repaint();
    }
    public void imprimirPaginador(){
        panelPaginador.add(Box.createHorizontalGlue());
        
        JButton btnAtras = new JButton("<<");
        panelPaginador.add(btnAtras);
        btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0;i < cant_paginas.length;i++){
                    cant_paginas[i] = cant_paginas[i]-1;
                }
                panelDigimones.removeAll();
                panelPaginador.removeAll();
                imprimirDigimones();
                imprimirPaginador();
            }
        });
        
        JButton btnPaginaAtras = new JButton("<");
        panelPaginador.add(btnPaginaAtras);
        btnPaginaAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelDigimones.removeAll();
                panelPaginador.removeAll();
                paginaActual--;
                imprimirDigimones();
                imprimirPaginador();
            }
        });
        
        for (int i = 0; i < cant_paginas.length; i++) {
            JButton botonesPagina = new JButton();
            botonesPagina.setBackground(Color.white);
            botonesPagina.setForeground(Color.black);
            botonesPagina.setText(String.valueOf(cant_paginas[i]));
            if (paginaActual == i){
                botonesPagina.setBackground(Color.red);
                botonesPagina.setForeground(Color.white);
            }
            final int indicePagina = i;
            botonesPagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    paginaActual = indicePagina;
                    if (paginaActual == indicePagina){
                        botonesPagina.setBackground(Color.red);
                        botonesPagina.setForeground(Color.white);
                    }
                    panelDigimones.removeAll();
                    panelPaginador.removeAll();
                    imprimirDigimones();
                    imprimirPaginador();
                }
            });
            panelPaginador.add(botonesPagina);
        }
        
        JButton btnPaginaSiguiente = new JButton(">");
        panelPaginador.add(btnPaginaSiguiente);
        btnPaginaSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paginaActual++;
                panelDigimones.removeAll();
                panelPaginador.removeAll();
                imprimirDigimones();
                imprimirPaginador();
                
            }
        });
        
        JButton btnSiguiente = new JButton(">>");
        panelPaginador.add(btnSiguiente);
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pagina actual -- "+paginaActual);
                for(int i = 0;i < cant_paginas.length;i++){
                    cant_paginas[i] = cant_paginas[i]+1;
                }
                
                panelDigimones.removeAll();
                panelPaginador.removeAll();
                imprimirDigimones();
                imprimirPaginador();
            }
        });
        
        panelPaginador.add(Box.createHorizontalGlue());
        panelPaginador.repaint();
        panelPaginador.revalidate();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelDigimones;
    private javax.swing.JPanel panelPaginador;
    private javax.swing.JScrollPane scrollDigimones;
    // End of variables declaration//GEN-END:variables
}
