package StepDef;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef
{
WebDriver driver;


	PropertiesFileReader obj=new PropertiesFileReader();



	@Given("^user is already on Login Page$")
	public void user_already_on_login_page()
	{
		Properties properties=obj.getProperty();
		driver = new ChromeDriver();
		driver.get(properties.getProperty("browser.baseURL"));
				
	}


	

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException{
		driver.findElement(By.id("identifierId")).sendKeys(username);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    
	   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException  {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    Thread.sleep(4000);
	}


	@Then("^the user click on last mail$")
	public void the_user_click_on_last_mail() throws InterruptedException
	
	{
		 driver.findElement(By.xpath("//input[@placeholder='Search mail']")).sendKeys("assessment");

		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@class='gb_Df gb_Pf']//*[@focusable='false']")).click();
		    
		  // driver.findElement(By.xpath("//span[@id=':nm']")).click();
		
		    
		
		List<WebElement> cb= driver.findElements(By.xpath("//span[@class='bog']"));
		
	
	
		for(WebElement emailsub : cb){
		    if(emailsub.getText().equals("Job application for testing role") == true){

		           emailsub.click();
		           break;
		        }
}
		
}
	

	
}
