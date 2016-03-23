/**
 * Created by viorel.cojocaru on 23.03.2016.
 */
public enum UNIT_MEASURE {
    LINIAR_METER("metri","m.l"),
    SQUARE_METER("metri2","m.2"),
    UNIT("bucati","buc");

    private final String full;
    private final String abbr;

    private UNIT_MEASURE(String full, String abbr) {
        this.full = full;
        this.abbr = abbr;
    }

    public String getFullName() {
        return full;
    }

    public String getAbbrName() {
        return abbr;
    }
}
