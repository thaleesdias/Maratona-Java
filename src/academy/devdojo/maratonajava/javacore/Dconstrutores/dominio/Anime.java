package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    public String nome;
    public String protagonista;
    public int episodios;
    public int temporadas;

    public Anime(String nome, String protagonista, int episodios) {
       this();
        this.nome = nome;
        this.protagonista = protagonista;
        this.episodios = episodios;

    }

    public Anime(String nome, String protagonista, int episodios, int temporadas) {
        this(nome, protagonista, episodios);
        this.temporadas = temporadas;
    }

    public Anime (){

        System.out.println("sasasasasaa");
    }

    public void imprime() {
        if(this.temporadas == 0) {
            System.out.println(nome + "\n" + protagonista + "\n" + episodios+ "\n" + "temporada para caralho irmanp" );
        }else {
            System.out.println(nome + "\n" + protagonista + "\n" + episodios+ "\n" + temporadas );

        }
    }
}
