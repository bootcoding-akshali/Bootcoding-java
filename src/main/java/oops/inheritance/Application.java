package oops.inheritance;

import com.bootcoding.java.String.StringExample;

public class Application {
    public static void main(String[] args) {
        StringInstrument instrument = new StringInstrument("The harp");
        instrument.play();
        instrument.songs();
        instrument.pluckString();
        WindInstrument windInstrument = new WindInstrument("birds");
        windInstrument.blow();
        PercussionInstrument percussionInstrument = new PercussionInstrument("thud");
        percussionInstrument.hit();

    }
}
