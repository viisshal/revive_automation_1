package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ConfigClass {
	static Properties prop = new Properties();
	 WebDriver driver;
	
	
	

	
	
	
	@BeforeMethod
	public  void readProperties() {
		
		
		
		try {
			InputStream input = new FileInputStream("/home/djaxtech-p/eclipse-workspace/mvn_1/src/main/java/config/config.properties");
			prop.load(input);		
			System.out.println(prop.getProperty("Browser"));
			String brow = prop.getProperty("Browser");
			if (brow.equals("Chrome")) {
				driver = new ChromeDriver();
				
			}
			else {
				System.out.println("There is no ChromeDriver");
			}
				
				
				
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Maximize driver
		
		driver.manage().window().maximize();
		
		// Enter the Url
		
		String url = prop.getProperty("URL");
		driver.get(url);
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void quitbrowser() {
		driver.quit();
	}
	

}
	
	

	
	
	
	
	
	
	/*
	 * public static void writePorperties() { try { OutputStream output = new
	 * FileOutputStream(
	 * "/home/djaxtech-p/eclipse-workspace/mvn_1/src/main/java/config/config.properties"
	 * );
	 * 
	 * System.out.println(prop.setProperty("Browser", "IE"));
	 * prop.setProperty("result","pass"); try { prop.store(output, null); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	



