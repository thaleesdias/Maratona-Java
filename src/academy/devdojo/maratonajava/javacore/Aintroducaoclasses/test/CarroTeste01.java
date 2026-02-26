package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 1966;
        carro1.modelo = "carro1";
        carro1.nome = "fuscao";

        carro2.nome = "mavekao";
        carro2.ano = 1988;
        carro2.modelo = "turbo";

        System.out.println(carro2.nome + " " + carro1.nome + " " + carro1.ano);
    }
}
