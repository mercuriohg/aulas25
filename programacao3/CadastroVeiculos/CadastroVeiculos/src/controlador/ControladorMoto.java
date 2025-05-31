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
import modelo.Moto;

/**
 *
 * @author Mercúrio
 */
public class ControladorMoto {
    JTextField jTextFieldIDMoto;
    JTextField jTextFieldFabricanteMoto;
    JTextField jTextFieldCorMoto;
    JTextField jTextFieldAnoMoto;
    JButton jButtonSalvarEditar;
    JTextField jTextFieldPlacaMoto;
    JList<String> jListCarros;
    ArrayList<Moto> listaMoto = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorMoto(JTextField jTextFieldIDMoto, JTextField jTextFieldFabricanteMoto, JTextField jTextFieldCorMoto, JTextField jTextFieldAnoMoto, JButton jButtonSalvarEditar, JTextField jTextFieldPlacaMoto, JList<String> jListCarros) {
        this.jTextFieldIDMoto = jTextFieldIDMoto;
        this.jTextFieldFabricanteMoto = jTextFieldFabricanteMoto;
        this.jTextFieldCorMoto = jTextFieldCorMoto;
        this.jTextFieldAnoMoto = jTextFieldAnoMoto;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.jTextFieldPlacaMoto = jTextFieldPlacaMoto;
        this.jListCarros = jListCarros;
    }

  
    

  
    public void inicioInsercaoMoto(){
        jTextFieldIDMoto.setText(gerarID() + "");
    }
 
    public void limparMoto(){
        jTextFieldIDMoto.setText(gerarID() + "");
        jTextFieldFabricanteMoto.setText("");
        jTextFieldCorMoto.setText("");
        jTextFieldAnoMoto.setText("");
        jTextFieldPlacaMoto.setText("");
    }
    public void salvarMoto(){
        int id = Integer.parseInt(jTextFieldIDMoto.getText());
        String fabricante = jTextFieldFabricanteMoto.getText();
        String cor = jTextFieldCorMoto.getText();
        int ano = Integer.parseInt(jTextFieldAnoMoto.getText());
        String placa = jTextFieldPlacaMoto.getText();
        Moto c = new Moto(id, fabricante, cor, ano, placa);
        listaMoto.add(c);
        carregarListaMoto();
    }
    
    public void carregarListaMoto(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Moto moto : listaMoto) {
            listaAtualizada.add(moto.getFabricante() + " | " + moto.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListCarros.setModel(defaultListModel);
    }
    
    
    public int gerarID() {
        int novoID = 1;
        if (!listaMoto.isEmpty()) {
          int indexU = listaMoto.size() - 1;
          Moto u = listaMoto.get(indexU);
          novoID = u.getId() + 1;
        } else {
           
        }

        return novoID;
    }

    
}
