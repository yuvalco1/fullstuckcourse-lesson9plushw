//Create a class called Person that implements the Comparable interface and defines the compareTo() method to compare two people based on their age.


public class Person implements Comparable {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void compareTo() {
        System.out.println("Comparing two people based on their age");
    }


    @Override
    public void compareTo(String name, int age) {
        if (this.name == name && this.age == age) {
            System.out.println("The two people are the same");
        }
    }
}
