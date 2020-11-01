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
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

/**
 *
 * @author DanielFMC
 */
public class LoginTemplate extends JFrame {

    // Declaración de objetos gráficos
    private final JPanel pDerecha, pIzquierda;
    private final JLabel lCorreo, lClave;
    private final JTextField tUsuario;
    private final JButton bEntrar, bSignIn, bSignUp;
    private final JPasswordField tClave;
    private final JCheckBox checkRecordar;

    // Declaración de objetos decoradores
    private final Color colorRojoPrincipal, colorRojoT, colorNegro, colorGrisOscuro;
    private final Font fontPrincipalNegrita, fontPrincipalNormal, fontPrincipalPequena;
    private final Cursor cMano;
    private final Border bInferior;
    private final ImageIcon iLogo, iCerrar, iMin, iFacebook, iInstagram, iTwitter;
    private final JLabel lLogo, lCerrar, lMin, lFacebook, lInstagram, lTwitter;

    public LoginTemplate() {
        super("Login de usuario");

        colorRojoPrincipal = new Color(255, 0, 0);
        colorRojoT = new Color(229, 32, 48);
        colorNegro = new Color(24, 24, 24);
        colorGrisOscuro = new Color(144, 144, 144);
        fontPrincipalNegrita = new Font("Calibri", Font.BOLD, 14);
        fontPrincipalNormal = new Font("Calibri", Font.PLAIN, 14);
        fontPrincipalPequena = new Font("Calibri", Font.BOLD, 10);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        bInferior = BorderFactory.createMatteBorder(0, 0, 2, 0, colorGrisOscuro);
        iLogo = new ImageIcon("./src/assets/images/youtube.png");
        iCerrar = new ImageIcon("./src/assets/images/cerrar.png");
        iMin = new ImageIcon("./src/assets/images/minus.png");
        iFacebook = new ImageIcon("./src/assets/images/facebook.png");
        iInstagram = new ImageIcon("./src/assets/images/instagram.png");
        iTwitter = new ImageIcon("./src/assets/images/twitter.png");

        pIzquierda = new JPanel();
        pIzquierda.setSize(350, 550);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(colorNegro);
        pIzquierda.setLayout(null);
        this.add(pIzquierda);
        
        lLogo = new JLabel();
        lLogo.setBounds(20, 0, 480, 480);
        lLogo.setIcon(new ImageIcon(iLogo.getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING)));
        pIzquierda.add(lLogo);
        
        lFacebook = new JLabel();
        lFacebook.setSize(64, 64);
        lFacebook.setLocation(90, 480);
        lFacebook.setIcon(new ImageIcon(iFacebook.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        lFacebook.setCursor(cMano);
        pIzquierda.add(lFacebook);
        
        lInstagram = new JLabel();
        lInstagram.setSize(64, 64);
        lInstagram.setLocation((pIzquierda.getWidth() - lInstagram.getWidth()) / 2, 480);
        lInstagram.setIcon(new ImageIcon(iInstagram.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        lInstagram.setCursor(cMano);
        pIzquierda.add(lInstagram);
        
        lTwitter = new JLabel();
        lTwitter.setSize(64, 64);
        lTwitter.setLocation(200, 480);
        lTwitter.setIcon(new ImageIcon(iTwitter.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        lTwitter.setCursor(cMano);
        pIzquierda.add(lTwitter);

        pDerecha = new JPanel();
        pDerecha.setSize(350, 550);
        pDerecha.setLocation(350, 0);
        pDerecha.setBackground(colorRojoPrincipal);
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lCorreo = new JLabel("CORREO ELECTRÓNICO");
        lCorreo.setSize(150, 20);
        lCorreo.setLocation(40, 180);
        lCorreo.setForeground(Color.WHITE);
        lCorreo.setFont(fontPrincipalNegrita);
        pDerecha.add(lCorreo);

        tUsuario = new JTextField("Ingresa tu correo electrónico");
        tUsuario.setSize(250, 40);
        tUsuario.setLocation(40, 200);
        tUsuario.setForeground(colorGrisOscuro);
        tUsuario.setBackground(colorRojoPrincipal);
        tUsuario.setBorder(bInferior);
        pDerecha.add(tUsuario);

        lClave = new JLabel("CONTRASEÑA");
        lClave.setSize(150, 20);
        lClave.setLocation(40, 280);
        lClave.setForeground(Color.WHITE);
        pDerecha.add(lClave);

        tClave = new JPasswordField("Contrasena");
        tClave.setSize(250, 40);
        tClave.setLocation(40, 300);
        tClave.setForeground(colorGrisOscuro);
        tClave.setBackground(colorRojoPrincipal);
        tClave.setBorder(bInferior);
        pDerecha.add(tClave);

        checkRecordar = new JCheckBox("Recordarme");
        checkRecordar.setSize(100, 20);
        checkRecordar.setBackground(colorRojoPrincipal);
        checkRecordar.setForeground(colorGrisOscuro);
        checkRecordar.setFocusable(false);
        checkRecordar.setLocation(40, 350);
        pDerecha.add(checkRecordar);

        bEntrar = new JButton("ENTRAR");
        bEntrar.setSize(250, 50);
        bEntrar.setLocation(40, 410);
        bEntrar.setFocusable(false);
        bEntrar.setCursor(cMano);
        bEntrar.setBackground(colorNegro);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setFont(fontPrincipalNegrita);
        bEntrar.setBorder(null);
        pDerecha.add(bEntrar);

        bSignIn = new JButton("Sign In");
        bSignIn.setSize(55, 20);
        bSignIn.setLocation(205, 80);
        bSignIn.setFocusable(false);
        bSignIn.setCursor(cMano);
        bSignIn.setForeground(colorNegro);
        bSignIn.setBackground(colorRojoT);
        bSignIn.setFont(fontPrincipalPequena);
        bSignIn.setBorder(null);
        pDerecha.add(bSignIn);

        bSignUp = new JButton("Sign Up");
        bSignUp.setSize(55, 20);
        bSignUp.setLocation(260, 80);
        bSignUp.setFocusable(false);
        bSignUp.setCursor(cMano);
        bSignUp.setForeground(Color.WHITE);
        bSignUp.setBackground(colorNegro);
        bSignUp.setFont(fontPrincipalPequena);
        bSignUp.setBorder(null);
        pDerecha.add(bSignUp);
        
        lCerrar = new JLabel();
        lCerrar.setBounds(318, 0, 32, 32);
        lCerrar.setIcon(iCerrar);
        lCerrar.setCursor(cMano);
        pDerecha.add(lCerrar);
        
        lMin = new JLabel();
        lMin.setBounds(280, 0, 32, 32);
        lMin.setIcon(iMin);
        lMin.setCursor(cMano);
        pDerecha.add(lMin);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 550);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }
}
