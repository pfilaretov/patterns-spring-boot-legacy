package pro.filaretov.spring.patterns.blackdots.legacy;

/**
 * Instrument.
 */
public class Instrument {

    private String type;

    public Instrument() {
    }

    public Instrument(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
