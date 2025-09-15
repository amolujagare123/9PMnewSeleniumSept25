import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");

        // 1. find the web element
        WebElement drpList = driver.findElement(By.name("fromPort"));

        // 2. create the object of Select class
        Select selText = new Select(drpList);


        Thread.sleep(4000);
        // 3. select the option

   //     selText.selectByVisibleText("Boston");

   //     selText.selectByValue("San Diego");
        selText.selectByIndex(3);

    }
}
