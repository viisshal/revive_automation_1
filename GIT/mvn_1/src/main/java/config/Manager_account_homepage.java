package config;

import org.openqa.selenium.By;

public class Manager_account_homepage extends ConfigClass_1{
	
	By Manager_Inventory = By.linkText("Inventory");
	
	public void Mng_Inventory() {
		
		driver.findElement(Manager_Inventory).click();
		
	}

}
