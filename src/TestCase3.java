import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        /*
        Test Case 3: Validate Automation Exercise site SUBSCRIPTION formGiven user navigates to “https://automationexercise.com/”
        Then user should see heading2 as “SUBSCRIPTION”
        And user should see and email input box with “Your email address” placeholder
        And user should see arrow submit button
        And user should see “Get the most recent updates from our site and be updated your self...”
        text under the email input box
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement heading2 = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));
        WebElement emailInputBox = driver.findElement(By.id("susbscribe_email"));
        WebElement subscribeButton = driver.findElement(By.id("subscribe"));
        WebElement textUnderEmailBox = driver.findElement(By.cssSelector("form[class=‘searchform’] p"));

        System.out.println(heading2.isDisplayed());
        System.out.println(heading2.getText());
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(emailInputBox.getAttribute("placeholder"));
        System.out.println(subscribeButton.isDisplayed());
        System.out.println(textUnderEmailBox.isDisplayed());

        Driver.quitDriver();

    }
}