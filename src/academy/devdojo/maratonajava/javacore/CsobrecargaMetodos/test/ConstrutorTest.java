package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Construtor;

public class ConstrutorTest {

    public static void main(String[] args) {
        Construtor teste = new Construtor("tah", 89, new String[]{"fuca", "juca", "puka"});
        Construtor teste2 = new Construtor("tah", 89);

        teste.imprime();
        teste2.imprime();
    }
}
