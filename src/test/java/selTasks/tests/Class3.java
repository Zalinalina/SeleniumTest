package selTasks.tests;

import org.testng.annotations.Test;
import selTasks.utilities.Driver;

public class Class3 {
    @Test
    public void use_driver() {
        //  Driver.getDriver() === driver
        Driver.getDriver().get("");
    }
}
