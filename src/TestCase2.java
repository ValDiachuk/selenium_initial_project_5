import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.awt.*;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        /*
        Test Case 2: Validate Automation Exercise site header itemsGiven user navigates to “https://automationexercise.com/”
        Then validate all below header items are displayed and enabled and their text is as below
        Home
        Products
        Cart
        Signup / Login
        Test Cases
        API Testing
        Video Tutorials
        Contact us
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        List<WebElement> elements = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        String[] text = {" Home"," Products", " Signup / Login", " Test Cases", " API Testing", " Video Tutorials", " Contact us"};

        for (int i = 0; i < elements.size(); i++) {

            System.out.println(elements.get(i).getText().equals(text[i]));
            System.out.println(elements.get(i).isDisplayed());
            System.out.println(elements.get(i).isEnabled());
            System.out.println(elements.get(i).getText());
        }

        Driver.quitDriver();
    }
}
