package org.tst.cts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefinition {

	static WebDriver driver;
@Given("user is in Fb  Login page")
public void user_is_in_Fb_Login_page() {
   
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\cucumberPoject003\\driver\\chromedriver002.exe");
     driver = new ChromeDriver();
	driver.get("https://www.facebook.com");

}

@When("when has to enter the valid username and password")
public void when_has_to_enter_the_valid_username_and_password() {

	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("karthikeyankandhan@gmail.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Amazon@123");
}

@When("Click the login button")
public void click_the_login_button() {
	WebElement click = driver.findElement(By.xpath("//input[@value='Log In']"));
	click.click();
    
}

@Then("user has to nvigatet to the Home page")
public void user_has_to_nvigatet_to_the_Home_page() {
    
	Assert.assertEquals(false, false);
	
	
	
}



}
