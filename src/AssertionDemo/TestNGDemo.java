package AssertionDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public  void myTest1() {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://stock.scriptinglogic.in/");
    
            WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
            txtUsername.sendKeys("admin");

            WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
            txtPassword.sendKeys("admin1");

            driver.findElement(By.cssSelector("input.button")).click();


         /*   String expected = "https://stock.scriptinglogic.in/dashboard.php";
            String actual = driver.31getCurrentUrl();
*/

      /*  String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("actual="+actual);
            System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"This is not a dashboard");


    }
    @Test
    public  void myTest2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        driver.findElement(By.cssSelector("input.button")).click();

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"Incorrect or no error message");



    }

    @Test
    public  void myTest3() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("input#login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        driver.findElement(By.cssSelector("input.button")).click();

    }
    }
