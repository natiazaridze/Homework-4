import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test1 {
    WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("Cute Animals");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.close();
    }
}
