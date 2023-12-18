package Zoo;

public class Horse extends Animalhw{

    private boolean racingHorse;

    public Horse(String name, boolean racingHorse) {
        super(name);
        this.racingHorse = racingHorse;
    }

    public void Neigh(){
        System.out.println("Zoo.Horse Neigh");
    }

    @Override
    public String toString() {
        return ( super.toString() + " and I am a racing horse=" + racingHorse);
    }
}
