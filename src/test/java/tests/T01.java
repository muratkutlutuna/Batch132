package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoGuru99;
import utilities.Driver;

public class T01 {
    @Test
    public void test(){
        Driver.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        DemoGuru99 dg = new DemoGuru99();
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dg.bankButton, dg.debitAccountArea)
                .dragAndDrop(dg.salesButton, dg.creditAccountArea)
                .dragAndDrop(dg.first5000Button, dg.debitAmountArea)
                .dragAndDrop(dg.second5000Button, dg.creditAmountArea)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Assert.assertTrue(dg.perfectButton.isDisplayed());
        Driver.closeDriver();
    }
}
