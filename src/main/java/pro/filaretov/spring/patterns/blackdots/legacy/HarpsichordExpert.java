package pro.filaretov.spring.patterns.blackdots.legacy;

import javax.inject.Singleton;

/**
 * Expert in harpsichord's repair.
 */
@Singleton
public class HarpsichordExpert implements InstrumentExpert {

    @Override
    public void adjust(Instrument instrument) {
        System.out.println("Harpsichord (or actually " + instrument.getType() + ") adjusted");
    }

}
