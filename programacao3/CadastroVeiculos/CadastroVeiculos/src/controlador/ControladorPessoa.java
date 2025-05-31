/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import modelo.Pessoa;

/**
 *
 * @author Mercúrio
 */
public class ControladorPessoa {
    JTextField jTextFieldIDPessoa;
    JTextField jTextFieldNome;
    JTextField jTextFieldFormacao;
    JTextField jTextFieldGmail;
    JButton jButtonSalvarEditar;
    JTextField jTextFieldCPF;
    JList<String> jListPessoas;
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorPessoa(JTextField jTextFieldIDPessoa, JTextField jTextFieldNome, JTextField jTextFieldFormacao, JTextField jTextFieldGmail, JButton jButtonSalvarEditar, JTextField jTextFieldCPF, JList<String> jListPessoas) {
        this.jTextFieldIDPessoa = jTextFieldIDPessoa;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldFormacao = jTextFieldFormacao;
        this.jTextFieldGmail = jTextFieldGmail;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.jTextFieldCPF = jTextFieldCPF;
        this.jListPessoas = jListPessoas;
    }

  

  
    public void inicioInsercaoPessoa(){
        jTextFieldIDPessoa.setText(gerarID() + "");
    }
 
    public void limparPessoa(){
        jTextFieldIDPessoa.setText(gerarID() + "");
        jTextFieldNome.setText("");
        jTextFieldFormacao.setText("");
        jTextFieldGmail.setText("");
        jTextFieldCPF.setText("");
    }
    public void salvarPessoa(){
        int id = Integer.parseInt(jTextFieldIDPessoa.getText());
        String nome = jTextFieldNome.getText();
        String formacao = jTextFieldFormacao.getText();
        String gmail = jTextFieldGmail.getText();
        String cpf = jTextFieldCPF.getText();
        Pessoa c = new Pessoa(id, nome, formacao, gmail, cpf);
        listaPessoa.add(c);
        carregarListaPessoa();
    }
    
    public void carregarListaPessoa(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Pessoa pessoa : listaPessoa) {
            listaAtualizada.add(pessoa.getNome() + " | " + pessoa.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListPessoas.setModel(defaultListModel);
    }
    
    
    public int gerarID() {
        int novoID = 1;
        if (!listaPessoa.isEmpty()) {
          int indexU = listaPessoa.size() - 1;
          Pessoa u = listaPessoa.get(indexU);
          novoID = u.getId() + 1;
        } else {
           
        }

        return novoID;
    }

}
