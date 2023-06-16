package com.marathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheetTestCase01 extends BaseClass {
@Test(alwaysRun = true)
public static String[][] readExcel() throws IOException {
    String[][] data;
    XSSFWorkbook wb = new XSSFWorkbook("./datasaleforce/keyValue01.xlsx");
        XSSFSheet sheet = wb.getSheetAt(0);
        int rowNum = sheet.getLastRowNum() + 1;
        int columnNum = sheet.getRow(0).getLastCellNum();
        data = new String[rowNum - 1][columnNum];
        for (int i = 1; i < rowNum; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < columnNum; j++) {
                String stringCellValue = row.getCell(j).getStringCellValue();
                data[i - 1][j] = stringCellValue;
            }
        }
    
    return data;
}
}
