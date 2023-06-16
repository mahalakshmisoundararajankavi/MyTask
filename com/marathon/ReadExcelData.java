package com.marathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData extends BaseClass{
    @Test
	public static String[][] readDataExcel() throws IOException {
		 String[][] data;
		    XSSFWorkbook wb = new XSSFWorkbook("./datasaleforce/keyValue02.xlsx");
		        XSSFSheet sheet = wb.getSheetAt(0);
		        int rowNums = sheet.getLastRowNum() + 1;
		        int columnNums = sheet.getRow(0).getLastCellNum();
		        data = new String[rowNums - 1][columnNums];
		        for (int i = 1; i < rowNums; i++) {
		            XSSFRow row = sheet.getRow(i);
		            for (int j = 0; j < columnNums; j++) {
		                String stringCellValue = row.getCell(j).getStringCellValue();
		                data[i - 1][j] = stringCellValue;
		            }
		        }
		    
		    return data;
	}

}
