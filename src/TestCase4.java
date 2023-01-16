import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        /*
        Test Case 4: Validate Automation Exercise site footerGiven user navigates to “https://automationexercise.com/”
        Then user should see “Copyright © 2021 All rights reserved” text in the footer
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement footerBottom = driver.findElement(By.cssSelector("div[class='footer-bottom'] p"));
        if(footerBottom.isDisplayed()) System.out.println("Footer-bottom PASSED");
        else System.out.println("Footer-bottom FAILED");

        if(footerBottom.getText().equals("Copyright © 2021 All rights reserved")) System.out.println("Footer text PASSED");
        else System.out.println("Footer text FAILED");

        Driver.quitDriver();

    }
}
