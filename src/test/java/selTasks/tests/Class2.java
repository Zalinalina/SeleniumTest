package selTasks.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import selTasks.pages.Page;
import selTasks.utilities.Driver;

public class Class2 {

        @Test
        public void test1(){

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");
            //  page.SearchBox.sendKeys("Selenium");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium" + Keys.ENTER);
        }


    }


