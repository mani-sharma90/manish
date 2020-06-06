package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.POMFB;

public class BaseTest implements AutoConstant{
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty(chroma_key, chroma_value);
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}
	
	

	/*@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}*/
	
}
