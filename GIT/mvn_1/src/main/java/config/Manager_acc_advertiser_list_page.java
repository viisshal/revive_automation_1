package config;

import org.openqa.selenium.By;

public class Manager_acc_advertiser_list_page extends ConfigClass_1{
	
	By add_campaign = By.linkText("Add new campaign");
	
	public void adv_add_campaign() {
		driver.findElement(add_campaign).click();
	}

}
