package testScenarios;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;




public class TC001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.out.println("Welcome To Java......");

		//readXLs("TC005","Password");

		//readX_No_logicL();
		read_XL_using_Index();

	}


	@Test
	public static void readX_No_logicL(){

		try {
			String path = "C:\\Users\\Administrator\\Desktop\\Test001.xls";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Mithun");
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				for (int j = 0; j < lastCell; j++) {
					Cell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readXLs(String testName , String columnName){

		//readXL("TC004" , "Password");

		try {
			String path = "C:\\Users\\Administrator\\Desktop\\Test001.xls";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Mithun");
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				//System.out.println(value);
				if(value.equals(testName)){
					Row rownew = sheet.getRow(0);
					for (int j = 0; j < lastCell; j++) {
						Cell cellnew = rownew.getCell(j);
						String valuenew = cell.getStringCellValue();
						if(cellnew.toString().equals(columnName)) {

							System.out.println(sheet.getRow(i).getCell(j));

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void readXLsX(String testName , String columnName){

		//readXL("TC004" , "Password");

		try {
			String path = "C:\\Users\\Administrator\\Desktop\\Test001.xls";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Mithun");
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				//System.out.println(value);
				if(value.equals(testName)){
					Row rownew = sheet.getRow(0);
					for (int j = 0; j < lastCell; j++) {
						Cell cellnew = rownew.getCell(j);
						String valuenew = cell.getStringCellValue();
						if(cellnew.toString().equals(columnName)) {
							System.out.println(sheet.getRow(i).getCell(j));
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void read_XL_using_Index() throws IOException{
		
		String path = "C:\\Users\\Administrator\\Desktop\\Test001.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Mithun");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
	}


}
