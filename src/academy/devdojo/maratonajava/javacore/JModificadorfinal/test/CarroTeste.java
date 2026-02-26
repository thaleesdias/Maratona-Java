package academy.devdojo.maratonajava.javacore.JModificadorfinal.test;

import academy.devdojo.maratonajava.javacore.JModificadorfinal.dominio.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.getNome();
        carro1.setNome("2121");
        carro1.getNome();

        carro1.getVelocidade();

    }
}
