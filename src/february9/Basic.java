package february9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Basic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("E:\\Workspace\\Data.xls");
		
		FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(input);

		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row = sheet.getRow(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Fetch Last Row Num: "+ sheet.getLastRowNum());
		
		HSSFCell cell = row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		for (int i=0;i<=lastRowNum; i++) {
			row = sheet.getRow(i);
			int x = 0;
					do {
						cell = row.getCell(x);
						System.out.println(cell.getStringCellValue());
						x++;
						} while (cell.getStringCellValue() != null);
			}
	}

}
