package selTasks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selTasks.utilities.Driver;

public class Page {
   public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
   }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement SearchBox;
}



