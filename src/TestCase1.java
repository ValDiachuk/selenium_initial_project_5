import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        /*
        Test Case 1: Validate Automation Exercise site logoGiven user navigates to “https://automationexercise.com/”
        Then user should see logo on top-left
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement logo =  driver.findElement(By.cssSelector(".logo img"));

       if(logo.isDisplayed()) System.out.println("Logo PASSED");
       else System.out.println("Logo FAILED");

       Driver.quitDriver();
    }
}
