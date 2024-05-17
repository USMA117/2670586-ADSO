/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;


public class ListadoPersonas extends javax.swing.JPanel {

    DefaultTableModel modelo; 
    ConsumoAPI consumo;
    public ListadoPersonas(ConsumoAPI consumo) {
        this.consumo = consumo;
        initComponents();
        initAternComponents();
         imprimirPersonas();
    }
    
    public void initAternComponents(){
        
        
        modelo = (DefaultTableModel) tablaDatos.getModel();
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaDatos.setRowHeight(20);
    }
    
    public void imprimirPersonas(){
        modelo.setRowCount(0);
        String respuesta = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        JsonArray registros = JsonParser.parseString(respuesta).getAsJsonArray();
        
        for(int i =0; i<registros.size();i++){
                JsonObject temp = registros.get(i).getAsJsonObject();
                String cedula = temp.get("cedula").getAsString();
                String nombre = temp.get("nombres").getAsString();
                String apellidos = temp.get("apellidos").getAsString();
                String telefono = temp.get("telefono").getAsString();
                String direccion = temp.get("direccion").getAsString();
                String correo = temp.get("email").getAsString();
                
                Object dato[] = new Object[]{ cedula, nombre, apellidos, telefono, direccion, correo };
                modelo.addRow(dato);
            
        }
        /*
        for (int i=0;i<listaPersonas.length && listaPersonas[i]!=null; i++) {
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            Object dato[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
            modelo.addRow(dato);
        }*/
    }

    
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "cedula", "nombres", "apellidos", "direccion", "telefono", "correo"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
