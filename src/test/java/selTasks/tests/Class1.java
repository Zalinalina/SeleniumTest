package selTasks.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import selTasks.utilities.WebDriverFactory;



public class Class1 {
    @Test
    public void Task1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //        2. Click the JOIN NOW button to open the registration page
        WebElement joinNow = driver.findElement(By.xpath("//a[text()='Join Now!']"));
        joinNow.click();
        WebElement title = driver.findElement(By.id("title"));
        Select titleDropdown = new Select(title);
        //        3. Select a title value from the dropdown
        titleDropdown.selectByVisibleText("Mrs");
        String expectedTitle = "Mrs";
        String actualTitle = titleDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualTitle,expectedTitle,"verify the title");


        //        4. Enter your first name and surname in the form
        WebElement firstName = driver.findElement(By.xpath("//input[@name='map(firstName)']"));//.sendKeys("Zalina"+ Keys.ENTER);
        WebElement LastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        firstName.sendKeys("Zalina");
        LastName.sendKeys("Soria");

        WebElement checkBox = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        checkBox.click();

        //        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        //        6. Submit the form by clicking the JOIN NOW button
        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Join Now!']"));
        submitButton.click();
        //        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        //        birth box
        String expected = "This field is required";
        String actual = driver.findElement(By.xpath("//label[@for='dob']")).getText();

        Assert.assertEquals(actual,expected, "Verify date of birth error message");
    }
}

