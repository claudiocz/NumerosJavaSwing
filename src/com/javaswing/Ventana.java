package com.javaswing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame{
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;
    private JDialog ventanita;
    private JLabel mensaje;

    public Ventana(){
        super("Juego de números");
        etiqueta = new JLabel("Dime un numero: ");
        campo = new JTextField(3);
        jugar = new JButton("Jugar");
        ventanita = new JDialog();
        mensaje = new JLabel(" ");

        FlowLayout f = new FlowLayout();
        setLayout(f);

        add(etiqueta);
        add(campo);
        add(jugar);


        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });

    }

    private void jugar(){

        String var = campo.getText();
        int number = Integer.parseInt(var);
        number++;

        ventanita.setSize(300, 300);
        mensaje.setText("Mi numero es: "+ number + "gané.");
        FlowLayout f = new FlowLayout();
        setLayout(f);
        add(mensaje);

        ventanita.setVisible(true);






    }
}
