package resource.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcypress {

	public static  WebDriver driver;
	
	

@Given("^Open the browser and enter google search$")
public void open_the_browser_and_enter_google_search() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramana\\Downloads\\chromedriver_win32_87\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://google.com");
}

@When("^search for cypress$")
public void search_for_cypress() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cypress"+ Keys.ENTER);
	
	
   
}

@Then("^goto cypress site$")
public void goto_cypress_site() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[contains(text(),'cypress.io')]")).click();
    Thread.sleep(4000);
    System.out.println(driver.getPageSource());
}



@When("^search for \"([^\"]*)\"$")
public void search_for(String arg1) throws Throwable {
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(arg1+ Keys.ENTER);

   
}

@Then("^goto to site$")
public void goto_to_site() throws Throwable {
	  driver.findElement(By.xpath("//h3[1]")).click();
	    Thread.sleep(4000);
	    System.out.println(driver.getPageSource());
   
	
}

}
