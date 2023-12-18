//Create a class called Circle3 that implements the Resizable interface and defines the resize() method to increase the size of the circle.

public class Circle3 implements Resizable{

    @Override
    public void resize(int percent) {
        System.out.println("increasing the size of the circle by " + percent + "%");
    }
}
