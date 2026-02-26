package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.domain.Carro;

import java.util.HashMap;
import java.util.Map;

public class Testecarro {

    public static void main(String[] args) {
        Carro c1 = new Carro("jip", 120);
        Carro c2 = new Carro("coroa",132);



        c1.setVelocidadeLimite(300);

        c1.imprime();
        c2.imprime();


    }
}
