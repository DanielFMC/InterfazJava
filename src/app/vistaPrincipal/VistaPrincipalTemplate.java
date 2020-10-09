/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.vistaPrincipal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DanielFMC
 */
public class VistaPrincipalTemplate extends JFrame {

    private JButton bEntrar;
    private JTextField tombre;
    private JLabel lNombre;

    public VistaPrincipalTemplate() {
        super("Vista Principal");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
//        this.setUndecorated(true);
        this.getContentPane().setBackground(Color.red);
        this.setLayout(null);
        this.setVisible(true);
        this.saludar();
    }

    private void saludar() {
        String mensaje = "Hola mundo!";
        System.out.println(mensaje);
    }

}
