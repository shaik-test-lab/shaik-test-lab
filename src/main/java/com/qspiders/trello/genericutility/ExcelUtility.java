package com.qspiders.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetname,int row,int cellnum) throws Throwable, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resource/trello_testspecificdata_excelfile/Trello_TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
	    String cell_data = workbook.getSheet(sheetname).getRow(row).getCell(cellnum).getStringCellValue();
        workbook.close();
		return cell_data;
}
}