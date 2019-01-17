package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public class TestChromeStepDef {

        WebDriver driver;
        @Given("^Browser open$")

        public void step1() {
            System.setProperty("webdriver.chrome.driver", "C:\\JavaWorkSpace\\ChromeDirver Download\\chromedriver.exe");

            driver = new ChromeDriver();
            System.out.println("\nChrome Browser Open");
        }

        @When("^google page open$")

        public void step2() {
            driver.get("http://www.google.com");
            System.out.println("\nGoogle page Open");
        }

        @Then("^google page close$")
        public void step3(){
            driver.close();
            System.out.println("\nGoogle page close");
        }

    }

