package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
        public static void main(String[] args) throws InterruptedException {
            String baseUrl = " https://opensource-demo.orangehrmlive.com/";

            //1.set the chromebrowser
            WebDriver driver = new ChromeDriver();

            //2.Open URL
            driver.get(baseUrl);
            //Maximise Screen
            driver.manage().window().maximize();
            //Implpicite  wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

            //3. Print the title of the page
            driver.getTitle();
            System.out.println("Title is :"+driver.getTitle());
            //4. Print the current url
            driver.getCurrentUrl();
            System.out.println("Current URL name :"+ driver.getCurrentUrl());

            //5. Print the page source
            driver.getPageSource();
            System.out.println("Page source :" +driver.getPageSource());

            //6. Enter the email to email field
            WebElement emailField =driver.findElement(By.name("username"));
            emailField.sendKeys("admin");


            //7. Enter the password to password field
            WebElement passwordField =driver.findElement(By.name("password"));
            passwordField.sendKeys("admin123");

            Thread.sleep(2000);
            //8. Close the browser
            driver.close();



        }
    }