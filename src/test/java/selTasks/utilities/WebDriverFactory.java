package selTasks.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"


public class WebDriverFactory {


    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else  if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
                System.out.println("Give browser type does not exist. Driver = null");
            return null;

        }

    }

    }

// String expectedTitle = "Google";
//        String actualTitle = driver.getTitle();
//
//        if(actualTitle.equals(expectedTitle)){
//            System.out.println("Title verification PASSED!");
//        }else{
//            System.out.println("Title verification FAILED!!!");