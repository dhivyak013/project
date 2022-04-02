import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMaven {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven\\Excel\\Test Case.xlsx");
		FileInputStream str = new FileInputStream(f);
		Workbook book = new XSSFWorkbook (str);
		Sheet s = book.getSheet("Data");
		Row r = s.getRow(1);
		org.apache.poi.ss.usermodel.Cell c = r.getCell(0);
		//Cell c = r.getCell(1);
		System.out.println(c);
		
	
		
	}

}
