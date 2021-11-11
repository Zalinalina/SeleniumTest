package selTasks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selTasks.utilities.Driver;

public class ShoppingPage {
    public ShoppingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
         }

        @FindBy(id = "user-name")
        public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement login;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backpack;

    }

