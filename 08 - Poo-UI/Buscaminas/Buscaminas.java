import javax.swing.*;
import java.awt.*;
public class Buscaminas extends JFrame {
    private JButton botones;
    private JButton [][] lista_botones;

    // CONSTRUCTOR
    public Buscaminas(){
        lista_botones = new JButton[9][9];
        initComponents();
    }

    public void initComponents(){

        setTitle("Buscaminas");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") ) );

        JPanel contenedor = new JPanel();
        contenedor.setBounds(20, 20, 20, 20);
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(1, 1, 1, 1);
        restricciones.fill = GridBagConstraints.BOTH;

        

        // JLabel limites = new JLabel("DATOS CLIENTE:");
		// limites.setFont( new Font("Arial", Font.BOLD, 20) );
		// limites.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		// restricciones.gridy = 0;
		// restricciones.gridx = 0;
		// restricciones.gridheight = 1;
		// restricciones.gridwidth = 9;
		// restricciones.weighty = 1;
		// restricciones.weightx = 100;
		// restricciones.fill = GridBagConstraints.BOTH;
		// contenedor.add( limites, restricciones );

        // JButton boton = new JButton();
        // boton.setBackground(Color.WHITE);
        // restricciones.gridy = 1;
        // restricciones.gridx = 0;
        // restricciones.gridheight =1;
        // restricciones.gridwidth =1;
        // restricciones.weightx =11;
        // restricciones.weighty =1;
        // restricciones.fill = GridBagConstraints.BOTH;
        // contenedor.add(boton,restricciones);

        // JButton boton2 = new JButton();
        // boton2.setBackground(Color.WHITE);
        // restricciones.gridy = 1;
        // restricciones.gridx = 1;
        // restricciones.gridheight =1;
        // restricciones.gridwidth =1;
        // restricciones.weightx =11;
        // restricciones.weighty =1;
        // restricciones.fill = GridBagConstraints.BOTH;
        // contenedor.add(boton2,restricciones);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                lista_botones[i][j] = new JButton();
                restricciones.gridy = i;
                restricciones.gridx = j;
                restricciones.weightx = 1;
                restricciones.weighty = 1;
                lista_botones[i][j].setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
                contenedor.add(lista_botones[i][j],restricciones);

            }
        }

        JLabel texto1 = new JLabel();
        texto1.setText("020");
        texto1.setFont(new Font("ARIAL",Font.BOLD,20));
        texto1.setForeground(Color.RED);
        texto1.setHorizontalAlignment(JLabel.CENTER);
        texto1.setOpaque(true);
        texto1.setBackground(Color.BLACK);
        restricciones.gridx=0;
        restricciones.gridy=9;
        restricciones.gridheight=1;
        restricciones.gridwidth=3;
        restricciones.weightx =33;
        restricciones.weighty =1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(texto1, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btn_texto = new JButton();
        btn_texto.setForeground(Color.RED);
        btn_texto.setHorizontalAlignment(JButton.CENTER);
        // ImageIcon icono = new ImageIcon("imagenes/icono_happy.png");
        // btn_texto.setIcon(icono);
        restricciones.gridx=3;
        restricciones.gridy=9;
        restricciones.gridheight=1;
        restricciones.gridwidth=3;
        restricciones.weightx =33;
        restricciones.weighty =1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(btn_texto, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel texto3 = new JLabel();
        texto3.setText("000");
        texto3.setFont(new Font("ARIAL",Font.BOLD,20));
        texto3.setForeground(Color.RED);
        texto3.setHorizontalAlignment(JLabel.CENTER);
        texto3.setOpaque(true);
        texto3.setBackground(Color.BLACK);
        restricciones.gridx=6;
        restricciones.gridy=9;
        restricciones.gridheight=1;
        restricciones.gridwidth=3;
        restricciones.weightx =33;
        restricciones.weighty =1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(texto3, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel texto = new JLabel();
        texto.setBackground(Color.WHITE);
        restricciones.gridy = 10;
        restricciones.gridx = 0;
        restricciones.gridheight =1;
        restricciones.gridwidth =9;
        restricciones.weightx =11;
        restricciones.weighty =90;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(texto,restricciones);



        add(contenedor);
        setVisible(true);
        setResizable(false);
        revalidate();
    }

}
