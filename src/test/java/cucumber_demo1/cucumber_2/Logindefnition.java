package cucumber_demo1.cucumber_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logindefnition {
	WebDriver driver;
	@Given("User has launched the application")
	public void user_has_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	
		
	}

	@Then("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .linkText("SIGN-ON")).click();
		  
		driver.findElement(By .name("userName")).sendKeys("sravya007");
		driver.findElement(By .name("password")).sendKeys("123456789");
	}
	

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  driver.findElement(By .name("login")).click();
	}

	@Then("User verifies the login status")
	public void user_verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 String str1 = driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
		  String str2= "Flight Details";
		  		              
		  Assert.assertEquals(str1, str2);
		  driver.findElement(By .linkText("SIGN-OFF")).click();
		  
		  
		
	}

	@Given("User launched the app of mercury tours")
	public void user_launched_the_app_of_mercury_tours() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	
		
	}

	@Then("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("REGISTER")).click();
	}

	@When("User enters the valid data in the form")
	public void user_enters_the_valid_data_in_the_form() {
		 Actions a=new Actions(driver);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("firstName")).sendKeys("jack");
		  driver.findElement(By .name("lastName")).sendKeys("john");
		  driver.findElement(By .name("phone")).sendKeys("1234567899");
		  driver.findElement(By .name("userName")).sendKeys("jack123@gmail.com");
		  driver.findElement(By .name("address1")).sendKeys("8-8-8/2 rtc cross roads");
		  driver.findElement(By .name("city")).sendKeys("Hyderabad");
		  driver.findElement(By .name("state")).sendKeys("Telangana");
		  driver.findElement(By .name("postalCode")).sendKeys("533355");
		  a.moveToElement(driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"))).click();	
		 driver.findElement(By .name("email")).sendKeys("qatar09876");
		 driver.findElement(By .name("password")).sendKeys("jj12345678");
		  driver.findElement(By .name("confirmPassword")).sendKeys("jj12345678");
	}

	@When("User clicks on submit button available")
	public void user_clicks_on_submit_button_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("register")).click();
	}
	@Then("User verifies the registration status")
	public void user_verifies_the_registration_status() {
	String str3 = driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();

		  String str4= "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		  Assert.assertEquals(str3, str4);
		  
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
