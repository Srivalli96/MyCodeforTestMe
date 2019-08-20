package cucumber_demo1.cucumber_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiplelogins {
	WebDriver driver;
	@Given("Testmeapp is launched my user")
	public void testmeapp_is_launched_my_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	
	}

	@When("User clicks on signin link in landing page")
	public void user_clicks_on_signin_link_in_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
	}

	@Then("User provides the valid username {string}")
	public void user_provides_the_valid_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(string1);
		
	}

	@Then("User provides the valid password {string}")
	public void user_provides_the_valid_password(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string2);
	}

	@Then("user clicks for submission of data")
	public void user_clicks_for_submission_of_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
	}

	@Then("verifies the login status for the account")
	public void verifies_the_login_status_for_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 String str6 = driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[4]/a/span")).getText();
		  String str7= "OrderDetails";
		  Assert.assertEquals(str6, str7);
		  driver.findElement(By .linkText(" SignOut")).click();
	}

}
