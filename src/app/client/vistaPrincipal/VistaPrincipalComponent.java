/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

/**
 *
 * @author DanielFMC
 */
public class VistaPrincipalComponent {
    
    private VistaPrincipalTemplate tpTemplate;

    public VistaPrincipalComponent() {
        tpTemplate = new VistaPrincipalTemplate(this);
    }
    
    public VistaPrincipalTemplate getVpTemplate() {
        return tpTemplate;
    }
    
}
