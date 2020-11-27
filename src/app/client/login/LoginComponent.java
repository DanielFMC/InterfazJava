/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielFMC
 */
public class LoginComponent implements ActionListener {

    private final LoginTemplate loginTemplate;

    public LoginComponent() {
        loginTemplate = new LoginTemplate(this);
    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginTemplate.getBEntrar()) {
            mostrarDatos();
            entrar();
        }
        if (e.getSource() == loginTemplate.getBSignIn()) {
            JOptionPane.showMessageDialog(null, "Botón sigin in", "Advertencia", 1);
        }
        if (e.getSource() == loginTemplate.getBSignUp()) {
            JOptionPane.showMessageDialog(null, "Botón sigin up", "Advertencia", 1);
        }
        if (e.getSource() == loginTemplate.getBCerrar()) {
            System.exit(0);
        }
    }

    public void mostrarDatos() {
        String nombreUsuario = loginTemplate.getTUsuario().getText();
        String claveUsuario = new String(loginTemplate.getTClave().getPassword());
        String check = "No";
        if (loginTemplate.getCheckRecordar().isSelected()) {
            check = "Si";
        }
        JOptionPane.showMessageDialog(null, "Correo: " + nombreUsuario + "\nContraseña: " + claveUsuario + "\nRecordar? " + check, "Información", 1);
    }

    public void entrar() {
        VistaPrincipalComponent vPComponent = new VistaPrincipalComponent();
        loginTemplate.setVisible(false);
    }
}
