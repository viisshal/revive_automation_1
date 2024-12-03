package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Zone extends ConfigClass_1 {
	
	 
	// Finding Elements
	
	By clk_add_zone = By.linkText("Add new zone");
	By ZoneName = By.id("zonename");
	By ZoneDescrip = By.id("description");
	By ZoneSize_chk = By.xpath("//input[@id='size-c']");
	By ZoneWidth = By.id("width");
	By ZoneHeight = By.id("height");
	By ZoneComments = By.id("comments");
	By ZoneSubmit = By.id("submit");
	
	By Zone_lnk_ban = By.linkText("Linked Banners");

	
	// Invocation code tab
	
	By invoc_tab = By.linkText("Invocation Code");
	
	
	// Read from Excel
	
	String ZoneName_X = ExcelUtils.Add_new_adv(37,1);
	String ZoneDescrip_X = ExcelUtils.Add_new_adv(38,1);
	int ZoneWidth_X = ExcelUtils.Add_new_adv_int(39, 1);
	int ZoneHeight_X = ExcelUtils.Add_new_adv_int(40, 1);
	
	// Linking Banner through Excel
	
	String adv_frm_drpdwn = ExcelUtils.Add_new_adv(4,1);
	String camp_frm_drpdwn = ExcelUtils.Add_new_adv(16,1);
	String ban_frm_drpdwn = ExcelUtils.Add_new_adv(22,1);
	

	
	
	public void click_add_zone() {
		
		// clicking add new zone
		driver.findElement(clk_add_zone).click();
		
		// Zone name
		driver.findElement(ZoneName).clear();
		driver.findElement(ZoneName).sendKeys(ZoneName_X);
		
		// Zone Description
		
		driver.findElement(ZoneDescrip).sendKeys(ZoneDescrip_X);
		
		// Zone size clk
		
		driver.findElement(ZoneSize_chk).click();
		
		// Zone Width
		
		driver.findElement(ZoneWidth).clear();
		driver.findElement(ZoneWidth).sendKeys(String.valueOf(ZoneWidth_X));
		
		// Zone height
		
		driver.findElement(ZoneHeight).clear();
		driver.findElement(ZoneHeight).sendKeys(String.valueOf(ZoneHeight_X));
		
		// Zone comments
		
		driver.findElement(ZoneComments).click();
		
		// Zone Submit
		
		driver.findElement(ZoneSubmit).click();
		
		// Zone->click Link Banners
		
		driver.findElement(Zone_lnk_ban).click();
		
		// Adding Link banner codes
		
		
		
		// choose select by individual banner from dropdown
		WebElement Select_ban = driver.findElement(By.xpath("//select[@name='view']"));
		Select s = new Select(Select_ban);
		s.selectByValue("ad");
		
		// Click the forward icon
		
		driver.findElement(By.xpath("//input[@id='link_type_submit']")).click();
		
		// Choose advertiser from the dropdown
		WebElement Select_adv = driver.findElement(By.xpath("//select[@name='clientid']"));
		Select s1 = new Select(Select_adv);
		s1.selectByVisibleText(adv_frm_drpdwn);
		
		// Choose the campaign
		WebElement select_campid = driver.findElement(By.xpath("//select[@name='campaignid']"));
		Select s2 = new Select(select_campid);
		//s2.selectByVisibleText(adv_frm_drpdwn+" - Default Campaign" + camp_frm_drpdwn+" (1 banner(s))");
		//s2.selectByVisibleText(camp_frm_drpdwn);
		s2.selectByVisibleText(camp_frm_drpdwn+" (1 banner(s))");
		
		// Choose Banner from dropdown
		WebElement Select_banid = driver.findElement(By.xpath("//select[@name='bannerid']"));
		Select s3 = new Select(Select_banid);
		s3.selectByVisibleText(ban_frm_drpdwn);
		
		// Click ok arrow
		
		driver.findElement(By.xpath("//input[@id='link_submit']")).click();
		
		// Open invocation tab window
		
		driver.findElement(invoc_tab).click();
		
		// Display the invocation code in Result
		
		
		
	}
		public String AsyncTag() {
			
			WebElement cd = driver.findElement(By.xpath("//textarea[@id='bannercode']"));
			System.out.println("The Asynchronous JS Tag : "+cd.getText());
		
		String async_tag = cd.getText();
		return async_tag;
		
		
		
			}

}
