package config;

import org.openqa.selenium.By;

public class HomePage_NewManager extends ConfigClass_1 {
	
	By close_error = By.xpath("//div[@class='close']");
	By clk = By.xpath("//div[@class='switchTrigger']");
	By clk_Admin_account = By.linkText("Administrator account");
	
	public void CreateNewManager() {
		
		driver.findElement(close_error).click();
		driver.findElement(clk).click();
		driver.findElement(clk_Admin_account).click();
		
		
		
		
		
		
		
	}

}
