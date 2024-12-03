package config;

import org.openqa.selenium.By;

public class WebSite_Module extends ConfigClass_1 {

	By Website_mod = By.linkText("Websites");
	By add_website = By.linkText("Add new website");
	
	public void Website_Module() {
		
		driver.findElement(Website_mod).click();
		driver.findElement(add_website).click();
	}
}
