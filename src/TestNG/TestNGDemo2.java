package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {
    WebDriver driver ;
    @BeforeMethod // this method execute before every test method
    public void openBrowser()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterMethod// this method execute after every test method
    public void closeBrowser()
    {
       driver.close();
    }

    @Test
    public  void myTest1() {


            driver.get("https://stock.scriptinglogic.in/");
    
            WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
            txtUsername.sendKeys("admin");

            WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
            txtPassword.sendKeys("admin");

            driver.findElement(By.cssSelector("input.button")).click();

        }
    @Test
    public  void myTest2() {


        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("ssdsd");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("sdsdsd");

        driver.findElement(By.cssSelector("input.button")).click();

    }

    @Test
    public  void myTest3() {


        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        driver.findElement(By.cssSelector("input.button")).click();

    }
    }
