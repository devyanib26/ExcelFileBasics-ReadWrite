package march21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadAllData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("E:\\Workspace\\Data.xls");
		FileInputStream inputStream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int maxRow = sheet.getLastRowNum();
		// This method counts row from 0 onwards.
		
		System.out.println(maxRow);
		
		for (int i=0; i<= maxRow; i++) {
			
			HSSFRow row = sheet.getRow(i);
			
			int maxCell = row.getLastCellNum();
			for (int j=0; j<maxCell; j++) {
				HSSFCell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue()+ "    ");
			}
			System.out.println();
		}
	}

}
