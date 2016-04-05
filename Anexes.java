import java.util.List;
import java.util.Map;

/**
 * Created by viorel.cojocaru on 23.03.2016.
 */
public class Anexes {
  // private List<Article> articles;
   private Map<String,List<Article> > anexNameMap;

    public Map<String, List<Article>> getAnexNameMap() {
        return anexNameMap;
    }

    public void setAnexNameMap(Map<String, List<Article>> anexNameMap) {
        this.anexNameMap = anexNameMap;
    }
}
