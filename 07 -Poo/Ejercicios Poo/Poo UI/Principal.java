import javax.swing.*;
import java.awt.*;

public class Principal{
    public static void main(String[] args){

        JFrame ventana_01 = new JFrame();
        ventana_01.setTitle("Ventana 1");
        ventana_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana_01.setSize(300,600);
        ventana_01.setResizable(false);
        ventana_01.setLocation(500,100);
        ventana_01.setLocationRelativeTo(null);
        ventana_01.setVisible(true);
        

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.ORANGE);


        JLabel titulo = new JLabel();
        titulo.setText("TITULO");
        titulo.setForeground(Color.RED);
        titulo.setBackground(Color.BLUE);
        titulo.setOpaque(true);
        titulo.setFont(new Font("Snap ITC",Font.BOLD, 45));

        JLabel cedula = new JLabel();
        cedula.setText("Cedula: ");
        cedula.setFont(new Font("Arial",Font.PLAIN, 22));

        JLabel nombre = new JLabel();
        nombre.setText("Nombre: ");
        nombre.setFont(new Font("Arial",Font.PLAIN, 22));

        JLabel apellido = new JLabel();
        apellido.setText("Apellido: ");
        apellido.setFont(new Font("Arial",Font.PLAIN, 22));

        JTextField campo_cedula =new JTextField();
        campo_cedula.setColumns(11);

        JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(11);

        JTextField campo_apellido = new JTextField();
        campo_apellido.setColumns(11);

        JButton boton = new JButton();
        boton.setText("enviar");

        
        contenedor.add(titulo);
        contenedor.add(nombre);
        contenedor.add(campo_nombre);
        contenedor.add(apellido);
        contenedor.add(campo_apellido);
        contenedor.add(cedula);
        contenedor.add(campo_cedula);
        contenedor.add(boton);
        ventana_01.add(contenedor);

        // ventana_01.repaint();
        ventana_01.revalidate();
        // ventana_01.pack();
    }
}