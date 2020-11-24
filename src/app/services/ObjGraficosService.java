/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author DanielFMC
 */
public class ObjGraficosService {

    private JPanel panel;
    private JButton button;
    private JTextField textField;
    private JLabel label;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    static private ObjGraficosService servicio;

    private ObjGraficosService() {

    }

    public JPanel construirJPanel(int x, int y, int ancho, int alto, Color colorFondo, Border borde) {
        panel = new JPanel();
        panel.setSize(ancho, alto);
        panel.setLocation(x, y);
        panel.setLayout(null);
        panel.setBackground(colorFondo);
        panel.setBorder(borde);
        return panel;
    }

    public JButton construirJButton(String texto, int x, int y, int ancho, int alto, Cursor cursor,
            ImageIcon imagen, Font fuente, Color colorFondo, Color colorFuente, Border borde, String direccion, boolean esSolido) {
        button = new JButton(texto);
        button.setLocation(x, y);
        button.setSize(ancho, alto);
        button.setFocusable(false);
        button.setCursor(cursor);
        button.setFont(fuente);
        button.setBackground(colorFondo);
        button.setForeground(colorFuente);
        button.setIcon(imagen);
        button.setBorder(borde);
        button.setContentAreaFilled(esSolido);
        switch (direccion) {
            case "l":
                button.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "r":
                button.setHorizontalAlignment(SwingConstants.RIGHT);
                button.setHorizontalTextPosition(SwingConstants.LEFT);
                break;
            case "t":
                button.setVerticalTextPosition(SwingConstants.TOP);
                button.setHorizontalTextPosition(SwingConstants.CENTER);
                break;
            case "b":
                button.setVerticalTextPosition(SwingConstants.BOTTOM);
                button.setHorizontalTextPosition(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return button;
    }

    public JTextField construirJTextField(String texto, int x, int y, int ancho, int alto, Font fuente,
            Color colorFondo, Color colorFuente, Color colorCaret, Border borde, String direccion) {
        textField = new JTextField();
        textField.setLocation(x, y);
        textField.setSize(ancho, alto);
        textField.setText(texto);
        textField.setForeground(colorFuente);
        textField.setBackground(colorFondo);
        textField.setCaretColor(colorCaret);
        textField.setFont(fuente);
        textField.setBorder(borde);
        switch (direccion) {
            case "c":
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                textField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                textField.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            default:
                break;
        }
        return textField;
    }

    public JLabel construirJLabel(String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen,
            Font fuente, Color colorFondo, Color colorFuente, Border borde, String direccion) {
        label = new JLabel(texto);
        label.setLocation(x, y);
        label.setSize(ancho, alto);
        label.setForeground(colorFuente);
        label.setFont(fuente);
        label.setCursor(cursor);
        label.setIcon(imagen);
        label.setBorder(borde);
        if (colorFondo != null) {
            label.setOpaque(true);
            label.setBackground(colorFondo);
        }
        switch (direccion) {
            case "c":
                label.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                label.setHorizontalAlignment(SwingConstants.RIGHT);
                label.setHorizontalTextPosition(SwingConstants.LEFT);
                break;
            case "t":
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalTextPosition(SwingConstants.TOP);
                label.setHorizontalTextPosition(SwingConstants.CENTER);
                break;
            case "b":
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalTextPosition(SwingConstants.BOTTOM);
                label.setHorizontalTextPosition(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return label;
    }

    public JPasswordField construirJPasswordFields(String texto, int x, int y, int ancho, int alto,
            Font fuente, Color colorFondo, Color colorFuente, Color colorCaret, Border borde, String direccion) {
        passwordField = new JPasswordField();
        passwordField.setLocation(x, y);
        passwordField.setSize(ancho, alto);
        passwordField.setText(texto);
        passwordField.setForeground(colorFuente);
        passwordField.setBackground(colorFondo);
        passwordField.setCaretColor(colorCaret);
        passwordField.setBorder(borde);
        switch (direccion) {
            case "c":
                passwordField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                passwordField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return passwordField;
    }

    public JCheckBox construirJCheckBoxes(String texto, int x, int y, int ancho, int alto, Cursor cursor, Font fuente, Color colorFuente) {
        checkBox = new JCheckBox(texto);
        checkBox.setLocation(x, y);
        checkBox.setSize(ancho, alto);
        checkBox.setFocusable(false);
        checkBox.setBackground(null);
        checkBox.setCursor(cursor);
        checkBox.setFont(fuente);
        checkBox.setForeground(colorFuente);
        return checkBox;
    }

    public static ObjGraficosService getService() {
        if (servicio == null) {
            servicio = new ObjGraficosService();
        }
        return servicio;
    }

}
