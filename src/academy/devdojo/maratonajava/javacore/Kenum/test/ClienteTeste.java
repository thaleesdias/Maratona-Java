package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClienteEnum;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste {

    public static void main(String[] args) {
        // sem enum
        Cliente cliente1 = new Cliente("barboza","maca");
        Cliente cliente2 = new Cliente("ofic", "PESSOA_JURIDICA");

        // com enum

        ClienteEnum cliente3 = new ClienteEnum("tha", TipoCliente.PESSOA_FISICA);
        ClienteEnum cliente4 = new ClienteEnum("sa", TipoCliente.PESSOA_FISICA);


        System.out.println( cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());
        System.out.println(cliente4.toString());
    }

}
