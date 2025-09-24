package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo2 {
    WebDriver driver ;
    @Before // this method execute before every test method
    public void openBrowser()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @After// this method execute after every test method
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
