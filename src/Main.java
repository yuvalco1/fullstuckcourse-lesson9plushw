import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee carl = new Employee("Carl Cracker", 75000, 1987,12,15);
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Employee tony = new Employee("Tony Tester", 40000, 1990, 3, 15);
        Manager yuval = new Manager("Yuval", 100000, 1995, 1,1,10000);
        yuval.setBonus(15000);

        carl.raiseSalary(5);
        harry.raiseSalary(5);
        tony.raiseSalary(5);

        carl.showInfo();
        harry.showInfo();
        tony.showInfo();
        yuval.showInfo();

        System.out.println(carl);
        System.out.println(yuval);

        System.out.println(carl.getSalary());
        System.out.println(yuval.getSalary());


        Animal animal1 = new Dog(3, "Buddy");
        Animal animal2 = new Cat(5, "Kitty");
        Animal animal3 = new Dog(7, "Bobby");

        Animal [] animals = {animal1, animal2, animal3};

        for (Animal animal : animals) {
            animal.animalSound();
        }

//      HW Abstract - Define an abstract class called Shape. This class should have two abstract methods: area() and perimeter(). These methods should not have a body and should be declared as public.
//      Create a subclass of Shape called Circle. This class should have a constructor that takes a radius as a parameter. It should also implement the area() and perimeter() methods, which should return the area and perimeter of the circle, respectively.
//      Create another subclass of Shape called Rectangle. This class should have a constructor that takes the length and width of the rectangle as parameters. It should also implement the area() and perimeter() methods, which should return the area and perimeter of the rectangle, respectively.
//      Create a Main class that instantiates objects of both Circle and Rectangle. It should call the area() and perimeter() methods on each object and print out the results.

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(3,4);

        for (Shape s: shapes) {
            System.out.println(s.area());
            System.out.println(s.perimeter());
        }

        Doghw dog1 = new Doghw("Kip", "PorinaOne");
        Wolf wolf1 = new Wolf("Wolfy", "fish", "TheWolfs");
        Poodle pood1 = new Poodle("podalito", "Salmon", "three");

        System.out.println(dog1);
        System.out.println(wolf1);
        System.out.println(pood1);



    }
}