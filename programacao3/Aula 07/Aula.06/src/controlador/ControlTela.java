/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.Tela1;
import view.Tela2;
import view.Tela3;

/**
 *
 * @author alunos
 */
public class ControlTela {
    JDesktopPane painel;

    public ControlTela(JDesktopPane painel) {
        this.painel = painel;
    }
    
    public void abrirTela1(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       Tela1 tela1 = new Tela1();
       tela1.setSize(resolucao);
       tela1.setLocation(0, 0);
       painel.add(tela1);
       tela1.setVisible(true);
 }
      public void abrirTela2(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       Tela2 tela2 = new Tela2();
       tela2.setSize(resolucao);
       tela2.setLocation(0, 0);
       painel.add(tela2);
       tela2.setVisible(true);
 }
      public void abrirTela3(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       Tela3 tela3 = new Tela3();
       tela3.setSize(resolucao);
       tela3.setLocation(0, 0);
       painel.add(tela3);
       tela3.setVisible(true);
 }
}
