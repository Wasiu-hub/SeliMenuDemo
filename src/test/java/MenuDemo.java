import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MenuDemo {

    @Test
    public void openWomensMenu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // line sol
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement womenMenu = driver.findElement(By.xpath("//*[@id=\"meganav-link-2\"]/div"));

        Actions action = new Actions(driver);
        action.moveToElement(womenMenu).perform();
//        Thread.sleep(2000); // test passed with this and line sol above
        driver.findElement(By.xpath("//*[@id=\"catalogue\"]/div[3]/div[1]/ul/li[2]/a/div/span")).click();

    }
}


