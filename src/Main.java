import Zoo.*;
import office.Employee;
import office.Manager;
import shapes.*;

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

//      HW Abstract - Define an abstract class called shapes.Shape. This class should have two abstract methods: area() and perimeter(). These methods should not have a body and should be declared as public.
//      Create a subclass of shapes.Shape called shapes.Circle. This class should have a constructor that takes a radius as a parameter. It should also implement the area() and perimeter() methods, which should return the area and perimeter of the circle, respectively.
//      Create another subclass of shapes.Shape called shapes.Rectangle. This class should have a constructor that takes the length and width of the rectangle as parameters. It should also implement the area() and perimeter() methods, which should return the area and perimeter of the rectangle, respectively.
//      Create a Main class that instantiates objects of both shapes.Circle and shapes.Rectangle. It should call the area() and perimeter() methods on each object and print out the results.

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


        Shape2[] figures = new Shape2[3];
        Shape2 square1 = new Square(5);
        Shape2 circle1 = new Circle2(5);
        Shape2 triangle1 = new Triangle(5,5,5);

        figures[0] = square1;
        figures[1] = circle1;
        figures[2] = triangle1;

        for(Shape2 f:figures){
            System.out.println("Area of "+f.getClass()+" is: "+f.getArea());
            System.out.println("Perimeter of "+f.getClass()+" is: "+f.getPerimeter());
        }

//        Define an interface named Playable that includes a method called play(). Create a class called Guitar that implements the Playable interface and defines the play() method to print "strumming the guitar".
//        Define an interface named Drawable that includes a method called draw(). Create a class called Rectangle that implements the Drawable interface and defines the draw() method to print "drawing a rectangle".
//        Define an interface named Movable that includes methods called moveUp(), moveDown(), moveLeft(), and moveRight(). Create a class called Ball that implements the Movable interface and defines the methods to print the direction of movement (e.g., "moving up").
//        Define an interface named Resizable that includes a method called resize(). Create a class called Circle that implements the Resizable interface and defines the resize() method to increase the size of the circle.
//        Define an interface named Comparable that includes a method called compareTo(). Create a class called Person that implements the Comparable interface and defines the compareTo() method to compare two people based on their age.

    }
}