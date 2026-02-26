package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class ClienteEnum {

    private String Nome ;
    private TipoCliente tipoCliente;

    @Override
    public String toString() {
        return "ClienteEnum{" +
                "Nome='" + Nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public ClienteEnum(String nome, TipoCliente tipoCliente) {
        Nome = nome;
        this.tipoCliente = tipoCliente;

    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


}
