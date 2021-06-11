import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingSelenium {
    public static void main(String[] args){

        //setting the driver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\klamnlo\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

        //closing the browser
        driver.close();

    }

}
