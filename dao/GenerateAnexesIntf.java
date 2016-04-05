package dao;

import valueobjects.Article;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by viorel.cojocaru on 05.04.2016.
 */
public interface GenerateAnexesIntf {
    public void generateAnex(String anexName, List<Article> articles, String path) throws IOException;
    public void generateGlobalAnex(String anexName ,Map<String,List<Article>> anexMap, String path);
}
