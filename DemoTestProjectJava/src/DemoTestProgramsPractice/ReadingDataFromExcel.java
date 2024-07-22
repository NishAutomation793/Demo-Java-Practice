package DemoTestProgramsPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\nishant.k.goel\\eclipse-workspace\\DemoTestProjectJava.zip_expanded\\DemoTestProjectJava\\src\\dataFiles\\SaleData.xlsx";
		
		FileInputStream in =new FileInputStream(filePath);
		
		XSSFWorkbook workbook =new XSSFWorkbook(in);
		
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		int columns=sheet.getRow(1).getLastCellNum();
		
		for(int i=0; i<row; i++)
		{
			XSSFRow r=sheet.getRow(i);
			
			for(int j=0;j<columns; j++)
			{
				
				String cellVal=r.getCell(j).toString();
				System.out.println(cellVal);
				
				
			}
			
			
		}
		
		
	}
	
}
