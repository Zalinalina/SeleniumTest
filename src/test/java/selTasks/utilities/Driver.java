package selTasks.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    creating the private constructor so this class' object is not reachable from outside
     */
    private Driver() {
    }

    /*
    making our driver instance so that it is not reachable from outside of the class
    We make it static, we want to run it before everything else and we also we
    will use it in stating method
     */


    private static WebDriver driver;

    public static WebDriver getDriver() {

       /*
       creating reusable utility method  that will return same driver
       instance everytime we call it
        */
        if (driver == null) {

           /*
           we read our browser type from configuration.properties file using
           .getProperty method we creating ConfigurationReader class
            */

            String browseType = ConfigurationReader.getProperty("browser");


           /*
           depending on the browser type our switch statement will
           determin to open specific type of browser/driver
            */
            switch (browseType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                // case "firefox":
                //    WebDriver.firefoxDriver().setUp();
                //   driver = FirefoxDriver();
                //    driver.manage().window().maximize();
                //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //   break;

               /*
               Same driver instance will be returned every time we call Driver.getDriver(); method
                */


            }

        }
        return driver;
    }

    /*
    this method makes sure we have some formof
     driver session or driver id has either null or not null it must exist
     */
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
