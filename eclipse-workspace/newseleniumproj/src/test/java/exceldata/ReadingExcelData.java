package exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {
		String excelfilepath="../newseleniumproj/src/test/java/DataFiles/countries.xlsx";
		FileInputStream inputstream=new FileInputStream(excelfilepath);
		
		XSSFWorkbook wkbk = new XSSFWorkbook(inputstream);
		XSSFSheet sheet =wkbk.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		System.out.println("rows "+rows+"cols "+cols);
		for(int r=0;r<rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue()+"     "); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()+"     ");break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()+"     ");break;
				}
			}
			System.out.println();
		}

	}

}
