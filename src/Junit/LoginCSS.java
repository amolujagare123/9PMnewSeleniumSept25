package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSS {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        driver.findElement(By.cssSelector("input.button")).click();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername2 = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername2.sendKeys("dsdsd");

        WebElement txtPassword2 = driver.findElement(By.cssSelector("#login-password"));
        txtPassword2.sendKeys("dsdsdsd");

        driver.findElement(By.cssSelector("input.button")).click();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername3 = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver.findElement(By.cssSelector("#login-password"));
        txtPassword3.sendKeys("");

        driver.findElement(By.cssSelector("input.button")).click();



    }
}
