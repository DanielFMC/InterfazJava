/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.login;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author DanielFMC
 */
public class LoginTemplate extends JFrame {

    private final JPanel pDerecha, pIzquierda;
    private final JLabel lCorreo, lClave;
    private final JTextField tUsuario;
    private final JButton bEntrar, bSignIn, bSignOut;
    private final JPasswordField tClave;
    private final JCheckBox checkRecordar;

    public LoginTemplate() {
        super("Login de usuario");

        pIzquierda = new JPanel();
        pIzquierda.setSize(375, 600);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(new java.awt.Color(24, 24, 24));
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(375, 600);
        pDerecha.setLocation(375, 0);
        pDerecha.setBackground(new java.awt.Color(255, 0, 0));
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lCorreo = new JLabel("CORREO ELECTRÓNICO");
        lCorreo.setSize(150, 20);
        lCorreo.setLocation(60, 150);
        lCorreo.setForeground(Color.WHITE);
        pDerecha.add(lCorreo);

        tUsuario = new JTextField("Ingresa tu correo electrónico");
        tUsuario.setSize(250, 40);
        tUsuario.setLocation(60, 190);
        pDerecha.add(tUsuario);
        
        lClave = new JLabel("CONTRASEÑA");
        lClave.setSize(150, 20);
        lClave.setLocation(60, 280);
        lClave.setForeground(Color.WHITE);
        pDerecha.add(lClave);
        
        tClave = new JPasswordField("");
        tClave.setSize(250, 40);
        tClave.setLocation(60, 320);
        pDerecha.add(tClave);
        
        checkRecordar = new JCheckBox("Recordarme");
        checkRecordar.setSize(100, 20);
        checkRecordar.setBackground(new java.awt.Color(255, 0, 0));
        checkRecordar.setForeground(Color.WHITE);
        checkRecordar.setFocusable(false);
        checkRecordar.setLocation(60, 380);
        pDerecha.add(checkRecordar);
        
        bEntrar = new JButton("Entrar");
        bEntrar.setSize(80, 20);
        bEntrar.setLocation(60, 440);
        bEntrar.setFocusable(false);
        pDerecha.add(bEntrar);
        
        bSignIn = new JButton("Sign In");
        bSignIn.setSize(80, 20);
        bSignIn.setLocation(150, 60);
        bSignIn.setFocusable(false);
        pDerecha.add(bSignIn);
        
        bSignOut = new JButton("Sign Out");
        bSignOut.setSize(90, 20);
        bSignOut.setLocation(230, 60);
        bSignOut.setFocusable(false);
        pDerecha.add(bSignOut);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}
