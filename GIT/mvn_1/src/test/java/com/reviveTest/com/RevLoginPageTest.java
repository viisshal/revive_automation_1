package com.reviveTest.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Add_Banner_Fields;
import config.Add_Campaign_details;
import config.Add_website_details;
import config.Admin_account_CreateNewManager;
import config.Admin_account_Managers_ListPage;
import config.Admin_account_homepage;
import config.Advertiser_Page;
import config.Campaign_listPage;
import config.ConfigClass_1;
import config.DB;
import config.HomePage_NewManager;
import config.Manager_acc_advertiser_list_page;
import config.Manager_account_homepage;
import config.Page_1;
import config.SikuliX2;
import config.WebSite_Module;
import config.Zone;

public class RevLoginPageTest {
	
	@BeforeClass()
	public void TC1() {
			
		ConfigClass_1 CC1 = new ConfigClass_1();
		WebDriver driver = CC1.readProperties();
		
		
		Page_1 p1 = new Page_1(driver);
		p1.lg("admin","admin@123456");
		p1.lgclk();
		System.out.println("Logged in successfull");
	}			
		//Switch to admin account
		
		@Test (priority = 1)
		public void Admin_HomePage() {
		HomePage_NewManager HM = new HomePage_NewManager();
		HM.CreateNewManager();
		System.out.println("Now in Admin_home page");

		
		}
		
		
		  //Navigating to Create Manager in Admin account
		  
		  @Test (priority = 2)
		  public void Admin_Navg_create_manager() {
		  Admin_account_homepage ACH = new Admin_account_homepage();
		  ACH.Admin_account_HP(); 
			System.out.println("Navigating to Create Manager in Admin account");

		  }
		 
		
		// Create New Manager in Admin account
		
		  @Test (priority = 3) 
		  public void Create_New_Manager() {
		  Admin_account_CreateNewManager AAC = new Admin_account_CreateNewManager();
		  AAC.Admin_Acc_New_Mangers(); 
		  System.out.println("Creating New Manager in Admin account");

		  }
		 
		
		// Switch to the New Managers account
		
		  @Test (priority = 4) 	
		  public void New_Manager_ListsPage() {
		  Admin_account_Managers_ListPage AAML = new Admin_account_Managers_ListPage();
		  AAML.Switch_to_manger();
		  System.out.println("Switching to the New Managers account");

		  }
		 
		// Manager account Homepage
		
		  @Test (priority = 5)
		  public void Manger_HomePage() {

		  Manager_account_homepage MCH = new Manager_account_homepage();
		  MCH.Mng_Inventory();
		  System.out.println("Manager's account home page");

		  }
		 
		
			
			  //Go to Inventory and create new Advertiser in Manager's account
			  
			  @Test (priority = 6) public void Create_advertiser() { Advertiser_Page p2 =
			  new Advertiser_Page(); p2.homepage(); p2.Adv_fields(); System.out.
			  println("Navigating to Inventory and create new Advertiser in Manager's account"
			  );
			  
			  }
			  
			  
			  //Manager's account advertiser list page (for creating new campaign for the advertiser)
			  
			  
			  @Test (priority = 7) public void Advertiser_ListPage() {
			  Manager_acc_advertiser_list_page MADLI = new
			  Manager_acc_advertiser_list_page(); MADLI.adv_add_campaign(); System.out.
			  println("In Manager's account advertiser list page (for creating new campaign for the advertiser)"
			  );
			  
			  
			  }
			  
			  // Add new Campaign details
			  
			  @Test (priority = 8) public void Add_NewCampaignPage() { Add_Campaign_details
			  ACD = new Add_Campaign_details(); ACD.Add_campaign();
			  System.out.println("Add new campaign details");
			  
			  }
			  
			  // Campaign list page (for adding new banner)
			  
			  @Test (priority = 9) public void Campaign_ListPage() { Campaign_listPage CLP
			  = new Campaign_listPage(); CLP.Add_Banner();
			  System.out.println("In campaign list for cliking add new banner button");
			  
			  }
			  
			  // Add new Banner fields
			  
			  @Test (priority = 10) public void Add_NewBanner (){ Add_Banner_Fields ABF =
			  new Add_Banner_Fields(); ABF.add_ban_fields();
			  System.out.println("Entering new Banner details");
			  
			  }
			  
			  // Clicking Add new Website in Website module
			  
			  @Test (priority = 11) public void Add_NewWebSitePage (){ WebSite_Module WM =
			  new WebSite_Module(); WM.Website_Module();
			  System.out.println("Clicling the Add new website button");
			  
			  }
			  
			  
			  // Adding Website details
			  
			  @Test (priority = 12) public void Add_NewWebSite_fieldsPage (){
			  Add_website_details AWD = new Add_website_details(); AWD.Website_details();
			  System.out.println("Adding new website details");
			  
			  }
			  
			  
			  // Clicking add new Zone and entering the details
			  
			  @Test (priority = 13) public void Zone (){ Zone z = new Zone();
			  z.click_add_zone(); System.out.println("Working on Zone module");
			  }
			  
			 /** @Test (priority = 14)
			  public void FTP() {
				  SikuliX2 sx2 = new SikuliX2();
				  sx2.Ftp();
				  
				  
				
					  
				  }
			  
			  @Test (priority = 15)
			  public void DB() {
				  DB db = new DB();
				  
				  db.DB_connection();
				  db.RetriveData();
				  db.Closeconnection(); 
			
			  
				  
			 
			  
			  
			  
				  
			  }**/
			  
			  
			  }
			 


