package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {

	public static String getDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws IOException {
		String path = "C:\\Users\\Admin\\Desktop\\EcelDemoFile\\Book1.xlsx";
		
		String result;
		FileInputStream file = new FileInputStream(path);

		Cell cell = WorkbookFactory.create(file).getSheet("suparna").getRow(2).getCell(2);
	
		try 
		{
			 result = cell.getStringCellValue();
		} 
		catch (IllegalStateException i)
		{
			double result1 = cell.getNumericCellValue();
			//now we need to convert this double in to string so we will use
		    result=String.valueOf(result1);
			
			
		}
		
		return result;
		
		}
}
