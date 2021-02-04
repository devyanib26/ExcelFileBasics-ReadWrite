package march21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\Workspace\\Data.xls");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row = sheet.getRow(0);
		
		short cellNum = row.getLastCellNum();
		// This method row.getLastCellNum(); counts row from 1 onwards.
		
		for (int i=0;i<cellNum; i++) {
			HSSFCell cell = row.getCell(i);
			System.out.println(cell.getStringCellValue());

		}
		
		
		
	}

}
