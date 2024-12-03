package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ConfigClass_1 {
	static Properties prop = new Properties();
	public static WebDriver driver ;
	
	public ConfigClass_1(WebDriver driver) {
		this.driver = driver;
		
	}
		
	public ConfigClass_1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@BeforeMethod
	public WebDriver readProperties() {
		
		try {
			InputStream input = new FileInputStream("/home/djaxtech-p/eclipse-workspace/mvn_1/src/main/java/config/config.properties");
			prop.load(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("Browser"));
		String Browser = prop.getProperty("Browser");
		if (Browser.equals("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			String url = prop.getProperty("URL");
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else {
			System.out.println("Chrome browser not available");
		}
		
	
	return driver;	
	}
	
	/*
	 * public WebDriver Excelprop(int Rnum,int Cnum) {
	 * 
	 * 
	 * try { XSSFWorkbook WorkBook = new
	 * XSSFWorkbook("/home/djaxtech-p/Desktop/vishal /ReadExcel.xlsx"); XSSFSheet
	 * sheet = WorkBook.getSheet("Sheet1"); Row row = sheet.getRow(Rnum); Cell cell
	 * = row.getCell(Cnum); //return cell.toString();
	 * 
	 * } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * return driver; }
	 */
	

}
