package org.ictkerala.presettingspage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IctakConfigurations {

	public WebDriver driver;
	Properties prop;
	
	public void loadprop() throws IOException
	{
		FileInputStream propobj=new FileInputStream("D:\\ICTAK_SW_TESTING_COURSE\\MAVEN\\LiveCaseStudyMaven\\Maven_Assignment\\mavenprojectsubmission\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(propobj);
	}
	@BeforeTest
	public void preconditions() throws IOException {
		loadprop();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
}
