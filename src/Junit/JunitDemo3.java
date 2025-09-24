package Junit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo3 {
  static   WebDriver driver ;
    @BeforeClass // this method execute before first test method of the class
    public static void openBrowser()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass// this method execute after last test method of the class
    public static void closeBrowser()
    {
       driver.close();
    }

    @Test
    public  void myTest1() throws InterruptedException {
        Thread.sleep(4000);

            driver.get("https://stock.scriptinglogic.in/");
    
            WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
            txtUsername.sendKeys("admin");

            WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
            txtPassword.sendKeys("admin");

           // driver.findElement(By.cssSelector("input.button")).click();

        }
    @Test
    public  void myTest2() throws InterruptedException {

        Thread.sleep(4000);
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("ssdsd");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("sdsdsd");

       // driver.findElement(By.cssSelector("input.button")).click();

    }

    @Test
    public  void myTest3() throws InterruptedException {

        Thread.sleep(4000);
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

      //  driver.findElement(By.cssSelector("input.button")).click();

    }
    }
