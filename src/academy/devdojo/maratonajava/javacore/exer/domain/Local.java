package academy.devdojo.maratonajava.javacore.exer.domain;

import java.util.Scanner;

public class Local {
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void imprime() {
        System.out.println(this.endereco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
