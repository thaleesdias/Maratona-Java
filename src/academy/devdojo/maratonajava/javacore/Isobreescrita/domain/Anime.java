package academy.devdojo.maratonajava.javacore.Isobreescrita.domain;

public class Anime {

    private String nome;

    @Override
    public String toString(){
        return "anime:" + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
