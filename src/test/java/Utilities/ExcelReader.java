package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public ExcelReader() {
	
	try
	{
		//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resource/TestData.xls");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resource/TestData.xlsx");
        workbook=new XSSFWorkbook(fis);
        sheet=workbook.getSheet("LoginData");
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public String getData(int row, int column)
	
	{
		return sheet.getRow(row).getCell(column).toString();
		
	}

}
