package config;

import org.openqa.selenium.By;

public class Add_website_details extends ConfigClass_1{
	
	// Finding Elements
	
	By Website_name = By.id("name");
	By Website_url = By.id("website");
	By Website_contact = By.id("contact");
	By Website_email = By.id("email");
	By Website_Submit = By.id("save");
	
	// Reading from excel
	
	String Website_url_X = ExcelUtils.Add_new_adv(32, 1);
	String Website_name_X = ExcelUtils.Add_new_adv(33,1 );
	int Website_contact_X = ExcelUtils.Add_new_adv_int(34, 1);
	String Website_email_X = ExcelUtils.Add_new_adv(35,1);

	
	public void Website_details() {
		
		// Website URL
		driver.findElement(Website_url).sendKeys(Website_url_X);
		
		// Website Name
		driver.findElement(Website_name).sendKeys(Website_name_X);
		
		// Website Contact
		driver.findElement(Website_contact).sendKeys(String.valueOf(Website_contact_X));
		
		// Website email
		driver.findElement(Website_email).sendKeys(Website_email_X);

		// Website Submit
		driver.findElement(Website_Submit).click();

			}
	

}
