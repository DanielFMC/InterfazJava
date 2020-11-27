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
import javax.swing.JPanel;

/**
 *
 * @author DanielFMC
 */
public class VistaPrincipalTemplate extends JFrame {

    // Declaración de objetos gráficos
    private JPanel pMenu, pPrincipal, pBusqueda;

    // Declaración de servicios
    private final ObjGraficosService sObjGraficos;
    private final RecursosService sRecursos;
    private VistaPrincipalComponent vpComponent;

    // Declaración de servicios
    private final ObjGraficosService sObjGraficos;
    private final RecursosService sRecursos;
    private VistaPrincipalComponent vpComponent;

    public VistaPrincipalTemplate(VistaPrincipalComponent vpc) {
        super("Vista Principal");
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        this.vpComponent = vpc;
        
        this.crearJPanels();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1400, 800);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearJPanels() {
        pMenu = sObjGraficos.construirJPanel(0, 0, 300, 800, Color.orange, null);
        this.add(pMenu);
        
        pBusqueda = sObjGraficos.construirJPanel(300, 0, 1150, 80, Color.BLACK, null);
        this.add(pBusqueda);
        
        pPrincipal = sObjGraficos.construirJPanel(300, 80, 1150, 720, Color.BLUE, null);
        this.add(pPrincipal);
    }

}
