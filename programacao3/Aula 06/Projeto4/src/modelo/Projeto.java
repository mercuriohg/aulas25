/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alunos
 */
public class Projeto {
    
   int id;
    String nome;
    String cpf;
    String zap;

    public Projeto(int id, String nome, String cpf, String zap) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.zap = zap;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
      public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        this.zap = zap;
    }
    
    public void imprimir(){
        System.out.println("==================");
        System.out.println("ID: "+id);
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Whatsapp: "+zap);
        System.out.println("==================");
    }
    
    
}
