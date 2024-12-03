package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 static FileInputStream FIS ;
	 static  XSSFWorkbook Workbook ;
	 static XSSFSheet Sheet ;
	 static Row row1;
	 static Cell cell1;
	
		/*
		 * public static String getCellData(int row,int col) { String CellData = null ;
		 * try { try { FIS = new
		 * FileInputStream("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx"); } catch
		 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); } try
		 * { Workbook = new
		 * XSSFWorkbook("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx"); } catch
		 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * Sheet = Workbook.getSheet("Sheet1"); row1 = Sheet.getRow(row); cell1 =
		 * row1.getCell(col); CellData = cell1.getStringCellValue(); } catch (Exception
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); } return
		 * CellData; }
		 */
	
	public static String Add_new_adv(int ROW,int COL) {
		String advname = null;
		try {
			FIS = new FileInputStream("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx");
			XSSFSheet Sheet = wb.getSheet("Sheet1");
			row1 = Sheet.getRow(ROW);
			cell1 = row1.getCell(COL);
			return advname = cell1.getStringCellValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return advname;
			}


public static int Add_new_adv_int(int ROW1,int COL1) {
	int advnameNumeric = 0;
	try {
		FIS = new FileInputStream("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx");
		XSSFSheet Sheet = wb.getSheet("Sheet1");
		row1 = Sheet.getRow(ROW1);
		cell1 = row1.getCell(COL1);
		return advnameNumeric =(int) cell1.getNumericCellValue();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return advnameNumeric;
}
}
