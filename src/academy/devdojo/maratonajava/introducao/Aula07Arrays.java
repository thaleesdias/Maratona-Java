package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        String [] nomes = new String[2];

        nomes[0] = "tha";
        nomes[1] = "bao";

        int [ ] num = new int[3];
        int [ ] num2 = {1,2,3,4,5};
        int [ ] num3 = new int[]{1,2,3,4,5};

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);


        //for each
        for(int i : num3){
            System.out.println(i);
        }

        //System.out.println(nomes[1]);

       // nomes = new String[2];
        //System.out.println(nomes[1]);
    }
}
