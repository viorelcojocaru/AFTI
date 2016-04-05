package dao;

import valueobjects.Article;

import java.util.List;
import java.util.Map;

/**
 * Created by viorel.cojocaru on 05.04.2016.
 */
public interface GenerateAnexesIntf {
    public void generateAnex(String anexName, List<Article> articles);
    public void generateGlobalAnex(String anexName ,Map<String,List<Article>> anexMap);
}
