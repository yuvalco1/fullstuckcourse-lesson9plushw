package Zoo;

public class Dog extends Animal{

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void animalSound() {
        System.out.println("Woof Woof");

    }
}
