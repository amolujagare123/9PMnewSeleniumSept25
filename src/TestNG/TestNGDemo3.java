package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo3 {
     WebDriver driver ;
    @BeforeClass // this method execute before first test method of the class
    public  void openBrowser()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass// this method execute after last test method of the class
    public  void closeBrowser()
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
