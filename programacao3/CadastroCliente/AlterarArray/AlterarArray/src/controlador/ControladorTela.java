/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import visao.Tela1;

/**
 *
 * @author victorperes
 */
public class ControladorTela {
    JDesktopPane jDesktop;

    public ControladorTela(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }
    
    public void abrirTela1(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        Tela1 tela1 = new Tela1();        
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
}
