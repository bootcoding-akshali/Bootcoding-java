package oops.inheritance;

import com.bootcoding.java.String.StringExample;

public class Application {
    public static void main(String[] args) {
        StringInstrument instrument = new StringInstrument("ins");
        instrument.pluckString();
        WindInstrument windInstrument = new WindInstrument("wind");
        windInstrument.blow();
        PercussionInstrument percussionInstrument = new PercussionInstrument("Hit");
        percussionInstrument.hit();
    }
}
