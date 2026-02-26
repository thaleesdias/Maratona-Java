package academy.devdojo.maratonajava.javacore.EblocosIniciacao.dominio;

public class Anime {
    public String nome;
    public String protagonista;
    private int episodios;
    public int temporadas;

    public  int[] ep ;

    {
        for(int i = 0 ; i<10; i++){
            System.out.println(i);
        }
    }


    public Anime(String nome,String protagonista, int episodios, int[] ep) {
        this();
        this.nome = nome;
        this.protagonista = protagonista;
        this.episodios = episodios;
        this.ep = ep;
    }

    public Anime(String nome, String protagonista, int episodios, int temporadas, int[]ep) {
        this(nome, protagonista, episodios, ep);
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
