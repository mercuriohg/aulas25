/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import modelo.Projeto;

/**
 *
 * @author cassio p e arthur g
 */
public class ControladorProjeto {
    
    JTextField jTextFieldID;
    JTextField jTextFieldNome;
    JTextField jTextFieldCpf;
    JTextField jTextFieldZap;
    JList<String> jListPessoas;
   
    ArrayList<Projeto> listaPessoas = new ArrayList<>();
    
    DefaultListModel listaTelaPessoa = new DefaultListModel();

    public ControladorProjeto(JTextField jTextFieldID, JTextField jTextFieldNome, JTextField jTextFieldCpf,JTextField jTextFieldZap, JList<String> jListPessoas) {
        this.jTextFieldID = jTextFieldID;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldCpf = jTextFieldCpf;
        this.jTextFieldZap = jTextFieldZap;
        this.jListPessoas = jListPessoas;
    }
    
    public void salvarPessoa(){
        int id = Integer.parseInt(jTextFieldID.getText());
        String nome = jTextFieldNome.getText();
        String cpf = jTextFieldCpf.getText();
        String zap = jTextFieldZap.getText();
    
        Projeto p = new Projeto(id, nome, cpf, zap);
        
        listaPessoas.add(p);
    
    }
    
    public void limpar(){
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldZap.setText("");
    }
    
    
    public void carregarLista() {
    
        listaTelaPessoa = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        
        for(Projeto p : listaPessoas){
            ListaTelaAtualizada.add(p.getNome());
        }
        
        Collections.sort(ListaTelaAtualizada);
        

        listaTelaPessoa.addAll(ListaTelaAtualizada);

        jListPessoas.setModel(listaTelaPessoa);
    }
    
    
 
    
    
    
}
