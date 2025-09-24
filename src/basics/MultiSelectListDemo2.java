package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the web element
        WebElement cityList = driver.findElement(By.id("source_118"));

        // 2. create the object of Select class
        Select selText = new Select(cityList);

        // 3. select the option
        selText.selectByIndex(1);
        selText.selectByIndex(2);
        selText.selectByIndex(3);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


// D:\study\9PMnewSeleniumSept25\src\basics.MultiSelectListDemo.java

        // src/basics.MultiSelectListDemo.java


        // 1. find the web element
        WebElement citySelectedList = driver.findElement(By.id("fld_118"));

        // 2. create the object of Select class
        Select selectedText = new Select(citySelectedList);

        // 3. select the option
        selectedText.selectByIndex(1);
        selectedText.selectByIndex(2);

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();
    }
}
