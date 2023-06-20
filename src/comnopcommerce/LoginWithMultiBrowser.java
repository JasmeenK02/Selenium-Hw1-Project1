package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

public class LoginWithMultiBrowser {

    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else{
            System.out.println("Wrong Browser name");
        }

        //Open the url into the Browser
        driver.get(baseUrl);
        //Maximize browser
        driver.manage().window().maximize();
        //We give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        //Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the email field element
        WebElement emailfield = driver.findElement(By.id("Email"));

        //Type the email address to the email field element
        emailfield.sendKeys("jasmeen144@gmail.com");

        //find the password field and type the password
        driver.findElement(By.name("Password")).sendKeys("jk123");

        //close the browser
        driver.close();




    }
}
