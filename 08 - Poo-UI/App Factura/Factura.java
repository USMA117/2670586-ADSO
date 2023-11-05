import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Factura extends JFrame {
    public Factura(){
        initComponents();
    }

    public void initComponents(){

        setTitle("Factura");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBorder(new EmptyBorder(10, 20, 10, 20));
        contenedor.setLayout(new GridBagLayout());
        // contenedor.insets = new insets(10,10,10,10);


        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy =0;
        restricciones.gridwidth =4;
        restricciones.gridheight =1;
        restricciones.weightx  = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;

        JLabel etq_datos_cliente = new JLabel();
        etq_datos_cliente.setText("DATOS CLIENTE:");
        etq_datos_cliente.setFont(new Font("Arial",Font.BOLD,18));
        etq_datos_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy =0;
        restricciones.gridwidth =4;
        restricciones.gridheight =1;
        restricciones.weightx  = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,0,20,0);
        contenedor.add(etq_datos_cliente,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        // Dato Cedula cliente
        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA:");
        etq_cedula.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 0;
        restricciones.gridy =1;
        restricciones.gridwidth =1;
        restricciones.gridheight =1;
        restricciones.weightx  = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula,restricciones);

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(15);
        restricciones.gridx = 1;
        restricciones.gridy =1;
        restricciones.gridwidth =1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,0,0,10);
        contenedor.add(campo_cedula,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_cedula = new JButton();
        btn_buscar_cedula.setText("BUSCAR");
        restricciones.gridx = 2;
        restricciones.gridy =1;
        restricciones.gridwidth =2;
        restricciones.gridheight = 1;
        restricciones.weightx  = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_buscar_cedula,restricciones);

        // Nombres del cliente
        JLabel etq_nombre_cliente= new JLabel();
        etq_nombre_cliente.setText("NOMBRES:");
        etq_nombre_cliente.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 0;
        restricciones.gridy =3;
        restricciones.gridwidth =2;
        restricciones.gridheight =1;
        restricciones.weightx  = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10,0,10,0);
        contenedor.add(etq_nombre_cliente,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel espacio_nombre_cliente= new JLabel();
        espacio_nombre_cliente.setText("--------");
        espacio_nombre_cliente.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 1;
        restricciones.gridy =3;
        restricciones.gridwidth =2;
        restricciones.gridheight =1;
        restricciones.weightx  = 80;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(espacio_nombre_cliente,restricciones);

        // Direccion del cliente 
        JLabel etq_direccion_cliente= new JLabel();
        etq_direccion_cliente.setText("DIRECCION:");
        etq_direccion_cliente.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 0;
        restricciones.gridy =4;
        restricciones.gridwidth =2;
        restricciones.gridheight =1;
        restricciones.weightx  = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_direccion_cliente,restricciones);

        JLabel espacio_direccion_cliente= new JLabel();
        espacio_direccion_cliente.setText("--------");
        espacio_direccion_cliente.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 1;
        restricciones.gridy =4;
        restricciones.gridwidth =2;
        restricciones.gridheight =1;
        restricciones.weightx  = 80;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(espacio_direccion_cliente,restricciones);

        // DATOS DEL VENDEDOR
        JLabel etq_datos_vendedor = new JLabel();
        etq_datos_vendedor.setText("DATOS VENDEDOR:");
        etq_datos_vendedor.setFont(new Font("Arial",Font.BOLD,18));
        etq_datos_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20,0,20,0);
        contenedor.add(etq_datos_vendedor,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        //  CEDULA VENDEDOR
        JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("CEDULA:");
        etq_cedula_vendedor.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_vendedor,restricciones);

        JTextField campo_cedula_vendedor = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,0,0,10);
        contenedor.add(campo_cedula_vendedor,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_cedula_vendedor = new JButton();
        btn_cedula_vendedor.setText("BUSCAR");
        restricciones.gridx = 2;
        restricciones.gridy = 6;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_cedula_vendedor,restricciones);

        // NOMBRES DEL VENDEDOR
        JLabel etq_nombre_vendedor= new JLabel();
        etq_nombre_vendedor.setText("NOMBRES:");
        etq_nombre_vendedor.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 0;
        restricciones.gridy =7;
        restricciones.gridwidth =2;
        restricciones.gridheight =1;
        restricciones.weightx  = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10,0,0,0);
        contenedor.add(etq_nombre_vendedor,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel espacio_nombre_vendedor= new JLabel();
        espacio_nombre_vendedor.setText("--------");
        espacio_nombre_vendedor.setFont(new Font("Arial",Font.PLAIN,14));
        restricciones.gridx = 1;
        restricciones.gridy =7;
        restricciones.gridwidth =2;
        restricciones.gridheight =1;
        restricciones.weightx  = 80;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(espacio_nombre_vendedor,restricciones);

        // PRODUCTOS
        JLabel etq_titulo_productos = new JLabel();
        etq_titulo_productos.setText("LISTA DE PRODUCTOS FACTURADOS:");
        etq_titulo_productos.setFont(new Font("Arial",Font.BOLD,18));
        etq_titulo_productos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx  = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20,0,20,0);
        contenedor.add(etq_titulo_productos,restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_id_productos = new JLabel();
        etq_id_productos.setText("ID");
        etq_id_productos.setFont(new Font("Arial",Font.PLAIN,14));
        etq_id_productos.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_id_productos,restricciones);

        JLabel etq_nombre_productos = new JLabel();
        etq_nombre_productos.setText("NOMBRE");
        etq_nombre_productos.setFont(new Font("Arial",Font.PLAIN,14));
        etq_nombre_productos.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 50;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombre_productos,restricciones);

        JLabel etq_cant_productos = new JLabel();
        etq_cant_productos.setText("CANT.");
        etq_cant_productos.setFont(new Font("Arial",Font.PLAIN,14));
        etq_cant_productos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 2;
        restricciones.gridy = 9;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx  = 30;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cant_productos,restricciones);

        JTextField campo_id_productos = new JTextField();
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_id_productos,restricciones);

        JTextField campo_nombre_productos = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 10;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_nombre_productos,restricciones);

        JTextField campo_cant_productos = new JTextField();
        campo_cant_productos.setColumns(3);
        restricciones.gridx = 2;
        restricciones.gridy = 10;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 0, 10);
        contenedor.add(campo_cant_productos,restricciones);

        JButton btn_add_productos = new JButton();
        btn_add_productos.setText("ADD");
        restricciones.gridx = 3;
        restricciones.gridy = 10;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx  = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_add_productos,restricciones);

        JLabel consulta = new JLabel();
        consulta.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll_facturas = new JScrollPane(consulta);
        // JScrollBar scroll_bar = new JScrollBar(JScrollBar.VERTICAL);
        scroll_facturas.setBackground(Color.WHITE);
        // scroll_facturas.setViewportView(consulta);
        // scroll_facturas.setRowHeaderView(scroll_bar);
        restricciones.gridx = 0;
        restricciones.gridy =11;
        restricciones.gridwidth =4;
        restricciones.gridheight =1;
        restricciones.weightx  = 100;
        restricciones.weighty = 90;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20, 0, 0, 0);
        contenedor.add(scroll_facturas,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        String texto="<html> <table><tr><td>";

        for(int i =1; i<=15;i++){
            texto += "hola<br>";
            consulta.setText(texto);
        }

        texto="</html></table></td></tr>";





        add(contenedor);
        revalidate();


    }









}
