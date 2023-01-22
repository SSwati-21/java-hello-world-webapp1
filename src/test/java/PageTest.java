import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PageTest {
	WebDriver driver;
	
    @BeforeTest
    public void beforetest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Swati\\JavaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void login() throws InterruptedException {
	driver.get("http://localhost:9090/java-hello-world");	        
	Thread.sleep(30);
        Assert.assertEquals(driver.getTitle(),"Hello World");

    }
    
    @AfterTest
    public void aftertest(){
            driver.quit();
    }
}
