package pro.filaretov.spring.patterns.blackdots.legacy;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Expert in organ's repair and adjustment.
 */
@Singleton
public class OrganExpert implements InstrumentExpert {

    @Inject
    private PipeExpert pipeExpert;

    @Override
    public void adjust(Instrument instrument) {
        pipeExpert.diagnose(instrument);
        System.out.println("Organ (or actually " + instrument.getType() + ") adjusted");
    }

}
