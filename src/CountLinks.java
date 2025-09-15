import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CountLinks {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");


    //    Thread.sleep(10000);

        // count the total links


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> wbList = driver.findElements(By.tagName("a"));

        System.out.println("Total web links = "+wbList.size());

    }
}
