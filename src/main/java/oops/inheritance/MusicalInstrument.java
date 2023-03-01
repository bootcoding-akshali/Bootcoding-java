package oops.inheritance;

public class MusicalInstrument {
    protected String name;
    protected String category;

    public MusicalInstrument(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public void songs(){
        System.out.println("Which song do u want to listen");
    }

    public void play() {
        // Placeholder method for playing the instrument
        System.out.println("Playing different types of songs");
    }
}
