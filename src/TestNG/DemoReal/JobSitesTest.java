package TestNG.DemoReal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSitesTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openNaukri() {
        driver.get("https://www.naukri.com");
        System.out.println("Opened Naukri.com");
    }

    @Test
    public void openMonster() {
        driver.get("https://www.monsterindia.com");
        System.out.println("Opened MonsterIndia.com");
    }

    @Test
    public void openShine() {
        driver.get("https://www.shine.com");
        System.out.println("Opened Shine.com");
    }

    @Test
    public void openIndeed() {
        driver.get("https://www.indeed.com");
        System.out.println("Opened Indeed.com");
    }

    @AfterClass
    public void tearDown() {
        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
