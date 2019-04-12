package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantValues.ConstantVariable;

public class ExcelReadWrite {

	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFRow r1;
	static XSSFCell ce1;
	
	public static void openExcel(String filePath) throws Exception {
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readValues(String sheetName, int roNum, int coNum) {
		ws = wb.getSheet(sheetName);
		ce1 = ws.getRow(roNum).getCell(coNum);
		DataFormatter df = new DataFormatter();
		String cellValue = df.formatCellValue(ce1);
		return cellValue;
	}
	
	public static void writeValues(String sheetName, int roNum, int coNum, String testData) throws Exception {
		ws = wb.getSheet(sheetName);
		ce1 = ws.getRow(roNum).getCell(coNum);
		ce1.setCellValue(testData);
		
		File f = new File(ConstantVariable.excelPath);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		FileInputStream fis = new FileInputStream(f);
	}

//	public static void main(String[] args) throws Exception {
//		openExcel("E:\\2MarchBatch\\DataDrivenFramework\\Test.xlsx");
//		
//		writeValues("TestData", 3, 4, "PASSXXXX");
//		writeValues("TestData", 4, 4, "PASSXXXX");
//		String v1 = readValues("TestData", 0, 0);
//		System.out.println(v1);
//		String v2 = readValues("TestData", 0, 1);
//		System.out.println(v2);
//		String v3 = readValues("TestData", 9, 3);
//		System.out.println(v3);
//		String v4 = readValues("TestData", 18, 3);
//		System.out.println(v4);
//	}
}
