
public class aluno extends usuario {
    public int identificaoAluno;
    public aluno(String nome, int idade, int identificacao){
        this.setIdentificaoAluno(identificacao);
        this.nome=nome;
        this.idade=idade;
    }

    public int getIdentificaoAluno() {
        return identificaoAluno;
    }

    public void setIdentificaoAluno(int identificaoAluno) {
        this.identificaoAluno = identificaoAluno;
    }

   

    @Override
    public String toString() {
        return "Nome: "+this.nome;
    }
}
