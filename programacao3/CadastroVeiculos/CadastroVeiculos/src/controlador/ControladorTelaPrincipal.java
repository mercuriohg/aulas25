/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.CarroTela;
import view.MotoTela;
import view.AviaoTela;
import view.PessoaTela;
/**
 *
 * @author Mercúrio
 */
public class ControladorTelaPrincipal {
    JDesktopPane painel;

    public ControladorTelaPrincipal(JDesktopPane painel) {
        this.painel = painel;
    }
    
    public void abrirTelaCarro(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       CarroTela tela1 = new CarroTela();
       tela1.setSize(resolucao);
       tela1.setLocation(0, 0);
       painel.add(tela1);
       tela1.setVisible(true);
 }
      public void abrirMoto(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       MotoTela tela2 = new MotoTela();
       tela2.setSize(resolucao);
       tela2.setLocation(0, 0);
       painel.add(tela2);
       tela2.setVisible(true);
 }
      public void abrirAviao(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       AviaoTela tela3 = new AviaoTela();
       tela3.setSize(resolucao);
       tela3.setLocation(0, 0);
       painel.add(tela3);
       tela3.setVisible(true);
 
   }
      public void abrirPessoa(){
       painel.removeAll();
       painel.updateUI();
       Dimension resolucao = painel.getSize(); // captura a resolução da tela
       PessoaTela tela3 = new PessoaTela();
       tela3.setSize(resolucao);
       tela3.setLocation(0, 0);
       painel.add(tela3);
       tela3.setVisible(true);
 }
}

