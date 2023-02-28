package oops.inheritance;

public class StringInstrument extends MusicalInstrument {
    private int numStrings;

    public StringInstrument(String name) {
        super(name, "String");
        this.numStrings = 0;
    }
    public void pluckString() {
        System.out.println(this.name + " is making a plucking sound.");
    }
}
