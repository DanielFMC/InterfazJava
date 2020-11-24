/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author DanielFMC
 */
public class RecursosService {

    private Color colorRojoPrincipal, colorRojoT, colorNegro, colorGrisOscuro;
    private Font fontPrincipalNegrita, fontPrincipalNormal, fontPrincipalPequena;
    private Cursor cMano;
    private Border bInferior;
    private ImageIcon iLogo, iCerrar, iMin;

    static private RecursosService servicio;

    private RecursosService() {
        this.crearColores();
        this.crearFuentes();
        this.crearCursores();
        this.crearBordes();
        this.crearImagenes();
    }

    /* Colores */
    private void crearColores() {
        colorRojoPrincipal = new Color(255, 0, 0);
        colorRojoT = new Color(229, 32, 48);
        colorNegro = new Color(24, 24, 24);
        colorGrisOscuro = new Color(144, 144, 144);
    }

    public Color getColorRojoPrincipal() {
        return colorRojoPrincipal;
    }

    public Color getColorRojoTransparente() {
        return colorRojoT;
    }

    public Color getColorNegro() {
        return colorNegro;
    }

    public Color getColorGrisOscuro() {
        return colorGrisOscuro;
    }

    /* Fuentes */
    private void crearFuentes() {
        fontPrincipalNegrita = new Font("Calibri", Font.BOLD, 14);
        fontPrincipalNormal = new Font("Calibri", Font.PLAIN, 14);
        fontPrincipalPequena = new Font("Calibri", Font.BOLD, 10);
    }

    public Font getFontPrincipalNegrita() {
        return fontPrincipalNegrita;
    }

    public Font getFontPrincipalNormal() {
        return fontPrincipalNormal;
    }

    public Font getFontPrincipalPequena() {
        return fontPrincipalPequena;
    }

    /* Cursores */
    private void crearCursores() {
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }

    public Cursor getCMano() {
        return cMano;
    }

    /* Bordes */
    private void crearBordes() {
        bInferior = BorderFactory.createMatteBorder(0, 0, 2, 0, colorGrisOscuro);
    }

    public Border getBInferior() {
        return bInferior;
    }

    /* Imagenes */
    private void crearImagenes() {
        iLogo = new ImageIcon("./src/assets/images/youtube.png");
        iCerrar = new ImageIcon("./src/assets/images/cerrar.png");
        iMin = new ImageIcon("./src/assets/images/minus.png");
    }
    
    public ImageIcon getILogo() {
        return iLogo;
    }

    public ImageIcon getICerrar() {
        return iCerrar;
    }

    public ImageIcon getIMin() {
        return iMin;
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }
}
