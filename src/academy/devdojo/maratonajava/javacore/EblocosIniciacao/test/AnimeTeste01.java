package academy.devdojo.maratonajava.javacore.EblocosIniciacao.test;

import academy.devdojo.maratonajava.javacore.EblocosIniciacao.dominio.Anime;

public class AnimeTeste01 {


    public static void main(String[] args) {
        Anime anime = new Anime("ludi", "seise", 12, new int[]{1, 2, 2, 23, 4});

        System.out.println(anime.ep.length);
        anime.imprime();
        for (int sanime : anime.ep) {
            System.out.println(sanime);
        }

    }

}
