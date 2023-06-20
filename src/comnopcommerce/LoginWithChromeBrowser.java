package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Close the browser.
 */
public class LoginWithChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // We are launching the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the url into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        //Print the current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type the email address to the email field element
        emailField.sendKeys("jasmeen144kaur@gmail.com");

        // find the password field and type the password
        driver.findElement(By.name("Password")).sendKeys("jk123");

        //close the browser
        driver.close();



    }
}
