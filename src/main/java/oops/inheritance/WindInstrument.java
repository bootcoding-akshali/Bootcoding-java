package oops.inheritance;

public class WindInstrument extends MusicalInstrument{
    private boolean isReed;

    public WindInstrument(String name) {
        super(name, "Wind");
        this.isReed = false;
    }
    public void blow() {
        System.out.println(this.name + " is making a blowing sound.");
    }
}
