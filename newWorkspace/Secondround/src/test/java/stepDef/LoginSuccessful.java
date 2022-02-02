package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSuccessful {
	
	WebDriver driver;
	
	@Given("I am on the Sauce Home Page")
	public void i_am_on_the_sauce_home_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	@When("I enter {string} {string}")
	public void i_enter(String username, String password) {
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");		
	}

	@When("I click the login Button")
	public void i_click_the_login_button() {

		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		
	}
	
	@When("I enter {string} {string} for account LockedOutUser.")
	public void i_enter_for_account_locked_out_user(String locked_out_user, String secret_sauce) {
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");	
	}

	@Then("I verify the Error Message contains the text {string}")
	public void i_verify_the_error_message_contains_the_text(String string) {
	  driver.findElement(By.tagName("error")).sendKeys("Sorry the user has been banned");
	}

	@Then("I am redirected to the Sauce Main Page")
	public void i_am_redirected_to_the_sauce_main_page() {

		
		
	}

	@Then("I verify the App Logo exists")
	public void i_verify_the_app_logo_exists() {

		
		
	}
	

}
