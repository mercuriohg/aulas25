/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JTextField;

/**
 *
 * @author Mercúrio
 */
public class Fabricante {
    String nome;
    String cor;
    String fabricante;
    String marca;
    String modelo;

    public Fabricante(String nome, String cor, String fabricante, String marca, String modelo) {
        this.nome = nome;
        this.cor = cor;
        this.fabricante = fabricante;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Fabricante(JTextField jTextFieldNome, JTextField jTextFieldCor, JTextField jTextFieldFabricante, JTextField jTextFieldMarca, JTextField jTextFieldModelo) {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void cadastrar(){
        System.out.println("============");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("============");
    }

    public void teste() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
