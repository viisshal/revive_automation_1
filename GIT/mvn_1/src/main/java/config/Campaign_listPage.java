package config;

import org.openqa.selenium.By;

public class Campaign_listPage extends ConfigClass_1 {
	
	By Add_Banner = By.linkText("Add new banner");
	
	public void Add_Banner() {
		
		driver.findElement(Add_Banner).click();
		
	}
	

}
