package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco  = new Endereco("das nation", "900990-21");
        Pessoa pessoa = new Pessoa("barroco");


        pessoa.setCpf("9021931-21");

        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("vaca", 120.12d);


        funcionario.setCpf("892182=2");


        funcionario.imprime();


    }
}
