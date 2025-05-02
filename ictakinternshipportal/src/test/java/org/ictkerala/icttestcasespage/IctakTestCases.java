package org.ictkerala.icttestcasespage;

import org.ictkerala.ictloginpage.IctakLoginPage;
import org.ictkerala.presettingspage.IctakConfigurations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IctakTestCases extends IctakConfigurations {

	IctakLoginPage lobj;
	
	@BeforeClass
	public void objinit() 
	
	{
		lobj=new IctakLoginPage(driver);
	}
	@Test
	public void TC_1_1_1() throws InterruptedException 
	{
		
		lobj.btnclk();		
	}
	@Test
	public void TC_2_1_1() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		}
	}




