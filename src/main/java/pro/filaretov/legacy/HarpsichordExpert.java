package pro.filaretov.legacy;

import javax.inject.Singleton;

/**
 * Expert in harpsichord's repair.
 */
@Singleton
public class HarpsichordExpert {

    public void repair(Harpsichord harpsichord) {
        System.out.println("Harpsichord " + harpsichord.getName() + " repaired");
    }

}
