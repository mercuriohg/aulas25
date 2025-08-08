/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import javax.print.attribute.standard.JobKOctets;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;
import modelo.Comida;

/**
 *
 * @author anaca
 */
public class CComida {
    JTextField jTextFieldId;
    JTextField jTextFieldNome;
    JTextField jTextFieldValor;
    JComboBox<String> jComboBoxCategoria = new JComboBox<>(new String[]{"Doce", "Salgado"});
    JList<String> jListComidas;
    ArrayList<Comida> listaComidas = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();
    JButton jButtonSalvarEditar;
    int index;

    public CComida(JTextField jTextFieldId, JTextField jTextFieldNome, JTextField jTextFieldValor, JComboBox jComboBoxCategoria, JList<String> jListComidas, JButton jButtonSalvarEditar, int index) {
        this.jTextFieldId = jTextFieldId;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldValor = jTextFieldValor;
        this.jComboBoxCategoria = jComboBoxCategoria;
        this.jListComidas = jListComidas;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.index = index;
        limpar();
    }


    
    public void limpar(){
        jTextFieldId.setText(gerarId() +"");
        jTextFieldNome.setText("");
        jTextFieldValor.setText("");
    }
    
    public int gerarId(){
        int novoId = 1;
        if(!listaComidas.isEmpty()){
            int indexU = listaComidas.size()-1;
            Comida c = listaComidas.get(indexU);
            novoId = c.getId()+1;
        }
        return novoId;        
    }
    
    public void cadastrarComida(){
        int id = Integer.parseInt(jTextFieldId.getText());
        String nome = jTextFieldNome.getText();
        float valor = Float.parseFloat(jTextFieldValor.getText());
        String categoria = jComboBoxCategoria.getSelectedItem()+"";
        
        Comida c = new Comida(id, nome, valor, categoria);
        
        if(jButtonSalvarEditar.getText().compareToIgnoreCase("Salvar")==0){
            listaComidas.add(c);
        }
        else{
        listaComidas.set(index, c);
        }
        limpar();
        carregarLista();
    }
    
    public void carregarLista(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Comida c: listaComidas) {
            listaAtualizada.add(c.getNome() + " - " + c.getCategoria() + " - " + c.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListComidas.setModel(defaultListModel);      
    }
    
    public void selecionarObjeto(){
        String comidaSelecionada = jListComidas.getSelectedValue();
        index = 0;
        
        for (Comida c:listaComidas){
            String temp = c.getNome() + " - " + c.getCategoria() + " - " + c.getId();
            if  (temp.compareToIgnoreCase(comidaSelecionada) == 0){
                jTextFieldId.setText(c.getId()+"");
                jTextFieldNome.setText(c.getNome()+"");
                jTextFieldValor.setText(c.getValor()+"");
                jButtonSalvarEditar.setText("Editar");
                if (c.getCategoria().compareToIgnoreCase(jComboBoxCategoria.getItemAt(0))==0){
                    jComboBoxCategoria.setSelectedIndex(0);
                }
                else{
                   jComboBoxCategoria.setSelectedIndex(1); 
                }
                
                
                break;
            }
            index++;     
        }
    }
    
    
    
}
