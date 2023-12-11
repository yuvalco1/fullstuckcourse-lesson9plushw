public class Cat extends Animal{

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void animalSound() {
        System.out.println("Meow Meow");

    }
}
