package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Admin_account_homepage extends ConfigClass_1{
	
	By Admin_Invent = By.linkText("Inventory");
	By Admin_clk_Actions = By.xpath("//div[@class='dropDown tools']");
	By Admin_create_users = By.xpath("//a[@href='agency-edit.php']");
	
	public void Admin_account_HP() {
		
		
		driver.findElement(Admin_Invent).click();
		driver.findElement(Admin_clk_Actions).click();
		driver.findElement(Admin_create_users).click();
		
	}
	
	
	
	
	

}
