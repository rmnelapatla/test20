package resource.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {

	public static WebDriver driver;
	
	@Given("^Open then chrome browser$")
	public void Open_then_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramana\\Downloads\\chromedriver_win32_87\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		
	}
	  

	@Then("^Enter url of the stackoverflow$")
	public void Enterurlofthestackoverflow() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java"+ Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Tag')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Click to show search']")).click();
		
		
	}

	@When("^search for java question$")
	public void searchforjavaquestion(){
		
		driver.findElement(By.xpath("//input[@id='tagfilter']")).sendKeys("Java" +Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='/questions/tagged/java']")).click();
	}
	
	



}
