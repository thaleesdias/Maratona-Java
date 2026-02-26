package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {

    public static void main(String[] args) {
    Anime anime = new Anime("naruto", "nartuo", 13 );
    Anime anime2 = new Anime("one", "lupi", 13, 678 );

    anime.imprime();
    anime2.imprime();
    }
}
