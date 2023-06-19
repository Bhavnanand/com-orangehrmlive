package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser ="Chrome";
    static String baseUrl =" https://opensource-demo.orangehrmlive.com/";
    static  WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
       // 1. Setup Chrome browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver= new FirefoxDriver();
        } else System.out.println("Invalid Browser");

       // 2. Open URL
        driver.get(baseUrl);
        //maximize screen
        driver.manage().window().maximize();
        //Impicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

       // 3. Print the title of the page
        driver.getTitle();
        System.out.println("Title of page :"+ driver.getTitle());
       // 4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Name of current URL  :"+driver.getCurrentUrl());
       // 5. Print the page source
        driver.getPageSource();
        System.out.println("Page Source :" +driver.getPageSource());
       // 6. Enter the email to email field
        driver.findElement(By.name("username"));
        WebElement userField =driver.findElement(By.name("username"));
        userField.sendKeys("Admin");

       // 7. Enter the password to password field
        driver.findElement(By.name("password"));
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        Thread.sleep(2000);
       // 8. Close the browser
        driver.close();
    }
}
