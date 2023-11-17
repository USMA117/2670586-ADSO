import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
public class Buscaminas extends JFrame {
    private JButton [][] lista_botones;

    // CONSTRUCTOR
    public Buscaminas(){
        lista_botones = new JButton[9][9];
        initComponents();
    }

    public void initComponents(){

        setTitle("Buscaminas");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") ) );

        JPanel contenedor = new JPanel();
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.fill = GridBagConstraints.BOTH;


        int tam_borde = 1;
        Color colorBorde = Color.GRAY;
        Border btn_color_borde = BorderFactory.createLineBorder(colorBorde,tam_borde);
        Border btn_espacio_interno = BorderFactory.createEmptyBorder(10,10,10,10);
        Border borde_completo = BorderFactory.createCompoundBorder(btn_color_borde,btn_espacio_interno);

        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                lista_botones[i][j] = new JButton();
                lista_botones[i][j].setBorder(borde_completo);
                restricciones.gridy = i;
                restricciones.gridx = j;
                restricciones.weightx = 1;
                restricciones.weighty = 1;
                // lista_botones[i][j].setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
                // restricciones.insets = new Insets(1, 1, 1, 1);
                contenedor.add(lista_botones[i][j],restricciones);
                restricciones.insets = new Insets(0, 0, 0, 0);

            }
        }

        JLabel texto1 = new JLabel();
        texto1.setText("020");
        texto1.setFont(new Font("ARIAL",Font.BOLD,30));
        texto1.setForeground(Color.RED);
        texto1.setHorizontalAlignment(JLabel.CENTER);
        texto1.setOpaque(true);
        texto1.setBackground(Color.BLACK);
        restricciones.gridx=0;
        restricciones.gridy=0;
        restricciones.gridheight=1;
        restricciones.gridwidth=3;
        restricciones.weightx =33;
        restricciones.weighty =1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 10, 0);
        contenedor.add(texto1, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btn_texto = new JButton("(+_+)");
        btn_texto.setForeground(Color.BLACK);
        btn_texto.setHorizontalAlignment(JButton.CENTER);
        // ImageIcon icono = new ImageIcon("imagenes/icono_happy.png");
        // btn_texto.setIcon(icono);
        restricciones.gridx=3;
        restricciones.gridy=0;
        restricciones.gridheight=1;
        restricciones.gridwidth=3;
        restricciones.weightx =33;
        restricciones.weighty =1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5, 0, 10, 0);
        contenedor.add(btn_texto, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel texto3 = new JLabel();
        texto3.setText("000");
        texto3.setFont(new Font("ARIAL",Font.BOLD,30));
        texto3.setForeground(Color.RED);
        texto3.setHorizontalAlignment(JLabel.CENTER);
        texto3.setOpaque(true);
        texto3.setBackground(Color.BLACK);
        restricciones.gridx=6;
        restricciones.gridy=0;
        restricciones.gridheight=1;
        restricciones.gridwidth=3;
        restricciones.weightx =33;
        restricciones.weighty =1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 10, 0);
        contenedor.add(texto3, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);
        



        add(contenedor);
        setVisible(true);
        setResizable(false);
        revalidate();
    }

}
