public class Escola {
    int id;
    String endereco;
    int quantAlunos;
    String telefone;
    String nome;
    
      public Escola(int id, String endereco, int quantAlunos, String telefone, String nome) {
        this.id = id;
        this.endereco = endereco;
        this.quantAlunos = quantAlunos;
        this.telefone = telefone;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      public void imprimir(){
        System.out.println("=============");
        System.out.println("ID:" + id);
        System.out.println("Endereço:" + endereco);
        System.out.println("Quant. Alunos:" + quantAlunos);
        System.out.println("Telefone:" + telefone);
        System.out.println("Nome:" + nome);
        System.out.println("=============");
      }
    public static void main(String [] args){
		Escola c1 = new Escola(1, "Rua General Osório, 241, Cohab", 507, "51987645027", "Santa Terezinha");
		c1.imprimir();
	}
}

