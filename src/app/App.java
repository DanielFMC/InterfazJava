/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.vistaPrincipal.VistaPrincipalTemplate;
import javax.swing.SwingUtilities;

/**
 *
 * @author DanielFMC
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
                VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }

}
