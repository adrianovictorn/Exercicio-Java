import java.util.ArrayList;


public class escola {
    public boolean associado;
    private ArrayList<aluno> alunosMatriculados = new ArrayList<aluno>();
    private ArrayList<professor> professoresCadastrados = new ArrayList<professor>();
    private ArrayList<turma> turmasCadastradas = new ArrayList<turma>();


    public void matricularAluno(aluno aluno){
        alunosMatriculados.add(aluno);
    }

    public void cadastrarProfessor(professor professor){
        professoresCadastrados.add(professor);
    }

    public void cadastrarTurmas (turma turma){
        turmasCadastradas.add(turma);
    }

    public void associarProfessorATurma(turma turma, professor professor){
      turma.associarProfessorATurma(professor);
      professor.vincularProfessorATurma(turma);
    }

    public void associarAlunosATurma (turma turma, aluno aluno){
        turma.associarAluno(aluno);
    }

    public void listaDeVinculos(professor professor){
        for (turma i : professor.listaDeProfessoresPorTurmas)) {
            System.out.println(i.professoresAssociados);
        }

    }
    
    public void qtdAlunosMatriculados(){
        System.out.println("Lista de Alunos Matriculados");
        for(aluno i : alunosMatriculados){
            System.out.println("Nome:"+i.getNome());
        }
    }
}
