/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.TBrincadeira;
import view.TComida;

/**
 *
 * @author alunos
 */
public class ControladorTelas {
    JDesktopPane jDesktop;

    public ControladorTelas(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }
    
    public void abrirComida(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TComida tComida = new TComida();        
        tComida.setSize(resolucao);
        tComida.setLocation(0, 0);
        jDesktop.add(tComida);
        tComida.setVisible(true);
    }
    
    public void abrirBrincadeira(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TBrincadeira tBrincadeira = new TBrincadeira();        
        tBrincadeira.setSize(resolucao);
        tBrincadeira.setLocation(0, 0);
        jDesktop.add(tBrincadeira);
        tBrincadeira.setVisible(true);
    }
    
}
