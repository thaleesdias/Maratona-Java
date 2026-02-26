package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio;

public class Construtor {

    String nome;
    int idade;
    String[] veiculos;

    public void imprime() {
        System.out.println(nome);
        System.out.println(idade);
        if(veiculos != null){
        for(String v: veiculos) {
            System.out.println(v);
        }}}

    public Construtor(String nome, int idade) {
        this(nome ,idade ,null);
    }

    public Construtor(String nome, int idade, String[] veiculos) {

        this.nome = nome;
        this.idade = idade;
        this.veiculos = veiculos;

    }


}
