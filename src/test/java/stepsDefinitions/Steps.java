package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("a user is on google.com page")
    public void userIsOnGoogle()
    {
        driver.get("https://google.com");
    }

    @When("the user types sda in google input search")
    public void step1()
    {
        System.out.println(">>> Wykonanie korku 1");
    }

    @When("the user clicks on search button")
    public void step2()
    {
        System.out.println(">>> Wykonanie korku 2");
    }

    @Then("the user should see sdacademy on search results")
    public void sprawdzenie()
    {

    }

    @After
    public void tearDown()
    {
        driver.quit();
        driver = null;
    }
}
