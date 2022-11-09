package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksClass {

	public static WebDriver driver;

	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\003QIP744\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Iniliased");
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}
