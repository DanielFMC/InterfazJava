/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import app.services.ObjGraficosService;
import app.services.RecursosService;

/**
 *
 * @author DanielFMC
 */
public class VistaPrincipalTemplate extends JFrame {

    private JButton bEntrar;
    private JTextField tombre;
    private JLabel lNombre;

    // Declaración de servicios
    private final ObjGraficosService sObjGraficos;
    private final RecursosService sRecursos;
    private VistaPrincipalComponent vpComponent;

    public VistaPrincipalTemplate(VistaPrincipalComponent vpc) {
        super("Vista Principal");
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        this.vpComponent = vpc;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setLayout(null);
        this.setVisible(true);
    }

}
