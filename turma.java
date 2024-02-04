import java.util.ArrayList;

public class turma {
    int identificaoDaTurma;
    ArrayList<professor> professoresAssociados = new ArrayList<professor>();
    ArrayList<aluno> alunosAssociados = new ArrayList<aluno>();

    public turma(int identificacaoDaTurma){
        this.setIdentificaoDaTurma(identificacaoDaTurma);
    }
    public int getIdentificaoDaTurma() {
        return identificaoDaTurma;
    }
    public void setIdentificaoDaTurma(int identificaoDaTurma) {
        this.identificaoDaTurma = identificaoDaTurma;
    }

    public void associarAluno (aluno aluno){
        alunosAssociados.add(aluno);
    }

    public void associarProfessorATurma (professor professor){
        professoresAssociados.add(professor);
    }

    @Override
    public String toString() {
        return "Professor"+professoresAssociados +"\nIdentificacao da turma: "+identificaoDaTurma+ "\nLista de Alunos associados: "+alunosAssociados;
    }
}
