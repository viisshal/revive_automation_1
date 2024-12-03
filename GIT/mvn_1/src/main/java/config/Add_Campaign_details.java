package config;

import org.openqa.selenium.By;

public class Add_Campaign_details extends ConfigClass_1{
	
	//Finding elements
	
	By Campaign_name = By.id("campaignname");
	By Campaign_type = By.xpath("//input[@value='1']");
	By Campaign_rate = By.id("revenue");
	By Campiagn_view_total = By.id("cap");
	By Campaign_view_session = By.id("session_capping");
	By Campiagn_cookies = By.xpath("//input[@name='show_capped_no_cookie']");
	By Campiagn_Miscellaneous1 = By.xpath("//input[@name='anonymous' and @value='t']");
	By Campiagn_Miscellaneous2 = By.xpath("//input[@name='companion' and @value='1']");
	By Campaign_comments = By.id("comments");
	By Campaign_submit = By.id("submit");
	
	//Reading value from Excel
	
	String Campaign_name_X = ExcelUtils.Add_new_adv(16, 1);
	int Campaign_rate_X = ExcelUtils.Add_new_adv_int(17, 1);
	int Campiagn_view_total_X = ExcelUtils.Add_new_adv_int(18, 1);
	int Campaign_view_session_X = ExcelUtils.Add_new_adv_int(19, 1);
	String Campaign_comments_X = ExcelUtils.Add_new_adv(20, 1);
	
	
	public void Add_campaign() {
		
		// Enter the campaign name
		driver.findElement(Campaign_name).clear();
		driver.findElement(Campaign_name).sendKeys(Campaign_name_X);
		
		// Campaign Type (Remnant)
		
		driver.findElement(Campaign_type).click();
		
		// Campaign rate
		
		driver.findElement(Campaign_rate).sendKeys(String.valueOf(Campaign_rate_X));
		
		// Campaign view total
		
		driver.findElement(Campiagn_view_total).sendKeys(String.valueOf(Campiagn_view_total_X));
		
		// Campaign view session
		
		driver.findElement(Campaign_view_session).sendKeys(String.valueOf(Campaign_view_session_X));
		
		// Campiagn_cookies
		
		driver.findElement(Campiagn_cookies).click();
		
		// Campiagn_Miscellaneous1
		
		driver.findElement(Campiagn_Miscellaneous1).click();
		
		// Campiagn_Miscellaneous1
		
		driver.findElement(Campiagn_Miscellaneous2).click();
		
		// Campaign_comments
		
		driver.findElement(Campaign_comments).sendKeys(Campaign_comments_X);
		
		// Campaign_submit
		
		driver.findElement(Campaign_submit).click();



		
		

		
		

		
		
		
		

		
		


		
		

		
		
		
		
		
	}

	
	
	

}
