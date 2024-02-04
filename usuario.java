public abstract class usuario {
    protected String nome;
    protected int idade;

    protected void setIdade(int idade) {
        this.idade = idade;
    }
    protected int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
