import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.awt.event.ActionEvent;

public class Prestamos extends JFrame {
    public Prestamos(){
        initComponents();
    }

    public void initComponents(){
        setTitle("Simulador de Prestamos");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("PRESTAMOS");
        etq_titulo.setFont(new Font("Arial",Font.BOLD, 30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_titulo, restricciones);

        JLabel etq_capital = new JLabel();
        etq_capital.setText("Capital: ");
        etq_capital.setFont(new Font("Arial",Font.BOLD, 20));
        etq_capital.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_capital, restricciones);

        JTextField campo_capital = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,3,0,0);
        contenedor.add(campo_capital, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_plan_pagos = new JLabel();
        etq_plan_pagos.setText("----");
        JScrollPane scroll = new JScrollPane(etq_plan_pagos);
        etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 90;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones);


        JLabel etq_intereses = new JLabel();
        etq_intereses.setText("Intereses: ");
        etq_intereses.setFont(new Font("Arial",Font.BOLD, 20));
        etq_intereses.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_intereses, restricciones);

        JTextField campo_intereses = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5,3,0,0);
        contenedor.add(campo_intereses, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_cuotas = new JLabel();
        etq_cuotas.setText("Cuotas: ");
        etq_cuotas.setFont(new Font("Arial",Font.BOLD, 20));
        etq_cuotas.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cuotas, restricciones);

        JTextField campo_cuotas = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5,3,0,0);
        contenedor.add(campo_cuotas, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_calcular = new JButton("Calcular");
        btn_calcular.setBackground(Color.BLUE);
        btn_calcular.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(btn_calcular, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_titulo_pagos = new JLabel("Plan de Pagos: ");
        etq_titulo_pagos.setFont(new Font("Arial",Font.BOLD, 18));
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo_pagos, restricciones);

        JButton btn_limpiar = new JButton("Limpiar");
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(btn_limpiar, restricciones);
        restricciones.insets = new Insets(0,0,0,0);


        ActionListener evento_calcular = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                System.out.println("Click en calcular");
                
                double capital = Double.parseDouble(campo_capital.getText());
                double intereses = Double.parseDouble(campo_intereses.getText());
                double cuotas = Double.parseDouble(campo_cuotas.getText());

                double valor_cuota = capital +(capital * intereses/100)/cuotas;
                System.out.println("Capital: "+capital);
                System.out.println("Intereses: "+intereses);
                System.out.println("Cuotas: "+cuotas);

                String texto = "<html>";
                for (int i = 1; i <= cuotas; i++) {
                    texto += "Cuota #"+i+": "+valor_cuota+"<br>";
                }
                texto += "</html>";
                etq_plan_pagos.setText(texto);


            }
            
        };
        btn_calcular.addActionListener(evento_calcular);

        ActionListener evento_limpiar = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                System.out.println("Click en limpiar");
            }
            
        };
        btn_limpiar.addActionListener(evento_limpiar);

        add(contenedor);
        setVisible(true);
        revalidate();



    }
}
