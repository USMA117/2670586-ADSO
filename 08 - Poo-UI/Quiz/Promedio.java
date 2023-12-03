import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Promedio extends JFrame {
    private JPanel contenedorItems;
    private Materia listaJLabels[];
    private JTextField input_nota;
    private JTextField input_materia;
    private JTextField input_creditos;
    
    //Constructor
    public Promedio() {
        listaJLabels = new Materia[50];
        initComponents();
    }

    public void initComponents(){
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ) );
        setTitle("Promedio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);


        JPanel contenedor1 = new JPanel();
        contenedor1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        contenedor1.setBackground(Color.WHITE);
        contenedor1.setLayout(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel titulo = new JLabel();
        titulo.setText("CALCULAR PROMEDIO");
        titulo.setFont(new Font("ARIAL", Font.BOLD,30));
        titulo.setHorizontalAlignment( JLabel.CENTER );
        restricciones.gridy = 0;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 4;
        restricciones.weighty = 1;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 10, 0);
        contenedor1.add( titulo, restricciones );

        // JPanel contenedorInputs = new JPanel();
        // contenedorInputs.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        // contenedorInputs.setBackground(Color.GRAY);
        // contenedorInputs.setLayout(new GridBagLayout());
        // GridBagConstraints restricciones2 = new GridBagConstraints();
        // contenedor1.add(contenedorInputs);

        JLabel materia = new JLabel("Materia:");
		restricciones.gridy = 1;
		restricciones.gridx = 0;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.weighty = 1;
		restricciones.weightx = 25;
		restricciones.insets = new Insets(0, 0, 5, 0);
		restricciones.fill = GridBagConstraints.BOTH;
		contenedor1.add( materia, restricciones );
        restricciones.insets = new Insets(0, 0, 0, 0);

		input_materia = new JTextField();
		restricciones.gridy = 1;
		restricciones.gridx = 1;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.weighty = 1;
		restricciones.weightx = 25;
		restricciones.insets = new Insets(0, 10, 10, 10);
		restricciones.fill = GridBagConstraints.BOTH;
		contenedor1.add( input_materia, restricciones );

        JLabel creditos = new JLabel("Creditos:");
		restricciones.gridy = 1;
		restricciones.gridx = 2;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.weighty = 1;
		restricciones.weightx = 25;
		restricciones.insets = new Insets(0, 0, 10, 0);
		restricciones.fill = GridBagConstraints.NONE;
		contenedor1.add( creditos, restricciones );
        restricciones.insets = new Insets(0, 0, 0, 0);

		input_creditos = new JTextField();
		restricciones.gridy = 1;
		restricciones.gridx = 3;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.weighty = 1;
		restricciones.weightx = 25;
		restricciones.insets = new Insets(0, 10, 0, 30);
		restricciones.fill = GridBagConstraints.BOTH;
		contenedor1.add( input_creditos, restricciones );
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel nota = new JLabel("Nota:");
		restricciones.gridy = 2;
		restricciones.gridx = 0;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.weighty = 1;
		restricciones.weightx = 25;
		restricciones.insets = new Insets(0, 0, 0, 0);
		restricciones.fill = GridBagConstraints.BOTH;
		contenedor1.add( nota, restricciones );

		input_nota = new JTextField();
		restricciones.gridy = 2;
		restricciones.gridx = 1;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.weighty = 1;
		restricciones.weightx = 25;
		restricciones.insets = new Insets(0, 10, 0, 10);
		restricciones.fill = GridBagConstraints.BOTH;
		contenedor1.add( input_nota, restricciones );

        JButton btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setFont(new Font("ARIAL", Font.BOLD,20));
        btn_registrar.setForeground(Color.WHITE);
        btn_registrar.setOpaque(true);
        btn_registrar.setBackground( Color.BLUE );
		restricciones.gridy = 2;
		restricciones.gridx = 2;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 2;
		restricciones.weighty = 1;
		restricciones.weightx = 50;
		restricciones.insets = new Insets(0, 10, 0, 10);
		restricciones.fill = GridBagConstraints.NONE;
		contenedor1.add( btn_registrar, restricciones );

        JLabel etq_resumen = new JLabel();
        etq_resumen.setText("RESUMEN");
        etq_resumen.setFont(new Font("ARIAL", Font.BOLD,25));
        etq_resumen.setHorizontalAlignment( JLabel.CENTER );
        restricciones.gridy = 4;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 4;
        restricciones.weighty = 1;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20, 0, 10, 0);
        contenedor1.add( etq_resumen, restricciones );

        contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restricciones.gridy = 5;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 4;
        restricciones.weighty = 89;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 0, 10);
        contenedor1.add( scrollPane, restricciones );
        
        GridBagConstraints constItems = new GridBagConstraints();
        
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

        // Borde del contenedor 
        int tam_borde = 1;
        Color colorBorde = Color.GRAY;
        Border btn_color_borde = BorderFactory.createLineBorder(colorBorde,tam_borde);
        Border btn_espacio_interno = BorderFactory.createEmptyBorder(10,10,10,10);
        Border borde_completo = BorderFactory.createCompoundBorder(btn_color_borde,btn_espacio_interno);

        contenedorItems.setBorder(borde_completo);
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.RIGHT );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(etq_temporal, constItems);
        }

        JLabel etq_total = new JLabel();
        etq_total.setText("Total");
        etq_total.setFont(new Font("ARIAL", Font.BOLD,25));
        etq_total.setHorizontalAlignment( JLabel.RIGHT );
        restricciones.gridy = 6;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 2;
        restricciones.weighty = 1;
        restricciones.weightx = 50;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20, 0, 10, 5);
        contenedor1.add( etq_total, restricciones );
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel campo_total = new JLabel();
        campo_total.setText("----");
        campo_total.setFont(new Font("ARIAL", Font.BOLD,25));
        campo_total.setHorizontalAlignment( JLabel.LEFT );
        restricciones.gridy = 6;
        restricciones.gridx = 2;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 2;
        restricciones.weighty = 1;
        restricciones.weightx = 50;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20, 0, 10, 0);
        contenedor1.add( campo_total, restricciones );
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setFont(new Font("ARIAL", Font.BOLD,18));
        btn_limpiar.setForeground(Color.WHITE);
        btn_limpiar.setOpaque(true);
        btn_limpiar.setBackground( Color.RED );
		restricciones.gridy = 7;
		restricciones.gridx = 0;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 4;
		restricciones.weighty = 1;
		restricciones.weightx = 100;
		restricciones.insets = new Insets(0, 10, 10, 10);
		restricciones.fill = GridBagConstraints.NONE;
		contenedor1.add( btn_limpiar, restricciones );


        add(contenedor1);
        setVisible(true);
        revalidate();

        

        ActionListener evento_click_registrar = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            registrarMateria();
            }
        };
        
		btn_registrar.addActionListener(evento_click_registrar);
        

        // crear objeto materia
        // recorrer el arreglo de materia y actualizar los jlabels
        // calcular el promedio

		// public  registrarMateria() {
        //     for (int i = 0; i < listaJLabels.length; i++) {
        //         if (listaJLabels[i] == null) {
        //             listaJLabels[i] = new JLabel(); 
        //         }
        //         listaJLabels[i].setText(nombre);
        //     }
        // }
        
        
    }
    public void registrarMateria(){
            // Extraer el dato del input
            String materia = input_materia.getText();
            int creditos = Integer.parseInt(input_creditos.getText().trim());
            double nota = Double.parseDouble(input_nota.getText().trim());

            // System.out.println("Materia-> "+materia+" Creditos-> "+creditos+" Nota-> "+nota);


            for(int i=0; i<listaJLabels.length; i++){
                if(listaJLabels[i] == null){
                    listaJLabels[i] = new Materia(materia, creditos, nota);
                    
                    
                }else if(listaJLabels[i] != null){
                    System.out.print(listaJLabels[i]);
                }
                    
                    // listaJLabels[i].imprimirMateria();
            }
        }
}
    

