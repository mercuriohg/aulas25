/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BD.BDBrincadeira;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import modelo.Brincadeira;

/**
 *
 * @author alunos
 */
public class CBrincadeira {
    JTextField jTextFieldId;
    JTextField jTextFieldNome;
    JTextField jTextFieldDescricao;
    JTextField jTextFieldValor;
    JList<String> jListBrincadeiras;
    ArrayList<Brincadeira> listaBrincadeiras = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();
    int index;
    JButton jButtonSalvarEditar;
    
    BDBrincadeira bd = new BDBrincadeira();

    public CBrincadeira(JTextField jTextFieldId, JTextField jTextFieldNome, JTextField jTextFieldDescricao, JTextField jTextFieldValor, JList<String> jListBrincadeiras, int index, JButton jButtonSalvarEditar) {
        this.jTextFieldId = jTextFieldId;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldDescricao = jTextFieldDescricao;
        this.jTextFieldValor = jTextFieldValor;
        this.jListBrincadeiras = jListBrincadeiras;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.listaBrincadeiras = bd.carregarBanco();
    }
 
    public void limpar(){
        jTextFieldId.setText(gerarId() + "");
        jTextFieldNome.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldValor.setText("");
    }
    
    public int gerarId(){
        int novoId = 1;
        if (!listaBrincadeiras.isEmpty()){
            int indexU = listaBrincadeiras.size() - 1;
            Brincadeira b = listaBrincadeiras.get(indexU);
            novoId = b.getId()+1;
        }
        return novoId;    
    }
    
    public void cadastrarBrincadeira(){
        int id = Integer.parseInt(jTextFieldId.getText());
        String nome = jTextFieldNome.getText();
        String descricao = jTextFieldDescricao.getText();
        float valor = Float.parseFloat(jTextFieldValor.getText());
        
        Brincadeira b = new Brincadeira(id, nome, descricao, valor);
        if (jButtonSalvarEditar.getText().compareToIgnoreCase("Salvar") == 0) {
            listaBrincadeiras.add(b);
        }
        else{
           listaBrincadeiras.set(index, b); 
        }  
        bd.salvarBanco(listaBrincadeiras);
        limpar();
        carregarLista();
}
    
    public void carregarLista(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Brincadeira b: listaBrincadeiras) {
            listaAtualizada.add(b.getNome() + " - " + b.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListBrincadeiras.setModel(defaultListModel);      
    }
    
    public void selecionarObjeto(){
        String brincadeiraSelecionada = jListBrincadeiras.getSelectedValue();
        index = 0;
        
        for (Brincadeira b:listaBrincadeiras){
            String temp = b.getNome() + " - " + b.getId();
            if  (temp.compareToIgnoreCase(brincadeiraSelecionada) == 0){
                jTextFieldId.setText(b.getId()+"");
                jTextFieldNome.setText(b.getNome()+"");
                jTextFieldDescricao.setText(b.getDescricao()+"");
                jTextFieldValor.setText(b.getValor()+"");
                jButtonSalvarEditar.setText("Editar");
                break;
            }
            index++;     
        }
        
    }
    

    
    
    
    
}
