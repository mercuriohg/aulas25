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
import modelo.Cliente;

/**
 *
 * @author victorperes
 */
public class ControladorCliente {

    JTextField jTextFieldId;
    JTextField jTextFieldNome;
    JTextField jTextFieldTelefone;
    JButton jButtonSalvarEditar;
    JList<String> jListClientes;
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();
    int index; 
    public ControladorCliente(JTextField jTextFieldId, JTextField jTextFieldNome, JTextField jTextFieldTelefone, JButton jButtonSalvarEditar, JList<String> jListProjetos) {
        this.jTextFieldId = jTextFieldId;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldTelefone = jTextFieldTelefone;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        this.jListClientes = jListProjetos;
        limpar();
    }

    public void limpar() {

        jTextFieldNome.setText("");
        jTextFieldTelefone.setText("");
        //   jTextFieldId.setText(String.valueOf(gerarID()));
        jTextFieldId.setText(gerarID() + "");
        jButtonSalvarEditar.setText("Salvar");
    }

    public void salvarCliente() {
        int id = Integer.parseInt(jTextFieldId.getText());
        String nome = jTextFieldNome.getText();
        String telefone = jTextFieldTelefone.getText();
        Cliente c = new Cliente(id, nome, telefone);

        if(jButtonSalvarEditar.getText().compareToIgnoreCase("Salvar")==0){
            listaCliente.add(c);
        
            
        } else{
            listaCliente.set(index, c);
    
        }
        limpar();
        carregarLista();
    }

    public void carregarLista() {
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Cliente cliente : listaCliente) {
            listaAtualizada.add(cliente.getNome() + " - " + cliente.getId());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListClientes.setModel(defaultListModel);
    }

    public int gerarID() {
        int novoID = 1;
        if (!listaCliente.isEmpty()) {
            novoID = listaCliente.getLast().getId() + 1;
            
            
            //  int indexU = listaCliente.size() - 1;
            //  Cliente u = listaCliente.get(indexU);
            //  novoID = u.getId() + 1;
        } 

        return novoID;
    }
    
    public void selecionarObjeto(){
         String clienteSelecionado = jListClientes.getSelectedValue();
         index = 0;
         for (Cliente cliente : listaCliente){
            String temp = cliente.getNome() + " - " + cliente.getId();
            if (temp.compareToIgnoreCase(clienteSelecionado) == 0){
                jTextFieldId.setText(cliente.getId()+"");
                jTextFieldNome.setText(cliente.getNome());
                jTextFieldTelefone.setText(cliente.getTelefone());
                jButtonSalvarEditar.setText("Editar");
                break;
            }
         index++;
         
       }
   }
}
