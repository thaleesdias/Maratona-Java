package academy.devdojo.maratonajava.javacore.exer.domain;

public class Aluno {
    private int idade;
    private String nome;
    private Seminario seminario;

    public Aluno(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(nome);
        System.out.println(idade);
        if (seminario == null) return;
        System.out.println(seminario.getTitulo());
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
