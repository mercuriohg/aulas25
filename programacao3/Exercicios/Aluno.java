public class Aluno {
    int id;
    String cpf;
    String matricula;
    String nome;
    String gmail;

    public Aluno(int id, String cpf, String matricula, String nome, String gmail) {
        this.id = id;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nome = nome;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public void imprimir(){
        System.out.println("=============");
        System.out.println("ID:" + id);
        System.out.println("CPF:" + cpf);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Nome:" + nome);
        System.out.println("Gmail:" + gmail);
        System.out.println("=============");
    }
    public static void main(String[] args){
	Aluno c1 = new Aluno(1, "919.283.080-52", "2081", "Pedro", "pedro@gmail.com");
	c1.imprimir();
}
}

