package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Sobrecarga;

public class TesteCarga {
    public static void main(String[] args) {
    Sobrecarga teste = new Sobrecarga("thales", 17, "alohomora" );
  Sobrecarga teste2 = new Sobrecarga("jorg", 43, "crus");


    teste.imprime();
    teste2.imprime();

    }


}
