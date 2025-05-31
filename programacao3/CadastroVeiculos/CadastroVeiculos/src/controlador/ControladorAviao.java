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
import modelo.Aviao;

/**
 *
 * @author Mercúrio
 */
public class ControladorAviao {
    JTextField jTextFieldIDAviao;
    JTextField jTextFieldCapacidade;
    JTextField jTextFieldCompanhia;
    JTextField jTextFieldAnoAviao;
    JButton jButtonSalvarEditar;
    JTextField jTextFieldModelo;
    JList<String> jListAviao;
    ArrayList<Aviao> listaAviao = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorAviao(JTextField jTextFieldIDAviao, JTextField jTextFieldCapacidade, JTextField jTextFieldCompanhia, JTextField jTextFieldAnoAviao, JButton jButtonSalvarEditar, JTextField jTextFieldModelo, JList<String> jListAviao) {
        this.jTextFieldIDAviao = jTextFieldIDAviao;
        this.jTextFieldCapacidade = jTextFieldCapacidade;
        this.jTextFieldCompanhia = jTextFieldCompanhia;
        this.jTextFieldAnoAviao = jTextFieldAnoAviao;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.jTextFieldModelo = jTextFieldModelo;
        this.jListAviao = jListAviao;
    }

    public void inicioInsercaoAviao(){
        jTextFieldIDAviao.setText(gerarID() + "");
    }
 
    public void limparAviao(){
        jTextFieldIDAviao.setText(gerarID() + "");
        jTextFieldCapacidade.setText("");
        jTextFieldCompanhia.setText("");
        jTextFieldAnoAviao.setText("");
        jTextFieldModelo.setText("");
    }
    public void salvarAviao(){
        int id = Integer.parseInt(jTextFieldIDAviao.getText());
        int capacidade = Integer.parseInt(jTextFieldCapacidade.getText());
        String companhia = jTextFieldCompanhia.getText();
        int ano = Integer.parseInt(jTextFieldAnoAviao.getText());
        String modelo = jTextFieldModelo.getText();
        Aviao c = new Aviao(id, capacidade, companhia, ano, modelo);
        listaAviao.add(c);
        carregarListaAviao();
    }
    
    public void carregarListaAviao(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Aviao aviao : listaAviao) {
            listaAtualizada.add(aviao.getCompanhia() + " | " + aviao.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListAviao.setModel(defaultListModel);
    }
    
    
    public int gerarID() {
        int novoID = 1;
        if (!listaAviao.isEmpty()) {
          int indexU = listaAviao.size() - 1;
          Aviao u = listaAviao.get(indexU);
          novoID = u.getId() + 1;
        } else {
           
        }

        return novoID;
    }

}


