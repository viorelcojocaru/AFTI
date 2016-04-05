package dao;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import valueobjects.Article;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by viorel.cojocaru on 05.04.2016.
 */
public class GenerateAnexesImpl implements GenerateAnexesIntf{
    private static GenerateAnexesImpl instance = new GenerateAnexesImpl();

    public static GenerateAnexesImpl getInstance() {
        if (instance == null) {
            return new GenerateAnexesImpl();
        }
        return instance;
    }

    private GenerateAnexesImpl() {
    }

    @Override
    public void generateAnex(String anexName, List<Article> articles, String path) throws IOException {

        FileInputStream fsIP= new FileInputStream(new File("D:\\Test.xls")); //Read the spreadsheet that needs to be updated   path+"\\"+anexName+".xls"
        HSSFWorkbook wb = new HSSFWorkbook(fsIP); //Access the workbook
        HSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
        HSSFDataFormat df = wb.createDataFormat();
        HSSFCellStyle csNumberFormat = wb.createCellStyle();
        HSSFCellStyle csbt = wb.createCellStyle();

        HSSFCellStyle csbtlm = wb.createCellStyle();
        HSSFCellStyle csbtlbm = wb.createCellStyle();

        HSSFCellStyle csbtrm = wb.createCellStyle();
        HSSFCellStyle csbtrbm = wb.createCellStyle();

        HSSFCellStyle csbtbm = wb.createCellStyle();

        csbt.setBorderBottom(CellStyle.BORDER_THIN);
        csbt.setBorderRight(CellStyle.BORDER_THIN);
        csbt.setBorderLeft(CellStyle.BORDER_THIN);

        csbtlm.setBorderBottom(CellStyle.BORDER_THIN);
        csbtlm.setBorderRight(CellStyle.BORDER_THIN);
        csbtlm.setBorderLeft(CellStyle.BORDER_MEDIUM);

        csbtlbm.setBorderBottom(CellStyle.BORDER_MEDIUM);
        csbtlbm.setBorderRight(CellStyle.BORDER_THIN);
        csbtlbm.setBorderLeft(CellStyle.BORDER_THIN);

        csbtrm.setBorderBottom(CellStyle.BORDER_THIN);
        csbtrm.setBorderRight(CellStyle.BORDER_MEDIUM);
        csbtrm.setBorderLeft(CellStyle.BORDER_THIN);

        csbtrbm.setBorderBottom(CellStyle.BORDER_MEDIUM);
        csbtrbm.setBorderRight(CellStyle.BORDER_MEDIUM);
        csbtrbm.setBorderLeft(CellStyle.BORDER_THIN);

        csbtbm.setBorderBottom(CellStyle.BORDER_MEDIUM);
        csbtbm.setBorderRight(CellStyle.BORDER_THIN);
        csbtbm.setBorderLeft(CellStyle.BORDER_THIN);

        int articleNumbers=articles.size()+8;



        for(short rownum = (short)8; rownum < articleNumbers; rownum++) {

            HSSFRow row = worksheet.createRow(rownum);
            int index=rownum-8;

                HSSFCell cellArticleNumber = row.createCell(0);
                cellArticleNumber.setCellType(Cell.CELL_TYPE_NUMERIC);
                cellArticleNumber.setCellValue(index+1);


                HSSFCell cellArticleName = row.createCell(1);
                cellArticleName.setCellType(Cell.CELL_TYPE_STRING);
                cellArticleName.setCellValue(new HSSFRichTextString(articles.get(index).getName()));


                HSSFCell cellArticleUnits = row.createCell(2);
                if(index==8){

                    cellArticleUnits.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cellArticleUnits.setCellValue(articles.get(0).getUnits());
                }

                HSSFCell cellArticleUnitMeasure = row.createCell(3);
                cellArticleUnitMeasure.setCellType(Cell.CELL_TYPE_STRING);
                cellArticleUnitMeasure.setCellValue(new HSSFRichTextString(articles.get(index).getUnitMeasure().getAbbrName()));

                HSSFCell cellArticleOneUnit = row.createCell(4);
                csNumberFormat.setDataFormat(df.getFormat("#,##0.0"));
                cellArticleOneUnit.setCellStyle(csNumberFormat);
                cellArticleOneUnit.setCellType(Cell.CELL_TYPE_NUMERIC);
                cellArticleOneUnit.setCellValue(articles.get(index).getOneUnitUse());

                HSSFCell cellArticleAllUnits = row.createCell(5);
                cellArticleAllUnits.setCellType(Cell.CELL_TYPE_NUMERIC);
                cellArticleAllUnits.setCellValue(articles.get(index).getAllUnitsUse());

                HSSFCell cellEmpty = row.createCell(6);


            if (index < articles.size()-1) {
                cellArticleNumber.setCellStyle(csbtlm);
                cellArticleName.setCellStyle(csbt);
                cellArticleUnits.setCellStyle(csbt);
                cellArticleUnitMeasure.setCellStyle(csbt);
                cellArticleOneUnit.setCellStyle(csbt);
                cellArticleAllUnits.setCellStyle(csbt);
                cellEmpty.setCellStyle(csbtrm);
            }else {
                cellArticleNumber.setCellStyle(csbtlbm);
                cellArticleName.setCellStyle(csbtbm);
                cellArticleUnits.setCellStyle(csbtbm);
                cellArticleUnitMeasure.setCellStyle(csbtbm);
                cellArticleOneUnit.setCellStyle(csbtbm);
                cellArticleAllUnits.setCellStyle(csbtbm);
                cellEmpty.setCellStyle(csbtrbm);
            }
        }


        fsIP.close(); //Close the InputStream
        FileOutputStream output_file =new FileOutputStream(new File(path+"\\"+anexName+".xls"));  //Open FileOutputStream to write updates
        wb.write(output_file); //write changes
        output_file.close();  //close the stream

        //Read more: http://www.techartifact.com/blogs/2013/10/update-or-edit-existing-excel-files-in-java-using-apache-poi.html#ixzz44wLSm5pB

    }

    @Override
    public void generateGlobalAnex(String anexName, Map<String, List<Article>> anexMap, String path) {

    }
}
