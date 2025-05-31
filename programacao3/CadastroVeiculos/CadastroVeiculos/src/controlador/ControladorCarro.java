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
import modelo.Carro;

/**
 *
 * @author Mercúrio
 */
public class ControladorCarro {
    JTextField jTextFieldIDCarro;
    JTextField jTextFieldFabricanteCarro;
    JTextField jTextFieldCorCarro;
    JTextField jTextFieldAnoCarro;
    JButton jButtonSalvarEditar;
    JTextField jTextFieldPlacaCarro;
    JList<String> jListCarros;
    ArrayList<Carro> listaCarro = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorCarro(JTextField jTextFieldIDCarro, JTextField jTextFieldFabricanteCarro, JTextField jTextFieldCorCarro, JTextField jTextFieldAnoCarro, JButton jButtonSalvarEditar, JTextField jTextFieldPlacaCarro, JList<String> jListCarros) {
        this.jTextFieldIDCarro = jTextFieldIDCarro;
        this.jTextFieldFabricanteCarro = jTextFieldFabricanteCarro;
        this.jTextFieldCorCarro = jTextFieldCorCarro;
        this.jTextFieldAnoCarro = jTextFieldAnoCarro;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.jTextFieldPlacaCarro = jTextFieldPlacaCarro;
        this.jListCarros = jListCarros;
    }

  
    public void inicioInsercaoCarro(){
        jTextFieldIDCarro.setText(gerarID() + "");
    }
 
    public void limparCarro(){
        jTextFieldIDCarro.setText(gerarID() + "");
        jTextFieldFabricanteCarro.setText("");
        jTextFieldCorCarro.setText("");
        jTextFieldAnoCarro.setText("");
        jTextFieldPlacaCarro.setText("");
    }
    public void salvarCarro(){
        int id = Integer.parseInt(jTextFieldIDCarro.getText());
        String fabricante = jTextFieldFabricanteCarro.getText();
        String cor = jTextFieldCorCarro.getText();
        int ano = Integer.parseInt(jTextFieldAnoCarro.getText());
        String placa = jTextFieldPlacaCarro.getText();
        Carro c = new Carro(id, fabricante, cor, ano, placa);
        listaCarro.add(c);
        carregarListaCarro();
    }
    
    public void carregarListaCarro(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Carro carro : listaCarro) {
            listaAtualizada.add(carro.getFabricante() + " | " + carro.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListCarros.setModel(defaultListModel);
    }
    
    
    public int gerarID() {
        int novoID = 1;
        if (!listaCarro.isEmpty()) {
          int indexU = listaCarro.size() - 1;
          Carro u = listaCarro.get(indexU);
          novoID = u.getId() + 1;
        } else {
           
        }

        return novoID;
    }

}
