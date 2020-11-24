/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

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

import app.services.ObjGraficosService;
import app.services.RecursosService;

/**
 *
 * @author DanielFMC
 */
public class LoginTemplate extends JFrame {

    // Declaración de objetos gráficos
    private JPanel pDerecha, pIzquierda;
    private JLabel lCorreo, lClave;
    private JTextField tUsuario;
    private JButton bEntrar, bSignIn, bSignUp;
    private JPasswordField tClave;
    private JCheckBox checkRecordar;

    // Declaración de objetos decoradores
//    private Color colorRojoPrincipal, colorRojoT, colorNegro, colorGrisOscuro;
//    private Font fontPrincipalNegrita, fontPrincipalNormal, fontPrincipalPequena;
//    private Cursor cMano;
//    private Border bInferior;
    private ImageIcon iFacebook, iInstagram, iTwitter, iDimAux;
    private JLabel lLogo, lCerrar, lMin, lFacebook, lInstagram, lTwitter;

    // Declaración del objeto del servicio
    private final ObjGraficosService sObjGraficos;
    private final RecursosService sRecursos;

    public LoginTemplate() {
        super("Login de usuario");
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJLabels();
        this.crearJTextFields();
        this.crearJButtons();
        this.crearJPasswordFields();
        this.crearCheckBoxes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 550);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    public void crearJPanels() {
        pIzquierda = sObjGraficos.construirJPanel(0, 0, 350, 550, sRecursos.getColorNegro(), null);
        this.add(pIzquierda);

        pDerecha = sObjGraficos.construirJPanel(350, 0, 350, 550, sRecursos.getColorRojoPrincipal(), null);
        this.add(pDerecha);
    }

    public void crearObjetosDecoradores() {
        iFacebook = new ImageIcon("./src/assets/images/facebook.png");
        iInstagram = new ImageIcon("./src/assets/images/instagram.png");
        iTwitter = new ImageIcon("./src/assets/images/twitter.png");
    }

    public void crearJTextFields() {
        tUsuario = sObjGraficos.construirJTextField("Ingresa tu correo electrónico", 40, 200, 250, 40, sRecursos.getFontPrincipalNormal(), sRecursos.getColorRojoPrincipal(), sRecursos.getColorGrisOscuro(), sRecursos.getColorRojoTransparente(), sRecursos.getBInferior(), "n");
        pDerecha.add(tUsuario);
    }

    public void crearJButtons() {
        bEntrar = sObjGraficos.construirJButton("ENTRAR", 40, 410, 250, 50, sRecursos.getCMano(), null, sRecursos.getFontPrincipalNegrita(), sRecursos.getColorNegro(), Color.WHITE, null, "c", true);
        pDerecha.add(bEntrar);

        bSignIn = sObjGraficos.construirJButton("Sign In", 205, 80, 55, 20, sRecursos.getCMano(), null, sRecursos.getFontPrincipalPequena(), sRecursos.getColorRojoTransparente(), sRecursos.getColorNegro(), null, "c", true);
        pDerecha.add(bSignIn);

        bSignUp = sObjGraficos.construirJButton("Sign Up", 260, 80, 55, 20, sRecursos.getCMano(), null, sRecursos.getFontPrincipalPequena(), sRecursos.getColorNegro(), Color.WHITE, null, "c", true);
        pDerecha.add(bSignUp);
    }

    public void crearJLabels() {
        iDimAux = new ImageIcon(sRecursos.getILogo().getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING));
        lLogo = sObjGraficos.construirJLabel(null, 20, 0, 480, 480, null, iDimAux, null, null, null, null, "n");
        pIzquierda.add(lLogo);

        lFacebook = sObjGraficos.construirJLabel(null, 90, 480, 64, 64, sRecursos.getCMano(), (new ImageIcon(iFacebook.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING))), null, null, null, null, "n");
        pIzquierda.add(lFacebook);

        lInstagram = sObjGraficos.construirJLabel(null, (pIzquierda.getWidth() - 64) / 2, 480, 64, 64, sRecursos.getCMano(), (new ImageIcon(iInstagram.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING))), null, null, null, null, "n");
        pIzquierda.add(lInstagram);

        lTwitter = sObjGraficos.construirJLabel(null, 200, 480, 64, 64, sRecursos.getCMano(), (new ImageIcon(iTwitter.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING))), null, null, null, null, "n");
        pIzquierda.add(lTwitter);

        lCorreo = sObjGraficos.construirJLabel("CORREO ELECTRÓNICO", 40, 180, 150, 20, null, null, sRecursos.getFontPrincipalNegrita(), null, Color.WHITE, null, "n");
        pDerecha.add(lCorreo);

        lClave = sObjGraficos.construirJLabel("CONTRASEÑA", 40, 280, 150, 20, null, null, sRecursos.getFontPrincipalNegrita(), null, Color.WHITE, null, "n");
        pDerecha.add(lClave);

        lCerrar = sObjGraficos.construirJLabel(null, 318, 0, 32, 32, sRecursos.getCMano(), sRecursos.getICerrar(), null, null, null, null, "n");
        pDerecha.add(lCerrar);

        lMin = sObjGraficos.construirJLabel(null, 280, 0, 32, 32, sRecursos.getCMano(), sRecursos.getIMin(), null, null, null, null, "n");
        pDerecha.add(lMin);
    }

    public void crearJPasswordFields() {
        tClave = sObjGraficos.construirJPasswordFields("Contraseña", 40, 300, 250, 40, sRecursos.getFontPrincipalNormal(), sRecursos.getColorRojoPrincipal(), sRecursos.getColorGrisOscuro(), null, sRecursos.getBInferior(), "n");
        pDerecha.add(tClave);
    }

    public void crearCheckBoxes() {
        checkRecordar = sObjGraficos.construirJCheckBoxes("Recordarme", 40, 350, 100, 20, null, sRecursos.getFontPrincipalNormal(), sRecursos.getColorGrisOscuro());
        pDerecha.add(checkRecordar);
    }
}
