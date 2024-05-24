
package principal;

import Clases.ButtonRenderer;
import utils.Persona;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;

public class TablaBotones extends javax.swing.JFrame {
     Persona listaPersonas[];
    DefaultTableModel  modelo;
    
    public TablaBotones() {
        listaPersonas = new Persona [100];
        listaPersonas[0] = new Persona("12341156","Sebastian","Usma","3145463254", "usma@gmail.com");
        listaPersonas[1] = new Persona("65432111","Luisa","Londoño","3145625412", "luisa@gmail.com");
        listaPersonas[2] = new Persona("3121654","Juan","Perez Gomez","3215469854", "juan@gmail.com");
        listaPersonas[3] = new Persona("9854633","Maria","Santa","3114536521", "maria@gmail.com");
        listaPersonas[4] = new Persona("2132121","pepe","Sanchez Sanchez","3126545987", "pepe@gmail.com");
        initComponents();
        initAltertComponents();
        imprimirPersonas();
    }
    
    
    public void initAltertComponents(){
        setVisible(true);
        setTitle("Tabla Basica");
        setLocationRelativeTo(null);
        tablaDatos.getTableHeader().setFont(new Font("Arial",Font.BOLD,15));
        tablaDatos.getTableHeader().setForeground(Color.WHITE);
        tablaDatos.getTableHeader().setOpaque(false);
        tablaDatos.getTableHeader().setBackground(Color.BLUE);
        tablaDatos.setRowHeight(20);
        
        
        modelo = (DefaultTableModel) tablaDatos.getModel();
        
        tablaDatos.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        
        tablaDatos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(30);
        tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(30);
        
        tablaDatos.getTableHeader().setResizingAllowed(false);
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();    
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        tablaDatos.setRowHeight(25);
    }
    
    public void imprimirPersonas(){
        modelo.setRowCount(0);
        for(int i = 0;listaPersonas[i] != null;i++){
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            JButton btnEditar = new JButton();
            btnEditar.setBackground(Color.white);
            
            Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_editar.png"));
            icono_editar = icono_editar.getScaledInstance(20,20,Image.SCALE_SMOOTH);
            btnEditar.setIcon(new ImageIcon(icono_editar));
            
            JButton btnEliminar = new JButton();
            btnEditar.setBackground(Color.white);
            
            Image icono_eliminar= getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
            icono_eliminar = icono_eliminar.getScaledInstance(20,20,Image.SCALE_SMOOTH);
            btnEliminar.setIcon(new ImageIcon(icono_eliminar));
            
            
            Object dato = new Object[]{documento,nombres,apellidos,telefono,correo,btnEditar,btnEliminar};
            modelo.addRow((Object[]) dato);
            
            Persona temporal = listaPersonas[i];
            TablaBotones ventanaActual = this;
            btnEditar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaActual.setVisible(false);
                    FormularioEdicion ventana = new FormularioEdicion(temporal,ventanaActual);
                }
            });
            
            final int posicion = i;
            btnEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    EliminarPersona eliminar = new EliminarPersona(ventanaActual,listaPersonas,posicion);
                }
            });
            
        }
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        contenedorTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new java.awt.TextField();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new java.awt.TextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new java.awt.TextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new java.awt.TextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new java.awt.TextField();
        btnAgregar = new javax.swing.JButton();
        contenedorDatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenedorTitulo.setBackground(new java.awt.Color(0, 0, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Tabla Basica");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etqTitulo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        contenedorFormulario.setBackground(new java.awt.Color(0, 204, 255));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqDocumento.setText("Documento:");

        etqNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqNombres.setText("Nombres:");

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqApellidos.setText("Apellidos:");

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqTelefono.setText("Telefono:");

        etqCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqCorreo.setText("Correo Elec...");

        btnAgregar.setBackground(new java.awt.Color(0, 255, 51));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(etqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etqApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqDocumento)
                            .addComponent(etqNombres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(campoNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqTelefono)
                            .addComponent(etqCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        contenedorDatos.setBackground(new java.awt.Color(102, 255, 255));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Elec", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setFocusable(false);
        tablaDatos.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tablaDatos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setResizable(false);
            tablaDatos.getColumnModel().getColumn(1).setResizable(false);
            tablaDatos.getColumnModel().getColumn(2).setResizable(false);
            tablaDatos.getColumnModel().getColumn(3).setResizable(false);
            tablaDatos.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        
        
            if(documento.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("")){    
                Alerta alerta1 = new Alerta("Los campos requeridos estan vacios.");
            }else{
                
                boolean datoExiste = false;
                int posicion = -1;
                for (int i=0;i<listaPersonas.length;i++) {
                    if(documento.equals(listaPersonas[i].getDocumento()) || correo.equals(listaPersonas[i].getCorreo())){
                        Alerta alertaDatosRepetidos = new Alerta("<html><p>Ya existe un registro con este mismo documento o correo.</html></p>");
                        datoExiste = true;
                        break;
                    }
                    
                }
                
            if (!datoExiste) {
                
                for(int i = 0;i < listaPersonas.length; i++){
                    
                    if(listaPersonas[i] == null){
                        posicion = -1;
                        break;
                    }
                }

                if(posicion != -1){
                    listaPersonas[posicion] = new Persona(documento, nombres, apellidos, telefono, correo);

                    Object data[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
                    modelo.addRow(data);

                }
                    
                    

                campoDocumento.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoCorreo.setText("");
                campoDocumento.requestFocus();
            }
            for(int i = 0;listaPersonas[i] != null;i++){
     
                System.out.println(listaPersonas[i].getDocumento());

            }
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private java.awt.TextField campoApellidos;
    private java.awt.TextField campoCorreo;
    private java.awt.TextField campoDocumento;
    private java.awt.TextField campoNombres;
    private java.awt.TextField campoTelefono;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
