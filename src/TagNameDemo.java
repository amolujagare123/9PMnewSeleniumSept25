import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/4fields.html");

      /*  WebElement wb = driver.findElement(By.tagName("input"));

        wb.sendKeys("xyz");*/

        List<WebElement> wbList = driver.findElements(By.tagName("input"));

        Thread.sleep(4000);
        System.out.println(wbList.size());
        wbList.get(0).sendKeys("Disha");
        wbList.get(1).sendKeys("Disha@gmail.com");
        wbList.get(2).sendKeys("43434343");
        wbList.get(3).sendKeys("pune");




        /*
        driver.findElement(By.id("name")).sendKeys("Ranbeer");
        driver.findElement(By.id("email")).sendKeys("ranbeer@gmail.com");
        driver.findElement(By.id("contact")).sendKeys("34343434");
        driver.findElement(By.id("city")).sendKeys("Pune");*/

        //Thread.sleep(4000);

       // driver.findElement(By.tagName("button")).click();

    }
}
