package oops.inheritance;

public class PercussionInstrument extends MusicalInstrument{
    private int numDrums;

    public PercussionInstrument(String name) {
        super(name, "Percussion");
        this.numDrums = 0;
    }
    public void hit() {
        System.out.println(this.name + " is making a hitting sound.");
    }
}
