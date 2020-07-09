package StepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageobjects.FlighBookingPage;

public class FlightBook  {
    static WebDriver driver;
   FlighBookingPage flightbookpage;


    @Given("^As user i navigate to orbitz\\.com \"([^\"]*)\"$")
    public void as_user_i_navigate_to_orbitz_com(String url) throws Throwable {
        System.setProperty("webdriver.chrome.driver" ,"Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Given("^I select Flight Tab$")
    public void i_select_Flight_Tab() throws Throwable {
       flightbookpage =new FlighBookingPage(driver);
       flightbookpage.SelectTab();

    }

    @Given("^I select multicity option$")
    public void i_select_multicity_option() throws Throwable {
        flightbookpage.SelectMulticity();
    }


    @And("^I select first tavel point \"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectFirstTavelPoint(String CityA, String CityB) throws Throwable {
        flightbookpage.firstjourney( CityA, CityB);
    }

    @And("^I select first journey \"([^\"]*)\"$")
    public void iSelectFirstJourney(String jdate1) throws Throwable {
        flightbookpage.firstjourneydt(jdate1);

    }

    @And("^I select Passenger list \"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectPassengerList(String adults, String child) throws Throwable {
        flightbookpage.passengers(adults,child);
    }

    @And("^I select second day tavel point \"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectSecondTavelPoint(String CityB, String CityC) throws Throwable {
        flightbookpage.secondjourney( CityB,CityC);
    }

    @And("^I select seond day journey \"([^\"]*)\"$")
    public void iSelectSeondJourney(String jdate2) throws Throwable {
        flightbookpage.secondjourneydt(jdate2);
    }

    @And("^I select third day tavel point \"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectThirdDayTavelPoint(String CityC, String CityA) throws Throwable {
        flightbookpage.thirdjourney( CityC,CityA);

    }

    @And("^I select thiday day journey \"([^\"]*)\"$")
    public void iSelectThidayDayJourney(String date3) throws Throwable {
        flightbookpage.thirdjourneydt(date3+ Keys.TAB);
    }

    @And("^I submit my Search$")
    public void iSubmitMySearch() throws InterruptedException {
        flightbookpage.Submit();
        Thread.sleep(9000);
        int cnt = driver.findElements(By.xpath("//li[@data-test-id='offer-listing']")).size();
        Reporter.addScenarioLog("The total number of Search result:  "+cnt);

        WebElement lowest=driver.findElement(By.xpath("//div[@class='check filter-option']//span[contains(text(),'Nonstop')]/../../div/div"));
        Reporter.addScenarioLog("The lowest Result:  "+lowest.getText());

        Reporter.addScenarioLog("The total number of Search result:  "+cnt);

    }

    @Given("^As user i navigate to  google page$")
    public void asUserINavigateToGooglePage() {


    }

    @When("^As user i enter \"([^\"]*)\" in search box$")
    public void asUserIEnterInSearchBox(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^click on Search button$")
    public void clickOnSearchButton() {
    }

    @Then("^Validate the java links on tha page \"([^\"]*)\"$")
    public void validateTheJavaLinksOnThaPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
