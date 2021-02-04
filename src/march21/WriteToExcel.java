package march21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:\\Workspace\\DataWrite.xls");
		FileInputStream inputStream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row = sheet.getRow(0);
		int maxCell = row.getLastCellNum();
		HSSFCell cell = row.createCell(maxCell);
		cell.setCellValue("Kolhapur-fromScript");
		
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
		outStream.close();
		
	}

}
