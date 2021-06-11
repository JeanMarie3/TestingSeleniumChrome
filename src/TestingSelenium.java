import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class TestingSelenium {
    public static void main(String[] args) throws InterruptedException {

        //setting the driver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\klamnlo\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(10);

        //driver.wait(10);
        //Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        //closing the browser
        driver.close();

    }

}
