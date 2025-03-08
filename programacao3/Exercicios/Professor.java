 public class Professor {
        int id;
        String nome;
        String materia;
        String formacao;
        String gmail;

        public Professor(int id, String nome, String materia, String formacao, String gmail) {
            this.id = id;
            this.nome = nome;
            this.materia = materia;
            this.formacao = formacao;
            this.gmail = gmail;
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

        public String getMateria() {
            return materia;
        }

        public void setMateria(String materia) {
            this.materia = materia;
        }

        public String getFormacao() {
            return formacao;
        }

        public void setFormacao(String formacao) {
            this.formacao = formacao;
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
        System.out.println("Nome:" + nome);
        System.out.println("Matéria:" + materia);
        System.out.println("Formação:" + formacao);
        System.out.println("Gmail:" + gmail);
        System.out.println("=============");
    }
    public static void main(String [] args){
		Professor c1 = new Professor(1, "Augusto", "História", "Doutorado", "augusto@gmail.com");
		c1.imprimir();
	}
}

