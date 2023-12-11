public class Poodle extends Doghw{

    private String numberOfPonyTails;


    public Poodle(String name, String dogFood, String numberOfPonyTails) {
        super(name, dogFood);
        this.numberOfPonyTails = numberOfPonyTails;
    }


    @Override
    public void Bark(){
        System.out.println("Wf Wf");
    }

    @Override
    public String toString() {
        return ( super.toString() +  " and my numberOfPonyTails is:" + numberOfPonyTails);
    }
}
