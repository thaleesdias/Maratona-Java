package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(cpf);
        if(this.endereco == null) return;
        System.out.println(endereco.getCep()+ " " + endereco.getRua());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
