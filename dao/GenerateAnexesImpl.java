package dao;

import valueobjects.Article;

import java.util.List;
import java.util.Map;

/**
 * Created by viorel.cojocaru on 05.04.2016.
 */
public class GenerateAnexesImpl implements GenerateAnexesIntf{
    private static GenerateAnexesImpl instance = new GenerateAnexesImpl();

    public static GenerateAnexesImpl getInstance() {
        return instance;
    }

    private GenerateAnexesImpl() {
    }

    @Override
    public void generateAnex(String anexName, List<Article> articles) {

    }

    @Override
    public void generateGlobalAnex(String anexName, Map<String, List<Article>> anexMap) {

    }
}
