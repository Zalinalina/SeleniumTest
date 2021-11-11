package selTasks.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selTasks.pages.ShoppingPage;
import selTasks.utilities.Driver;
import selTasks.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Shopping {
    //1.    Create an automated functional test that verifies the basic shopping cart and checkout workflow:
    WebDriver driver;
    @BeforeClass
    public void setupMethod() throws InterruptedException {
        Driver.getDriver().get("https://www.Saucedemo.com");
        //b.    Sign in as the standard_user
    }
    @Test
            public void test1(){
        ShoppingPage shoppingPage = new ShoppingPage();
        shoppingPage.username.sendKeys("standard_suer");
        shoppingPage.password.sendKeys("secret_sauce");
        shoppingPage.login.click();

        //i.    Store the credentials in a configuration file
        //c.    Add one of the items for sale to the shopping cart
        shoppingPage.backpack.click();

        //d.    View the shopping cart
        //e.    Verify that the correct item is in the shopping cart
        //f.    Choose to Checkout via the shopping cart
        //g.    Enter the required information (first name, last name, zipcode)
        //h.    Continue to the next step in the workflow
        //i.    On the Checkout Overview page, verify that the correct item is displayed
        //j.    Select to Finish the checkout flow
        //k.    Verify that the checkout process has completed successfully
        //2.    The tests should be created using the Cucumber framework
        //a.    Include all gherkin, step definitions and page objects when you to push to your repo
        //THINGS WE ARE LOOKING FOR
        //1.    Well formatted and organized code
        //2.    Well written an easy to understand Gherkin statements
        //BONUS POINTS
        //1.    Employ to Page Object pattern to create and organize your tests
        //2.    Favor class names to locate elements where possible
        //3.    Use rspec to perform assertions
    }
}