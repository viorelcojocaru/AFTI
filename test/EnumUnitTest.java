package test;

import constants.UNIT_MEASURE;
import dao.GenerateAnexesImpl;
import dao.GenerateAnexesIntf;
//import org.junit.Test;
import valueobjects.Article;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by viorel.cojocaru on 05.04.2016.
 */
public class EnumUnitTest {





//    @Test
    public void should() {
        List<Article> articles=new ArrayList<Article>();

        Article article1=new Article();
        article1.setUnitMeasure(UNIT_MEASURE.LINIAR_METER);
        article1.setOneUnitUse(0.18);
        article1.setName("Articole de pasmanterie");
        article1.setUnits(200);
        article1.setCode(30005163L);
        articles.add(article1);

        Article article2=new Article();
        article2.setUnitMeasure(UNIT_MEASURE.UNIT);
        article2.setOneUnitUse(3);
        article2.setName("Etichete din materiale textile");
        article2.setUnits(200);
        article2.setCode(30005610L);
        articles.add(article2);

        Article article3=new Article();
        article3.setUnitMeasure(UNIT_MEASURE.SQUARE_METER);
        article3.setOneUnitUse(2.16727);
        article3.setName("Tesaturi din  bumbac vopsite");
        article3.setUnits(200);
        article3.setCode(30505610L);
        articles.add(article3);

        GenerateAnexesIntf inter= GenerateAnexesImpl.getInstance();

        try {

            inter.generateAnex("Camasa",articles,"D:");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
