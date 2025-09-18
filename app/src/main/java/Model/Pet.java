package Model;

public class Pet {

    private String name;
    private String breed;
    private int age;
    public Pet(String n, String b, int a){
        name = n;
        breed = b;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
