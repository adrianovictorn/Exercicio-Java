import java.util.ArrayList;

public class professor extends usuario {
    private int identificaoProfessor;
    ArrayList<turma> listaDeProfessoresPorTurmas = new ArrayList<turma>();

    public professor (String nome, int idade, int identificaoProfessor){
        this.setIdade(idade);
        this.setNome(nome);
    }
    public void setIdentificaoProfessor(int identificaoProfessor) {
        this.identificaoProfessor = identificaoProfessor;
    }

    public void vincularProfessorATurma(turma turma){
        listaDeProfessoresPorTurmas.add(turma);
    }
    public int getIdentificaoProfessor() {
        return identificaoProfessor;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    protected int getIdade() {
        return super.getIdade();
    }

    public String MinistrarAula(){
        return getNome();
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" | "+"Identificacao:"+getIdentificaoProfessor()+"\nTurmas que ministra";
    }
}
