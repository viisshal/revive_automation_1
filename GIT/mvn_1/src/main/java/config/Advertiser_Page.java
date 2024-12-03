package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Advertiser_Page extends ConfigClass_1{
	
	//Elements path
	
	By advname = By.id("clientname");
	By advcontact = By.id("contact");
	By advemail = By.id("email");
	By adv_rep_deact = By.xpath("//input[@name='reportdeactivate'and @type ='checkbox']");
	By adv_email_delrep = By.xpath("//input[@name='report' and @type='checkbox']");
	By adv_ban_limit = By.xpath("//input[@name='advertiser_limitation' and @type='checkbox']");
	By adv_interval = By.xpath("//input[@class='x-small']");
	By adv_Comments = By.id("comments");
	By submit = By.id("submit");
	
	//Excel data's
	
	String advname_X = ExcelUtils.Add_new_adv(4,1);
	int advcontact_X = ExcelUtils.Add_new_adv_int(5,1);
	String advemail_X = ExcelUtils.Add_new_adv(6,1);
	int adv_interval_X = ExcelUtils.Add_new_adv_int(7,1);
	String adv_Comments_X = ExcelUtils.Add_new_adv(8,1);
	

	
	
	
	public void homepage() {
		
		driver.findElement(By.linkText("Add new advertiser")).click();
	}
	public void Adv_fields () {	
		// clear the advertiser name field
		driver.findElement(advname).clear();
		
		// add new advertiser name
		 driver.findElement(advname).sendKeys(advname_X);
		 
		 //add new advertiser contact number
		 driver.findElement(advcontact).sendKeys(String.valueOf(advcontact_X));
		 
		 //add new advertiser email id
		 driver.findElement(advemail).sendKeys(advemail_X);
		 
		 //Click Email when a campaign is automatically activated/deactivated 
		 driver.findElement(adv_rep_deact).click();
		 
		 //Click Email campaign delivery reports
		 driver.findElement(adv_email_delrep).click();
		 
		 //Enter the Number of days between campaign delivery reports
		 driver.findElement(adv_interval).sendKeys(String.valueOf(adv_interval_X));
		 
		 //Click Display only one banner from this advertiser on a web page
		 driver.findElement(adv_ban_limit).click();
		 
		 //Enter the comments for the new advertiser
		 driver.findElement(adv_Comments).sendKeys(adv_Comments_X);
		 
		 //Click Submit and create the advertiser
		 driver.findElement(submit).click();
		 
		

		 
		 

		 

		 

		 


		 

		 
		
	}
	
	

}
