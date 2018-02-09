package bo.edu.umss.cs.ceis;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;

    public Ventana() {
        super("Ejemplo de BorderLayoud");
        boton1 = new JButton("Norte");
        boton2 = new JButton("Centro");
        boton3 = new JButton("Sur");
        boton4 = new JButton("Oeste");
        boton5 = new JButton("Este");
        setLayout(new BorderLayout());
        add(boton1, BorderLayout.NORTH);
        add(boton2, BorderLayout.CENTER);
        add(boton3, BorderLayout.SOUTH);
        add(boton4, BorderLayout.WEST);
        add(boton5, BorderLayout.EAST);


    }
}
