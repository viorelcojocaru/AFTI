package valueobjects;

import java.util.List;
import java.util.Map;

/**
 * Created by viorel.cojocaru on 05.04.2016.
 */
public class Anexs {
    private Map<String,List<Article>> anexNameMap;

    public Map<String, List<Article>> getAnexNameMap() {
        return anexNameMap;
    }

    public void setAnexNameMap(Map<String, List<Article>> anexNameMap) {
        this.anexNameMap = anexNameMap;
    }
}
