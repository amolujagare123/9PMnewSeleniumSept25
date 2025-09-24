package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitForm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/4fields.html");

        driver.findElement(By.id("name")).sendKeys("Ranbeer");
        driver.findElement(By.id("email")).sendKeys("ranbeer@gmail.com");
        driver.findElement(By.id("contact")).sendKeys("34343434");
        driver.findElement(By.id("city")).sendKeys("Pune");

        Thread.sleep(4000);

        driver.findElement(By.tagName("button")).click();

    }
}


