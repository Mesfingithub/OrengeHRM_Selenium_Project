package libs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestConfig {

    /**
     * 1. Web driver
     */

    public static WebDriver driver;

    @BeforeSuite
    public void testSuitSetup() throws InterruptedException {
        driver  = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

    }

    public WebElement findBy(String elementType, String element) {
        WebElement locator = null;
        if (elementType.equals("XPATH")) {
            return locator = driver.findElement(By.xpath(element));
        } else if (elementType.equals("ID")) {
            return locator = driver.findElement(By.id(element));
        }else if(elementType.equals("CSS")){
            return locator = driver.findElement(By.cssSelector(element));
        }

        return null;

    }

    @AfterSuite
    public void testCleanUp() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        driver.quit();
    }
}
