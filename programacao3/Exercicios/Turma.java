public class Turma {
    int id;
    int quantAlunos;
    String regente;
    int numeroSala;
    String gmail;

    public Turma(int id, int quantAlunos, String regente, int numeroSala, String gmail) {
        this.id = id;
        this.quantAlunos = quantAlunos;
        this.regente = regente;
        this.numeroSala = numeroSala;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public String getRegente() {
        return regente;
    }

    public void setRegente(String regente) {
        this.regente = regente;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
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
        System.out.println("Quant. Alunos:" + quantAlunos);
        System.out.println("Regente:" + regente);
        System.out.println("Num. Sala:" + numeroSala);
        System.out.println("Gmail:" + gmail);
        System.out.println("=============");
    }
    public static void main(String [] args){
	   Turma c1 = new Turma(1, 27, "Augusto", 212, "turma212@hmail.com");
	   c1.imprimir();	
	}
}

