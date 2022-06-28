package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {
	
	
	public static String readExcel (int rowNum, int cellNum) throws EncryptedDocumentException, IOException{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Chaitanya\\eclipse-workspace2\\Framework1\\Framework TestData.xlsx");
		Sheet ExcelFile = WorkbookFactory.create(file).getSheet("Sheet1");
		return ExcelFile.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}

	public static void snap(WebDriver driver, String name) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("  "+name+".jpeg");
		FileUtils.copyFile(source, dest);
		
			
	}
}
