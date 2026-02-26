package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String Nome ;
    private String Tipo ;

    public final static String PESSOA_FISICA = "PESSOA_FISICA";
    public final static String PESSOA_JURIDICA = "PESSOA_JURIDICA";


    public Cliente(String nome, String tipo) {
     if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){
         return;
     }
        Nome = nome;
        Tipo = tipo;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

}
