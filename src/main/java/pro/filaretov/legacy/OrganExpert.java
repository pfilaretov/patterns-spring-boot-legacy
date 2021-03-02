package pro.filaretov.legacy;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Expert in organ's repair and adjustment.
 */
@Singleton
public class OrganExpert {

    @Inject
    private PipeExpert pipeExpert;

    public void repair(Organ organ) {
        pipeExpert.diagnose(organ);
        System.out.println("Organ " + organ.getName() + " repaired");
    }

}
