package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class EstudyThis {
    private String name;
    public int age;
    private String color;

    public String getName() {

        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void getColor() {

        System.out.println(this.color);
    }


    public int getAge() {
        System.out.println(age);
        return age;
    }

    public int SomaUm() {
        return this.age++;
    }
}
