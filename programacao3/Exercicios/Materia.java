public class Materia {
    int id;
    String nome;
    String turno;
    int cargaHoraria;
    String professor;

    public Materia(int id, String nome, String turno, int cargaHoraria, String professor) {
        this.id = id;
        this.nome = nome;
        this.turno = turno;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public void imprimir(){
        System.out.println("=============");
        System.out.println("ID:" + id);
        System.out.println("Nome:" + nome);
        System.out.println("Turno:" + turno);
        System.out.println("Carga Horária:" + cargaHoraria);
        System.out.println("Professor:" + professor);
        System.out.println("=============");
        
    }
    public static void main(String[] args){
        Materia c1 = new Materia(1, "História" , "Manhã" , 40 ,"Augusto");
        
        c1.imprimir();
    }
}
