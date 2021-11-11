package selTasks.TASK;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class INTRVIEWTASK {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame);
        WebElement button = driver.findElement(By.xpath("//body//button[text()='Try it']"));
        button.click();

        {



        }
    }
}
