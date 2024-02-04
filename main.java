import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        aluno a1 = new aluno("adriano", 20, 01);
        aluno a2 = new aluno("alfredo", 20, 01);
        aluno a3 = new aluno("herinque", 20, 01);
        aluno a4 = new aluno("fernando", 20, 01);
        aluno a5 = new aluno("cristina", 20, 01);
        
        professor p1 = new professor("Albertino", 70, 0);

        escola e1 = new escola();
        turma t1 = new turma(1);
        e1.associarProfessorATurma(t1, p1);
        e1.associarAlunosATurma(t1, a5);
        e1.associarAlunosATurma(t1, a4);
        e1.associarAlunosATurma(t1, a2);
        e1.associarAlunosATurma(t1, a3);

        e1.associarAlunosATurma(t1, a1);

        System.out.println(t1);

        

        e1.matricularAluno(a1);
        e1.matricularAluno(a2);
        e1.matricularAluno(a3);
        e1.matricularAluno(a4);
        e1.matricularAluno(a5);

         
    }
}
