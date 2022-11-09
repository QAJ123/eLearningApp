package stepDefs;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksClass;

public class ELearningStepDefs {
	WebDriver driver=hooksClass.driver;
	public static String username,password;
	//public 

	@Given("User navigates to Eleraning application")
	public void user_navigates_to_Eleraning_application() {
		driver.get("http://elearningm1.upskills.in/index.php");
		
	    
	}

	@When("User clicks on Sign up button")
	public void user_clicks_on_Sign_up_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click();
		String pageHeader=driver.findElement(By.xpath("//div[@class='page-header']")).getText();
		Assert.assertEquals(pageHeader, "Registration");
	  	}

	@When("user provide manadtory field on user registration form")
	public void user_provide_manadtory_field_on_user_registration_form() throws InterruptedException {
		Random random = new Random();   
		driver.findElement(By.name("firstname")).sendKeys("QAJName");
		driver.findElement(By.name("lastname")).sendKeys("QAJLastName");
		driver.findElement(By.name("email")).sendKeys("QAJTestemail@abc.com");

		driver.findElement(By.name("username")).sendKeys("QAJ"+random.nextInt(1000));
		Thread.sleep(1000);
		username=driver.findElement(By.name("username")).getAttribute("value");
		driver.findElement(By.name("pass1")).sendKeys("123456789");
		driver.findElement(By.name("pass2")).sendKeys("123456789");
		password=driver.findElement(By.name("pass1")).getAttribute("value");;
		System.out.println(username+"----"+password);

		driver.findElement(By.name("submit")).click();
		
		

	    }

	@Then("Verify user logged in successfully")
	public void verify_user_loggedin_successfully() {
		System.out.println(username+"----"+password);
		String homePageTabName=driver.findElement(By.xpath("//li[@class='tab-homepage']")).getText();
		Assert.assertEquals(homePageTabName, "Homepage");
	}

	@When("user login with valid credentials")
	public void user_login_with_valid_credentials() {
		
		if(username==null ||username.isEmpty()) {
			username="QAJ784";
			password="123456789";
		}
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("submitAuth")).click();
		
		String homePageTabName=driver.findElement(By.xpath("//li[@class='tab-homepage']")).getText();
		System.out.println(homePageTabName);
		Assert.assertEquals(homePageTabName, "Homepage");
		
	}

	@When("user clicks on Inbox")
	public void user_clicks_on_Inbox() {
		driver.findElement(By.xpath("//li[@class='inbox-message-social']")).click();
		Assert.assertEquals(driver.findElement(By.id("breadcrumb-bar")).getText(), "Social network Inbox");

	}

	@When("Compose a mail and sent to receipients")
	public void compose_a_mail_and_sent_to_receipients() {
	try {
     driver.findElement(By.xpath("//img[@title='Compose message']")).click();
     WebElement sendToField=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
     sendToField.sendKeys("QAJ");
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("ul.select2-results__options>li:nth-child(1)")).click();
     Thread.sleep(1000);
     driver.findElement(By.name("title")).sendKeys("TestSubject");
     driver.findElement(By.name("compose")).click();
	}catch(Exception e) {
		e.getMessage();
	}
     
	}

	@Then("Verify sent successfull toast message")
	public void verify_sent_successfull_toast_message() {
		String successMessage="The message has been sent to";
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText().contains(successMessage));
	}

}
