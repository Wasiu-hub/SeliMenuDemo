import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MenuDemo {

    @Test
    public void openWomensMenu(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // for Safari
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
}
