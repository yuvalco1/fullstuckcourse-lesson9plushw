public class Doghw extends Animalhw{

    private String DogFood;

    public Doghw(String name, String dogFood) {
        super(name);
        this.DogFood = dogFood;
    }

    public void Bark(){
        System.out.println("Whof Whof");
    }

    @Override
    public String toString() {
        return ( super.toString() + " and my DogFood is: " + DogFood );
    }
}
