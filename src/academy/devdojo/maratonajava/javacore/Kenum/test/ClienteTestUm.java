package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTestUm {

    private String nome;
    private int idade;
    public TipoPagamaneto tipoPagamaneto;


    public enum TipoPagamaneto {
        DEBITO(1), CREDITO(2);

        private final int valor;

        TipoPagamaneto(int valor) {
            this.valor = valor;

        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoPagamaneto getTipoPagamaneto() {
        return tipoPagamaneto;
    }

    public void setTipoPagamaneto(TipoPagamaneto tipoPagamaneto) {
        this.tipoPagamaneto = tipoPagamaneto;
    }

    @Override
    public String toString() {
        return "ClienteTestUm{" + "nome='" + nome + '\'' + ", idade=" + idade + ", tipoPagamaneto=" + tipoPagamaneto + ", tipoPagamaneto=" + tipoPagamaneto.valor + '}';
    }

    public static void main(String[] args) {

        ClienteTestUm cliente = new ClienteTestUm();
        ClienteTestUm cliente2 = new ClienteTestUm();

        cliente.idade = 213;
        cliente.nome = "thales";
        cliente2.idade = 43;
        cliente2.nome = "fadz";

        cliente.tipoPagamaneto = TipoPagamaneto.DEBITO;
        cliente2.tipoPagamaneto = TipoPagamaneto.CREDITO;
        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());


    }
}
