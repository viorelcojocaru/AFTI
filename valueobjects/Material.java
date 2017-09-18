/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueobjects;

import constants.UNIT_MEASURE;

/**
 *
 * @author Olga
 */
public class Material {
    private String nume;
    private long codeMd;
    private long codeIt;
    private UNIT_MEASURE unit;

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the codeMd
     */
    public long getCodeMd() {
        return codeMd;
    }

    /**
     * @param codeMd the codeMd to set
     */
    public void setCodeMd(long codeMd) {
        this.codeMd = codeMd;
    }

    /**
     * @return the codeIt
     */
    public long getCodeIt() {
        return codeIt;
    }

    /**
     * @param codeIt the codeIt to set
     */
    public void setCodeIt(long codeIt) {
        this.codeIt = codeIt;
    }

    /**
     * @return the unit
     */
    public UNIT_MEASURE getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(UNIT_MEASURE unit) {
        this.unit = unit;
    }
    
}
