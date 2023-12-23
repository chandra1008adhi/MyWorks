package exceldata;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wkbk = new XSSFWorkbook();
		XSSFSheet sheet=wkbk.createSheet("emp data");
		Object [][] empdata = {{"empid","name","job"},{101,"david","engineer"},{102,"smith","manager"},{103,"scott","analyst"}};
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		for(int r=0;r<rows;r++) {
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filepath ="../newseleniumproj/src/test/java/DataFiles/empdata.xlsx";
		FileOutputStream outputstream = new FileOutputStream(filepath);
		wkbk.write(outputstream);
		outputstream.close();
	}

}