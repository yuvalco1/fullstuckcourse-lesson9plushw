//Create a class called Ball that implements the Movable interface and defines the methods to print the direction of movement (e.g., "moving up").


public class Ball implements Movable{
    @Override
    public void moveUp() {
        System.out.println("moving up");

    }

    @Override
    public void moveDown() {
        System.out.println("moving down");


    }

    @Override
    public void moveLeft() {
        System.out.println("moving left");

    }

    @Override
    public void moveRight() {
        System.out.println("moving right");

    }
}
