package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlighBookingPage {


public FlighBookingPage(WebDriver driver){
    PageFactory.initElements(driver , this);
}
    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']")
    public WebElement tab_flight;

    @FindBy(xpath = "//label[@id='flight-type-multi-dest-label-hp-flight']")
    public WebElement lbl_multicity;

    @FindBy(xpath = "//a[@href='#flightlegs-fieldset-hp-flight']")
    public  WebElement lnk_addflight;


    @FindBy(xpath = "//input[@class='clear-btn-input gcw-storeable text gcw-origin gcw-required gcw-distinct-locations']")
    public  WebElement fromcity1;
    @FindBy(xpath = "//input[@class='clear-btn-input gcw-storeable text gcw-destination gcw-required gcw-distinct-locations']")
    public  WebElement tocity1;
    @FindBy(xpath = "//input[@id='flight-departing-single-hp-flight']")
    public  WebElement date1;

    @FindBy(xpath ="//select[@id='flight-adults-hp-flight']")
    public  WebElement selctadult;
    @FindBy(xpath ="//select[@id='flight-children-hp-flight']")
    public  WebElement selectchild;

    @FindBy(xpath ="//select[@id='flight-age-select-1-hp-flight']")
    public  WebElement child1age;
    @FindBy(xpath ="//select[@id='flight-age-select-2-hp-flight']")
    public  WebElement child2age;


    @FindBy(xpath = "//fieldset[@id='flightlegs-list-fieldset-2-hp-flight']//input[@class='clear-btn-input gcw-storeable text gcw-origin multidest-field']")
    public  WebElement fromcity2;

    @FindBy(xpath = "//fieldset[@id='flightlegs-list-fieldset-2-hp-flight']//input[@class='clear-btn-input gcw-storeable text gcw-destination multidest-field']")
    public  WebElement tocity2;


    @FindBy(xpath = "//input[@id='flight-2-departing-hp-flight']")
    public  WebElement date2;

    @FindBy(xpath = "//fieldset[@id='flightlegs-list-fieldset-3-hp-flight']//input[@class='clear-btn-input gcw-storeable text gcw-origin multidest-field']")
    public  WebElement fromcity3;

    @FindBy(xpath = "//fieldset[@id='flightlegs-list-fieldset-3-hp-flight']//input[@class='clear-btn-input gcw-storeable text gcw-destination multidest-field']")
    public  WebElement tocity3;

    @FindBy(xpath = "//input[@id='flight-3-departing-hp-flight']")
    public  WebElement date3;

    @FindBy(xpath = "//span[contains(text(),'Search')]/parent::button[@class='btn-primary btn-action gcw-submit ']")
    public WebElement btnsubmit;



    public WebDriver Openbrowserurl(WebDriver driver, String browsername,String url ){

        switch (browsername){
            case "chrome":
                System.setProperty("webdriver.chrome.driver" ,"Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(url);
                break;
            case "ie"   :
                System.setProperty("webdriver.ie.driver" ,"Drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.get(url);
                break;

            default:
                break;
        }
        return driver;


    }

    public  void SelectTab(){
        tab_flight.click();
    }

    public void SelectMulticity(){
        lbl_multicity.click();
        lnk_addflight.click();

    }

    public void firstjourney(String CityA, String CityB){
        fromcity1.sendKeys(CityA);
        tocity1.sendKeys(CityB);
    }

    public void  firstjourneydt(String jdate1){
        date1.sendKeys(jdate1);
    }

    public void passengers(String adults,String childs) throws InterruptedException {
        Select sel = new Select(selctadult);
        sel.selectByValue(adults);

        Select child = new Select(selectchild);
        child.selectByValue(childs.split(":")[0]);

        Thread.sleep(3000);
        String ages[]= childs.split(":")[1].split(",");
        Select child1 = new Select(child1age);
        child1.selectByValue(ages[0]);
        Select child2 = new Select(child2age);
        child2.selectByValue(ages[1]);

    }


    public void secondjourney(String CityB, String CityC){
        fromcity2.sendKeys(CityB);
        tocity2.sendKeys(CityC);
    }

    public void  secondjourneydt(String jdate2){
        date2.sendKeys(jdate2);
    }

    public void thirdjourney(String CityC, String CityA){
        fromcity3.sendKeys(CityC);
        tocity3.sendKeys(CityA);
    }

    public void  thirdjourneydt(String jdate3){
        date3.sendKeys(jdate3);
    }
    public void Submit(){
        btnsubmit.click();
    }
}
