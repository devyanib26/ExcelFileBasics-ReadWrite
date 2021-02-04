package march21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteToNewRowExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:\\Workspace\\DataWrite.xls");
		FileInputStream inputStream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		// Get the maximum row number
		int maxRow = sheet.getLastRowNum();
		
		//Create a new Row
		HSSFRow row = sheet.createRow(maxRow+1);
		// Get a dynamic last cell#
		int maxCell = row.getLastCellNum();
		// This method row.getLastCellNum() returns -1 if it is a new row.
		HSSFCell cell = row.createCell(maxCell+1);
		cell.setCellValue("Chennai");
		
		HSSFSheet sheet2 = workbook.getSheet("Sheet2");
		int maxRow2 = sheet2.getLastRowNum();
		HSSFRow row2 = sheet2.createRow(maxRow2+1);

		int maxCell2 = row2.getLastCellNum();
		HSSFCell cell2 = row2.createCell(maxCell2+1);
		cell2.setCellValue("TestingSheet2");
		
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
		outStream.close();
		
	}

}
