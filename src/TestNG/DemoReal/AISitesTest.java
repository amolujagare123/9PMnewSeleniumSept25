package TestNG.DemoReal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISitesTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openOpenAI() {
        driver.get("https://openai.com");
        System.out.println("Opened OpenAI.com");
    }

    @Test
    public void openGoogleAI() {
        driver.get("https://ai.google");
        System.out.println("Opened Google AI");
    }

    @Test
    public void openHuggingFace() {
        driver.get("https://huggingface.co");
        System.out.println("Opened HuggingFace.co");
    }

    @Test
    public void openAnthropic() {
        driver.get("https://www.anthropic.com");
        System.out.println("Opened Anthropic.com");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
