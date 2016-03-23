/**
 * Created by viorel.cojocaru on 23.03.2016.
 */
public class Article {
  private Long code;
  private String name;
  private int units;
  private double oneUnitUse;
  private double allUnitsUse;
  private UNIT_MEASURE unitMeasure;


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }

  public double getOneUnitUse() {
    return oneUnitUse;
  }

  public void setOneUnitUse(double oneUnitUse) {
    this.oneUnitUse = oneUnitUse;
  }

  public double getAllUnitsUse() {
    return getOneUnitUse()*getUnits();
  }

  public UNIT_MEASURE getUnitMeasure() {
    return unitMeasure;
  }

  public void setUnitMeasure(UNIT_MEASURE unitMeasure) {
    this.unitMeasure = unitMeasure;
  }
}
