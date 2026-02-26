package academy.devdojo.maratonajava.javacore.Gassosciacao.test;

import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Jogador;

public class JogadorTest01 {


    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("tha");
        Jogador jogador2 = new Jogador("les");
        Jogador jogador3 = new Jogador("mat");


        Jogador[] jogadores = {jogador1, jogador2,jogador3};

        System.out.println( jogadores);

     for(Jogador jogador : jogadores ){
         jogador.imprime();
     }

     jogadores[1].imprime();


    }
}
