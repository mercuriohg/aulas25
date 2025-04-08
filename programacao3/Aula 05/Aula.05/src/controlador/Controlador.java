/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JTextField;
import modelo.Fabricante;
/**
 *
 * @author Mercúrio
 */
public class Controlador {
    JTextField jTextFieldNome;
    JTextField jTextFieldCor;
    JTextField jTextFieldFabricante;
    JTextField jTextFieldMarca;
    JTextField jTextFieldModelo;
    ArrayList<Fabricante>listFabri = new ArrayList<>();

    public Controlador(JTextField jTextFieldNome, JTextField jTextFieldCor, JTextField jTextFieldFabricante, JTextField jTextFieldMarca, JTextField jTextFieldModelo) {
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldCor = jTextFieldCor;
        this.jTextFieldFabricante = jTextFieldFabricante;
        this.jTextFieldMarca = jTextFieldMarca;
        this.jTextFieldModelo = jTextFieldModelo;
    }

    public void teste(){
        String nome = jTextFieldNome.getText();
        String cor = jTextFieldCor.getText();
        String fabricante = jTextFieldFabricante.getText();
        String marca = jTextFieldMarca.getText();
        String modelo = jTextFieldModelo.getText();
        
        Fabricante c = new Fabricante(nome, cor, fabricante, marca, modelo);
        listFabri.add(c);
        imprimirTodos();
        limpar();
    }
    public void imprimirTodos(){
        for(Fabricante fabricanteX : listFabri){
            fabricanteX.cadastrar();
        }
        
    }
    public void limpar(){
        jTextFieldNome.setText("");
        jTextFieldCor.setText("");
        jTextFieldFabricante.setText("");
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");  
    }
  }

