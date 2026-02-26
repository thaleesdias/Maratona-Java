package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio;

public class Sobrecarga {

    private String nome;
    private int idade;
    private String feitico;

    public void imprime() {
        System.out.println("nome " + nome + "\n");
        System.out.println("idade " + idade + "\n");
        if (this.feitico != null) {
            System.out.println("nome " + feitico + " \n");
        }
    }




    public void init(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Sobrecarga(String nome, int idade, String feitico) {
        this.init(nome, idade);
        this.feitico = feitico;
    }

}
