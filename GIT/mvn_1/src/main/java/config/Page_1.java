package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_1 extends ConfigClass_1{
	
	
	
	By nm = By.id("username");
	By pswd = By.id("password");
	By login = By.id("login");
	
	public Page_1 (WebDriver driver) {
		super(driver);
	}
	
	public void lg(String NAME,String PASS ) {
		driver.findElement(nm).sendKeys(NAME);
		driver.findElement(pswd).sendKeys(PASS);
	}
		
		public void lgclk() {
		driver.findElement(login).click();;
	
	}
	
	
	

}
