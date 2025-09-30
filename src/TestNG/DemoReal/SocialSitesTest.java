package TestNG.DemoReal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSitesTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openFacebook() {
        driver.get("https://www.facebook.com");
        System.out.println("Opened Facebook.com");
    }

    @Test
    public void openTwitter() {
        driver.get("https://www.twitter.com");  // or https://x.com
        System.out.println("Opened Twitter.com");
    }

    @Test
    public void openInstagram() {
        driver.get("https://www.instagram.com");
        System.out.println("Opened Instagram.com");
    }

    @Test
    public void openLinkedIn() {
        driver.get("https://www.linkedin.com");
        System.out.println("Opened LinkedIn.com");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

