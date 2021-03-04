package pro.filaretov.spring.patterns.blackdots.legacy;

import javax.inject.Singleton;

/**
 * Expert in pipes.
 */
@Singleton
public class PipeExpert {

    public void diagnose(Instrument instrument) {
        System.out.println(instrument.getType() + " is diagnosed, nothing fancy");
    }
}
