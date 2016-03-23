/**
 * Created by viorel.cojocaru on 22.03.2016.
 */
public class Generate {

    public static void main(String[] args) {


        Article article = new Article();
        article.setUnits(105);
        article.setName("matasa");
        article.setCode(105L);
        article.setOneUnitUse(2.21428);
        article.setUnitMeasure(UNIT_MEASURE.SQUARE_METER);

        System.out.println(article.getName());
        System.out.println(article.getCode());
        System.out.println(article.getUnitMeasure().getFullName());
        System.out.println(article.getUnitMeasure().getAbbrName());
        System.out.println(article.getUnits());
        System.out.println(article.getOneUnitUse());
        System.out.println(article.getAllUnitsUse());

    }
}
