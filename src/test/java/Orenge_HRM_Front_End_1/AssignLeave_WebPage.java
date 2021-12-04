package Orenge_HRM_Front_End_1;

import libs.Locators_AssignLeave_2;
import libs.TestConfig;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.ref.Cleaner;
import java.security.Key;

public class AssignLeave_WebPage extends TestConfig{
    @BeforeTest
    public void assignLeave(){
        findBy("XPATH", Locators_AssignLeave_2.AssignLeaveLink).click();

    }

    @Test
    public void validateAssignLeavePage() throws InterruptedException {

        //Selecting Employee Name
        findBy("XPATH",Locators_AssignLeave_2.EmployeeName).sendKeys("A");

        findBy("XPATH",Locators_AssignLeave_2.EmployeeName).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);

        findBy("XPATH",Locators_AssignLeave_2.EmployeeName).sendKeys(Keys.ENTER);

        //Selecting Leave Type
        WebElement element = findBy("XPATH",Locators_AssignLeave_2.LeaveType);
        Select dropdown = new Select(element);
        dropdown.selectByIndex(2);
        Thread.sleep(3000);

        findBy("XPATH",Locators_AssignLeave_2.FromDateTab).click();
        findBy("XPATH",Locators_AssignLeave_2.FromDateYear).click();
        findBy("XPATH",Locators_AssignLeave_2.FromDateYear).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        findBy("XPATH",Locators_AssignLeave_2.FromDateMonth).click();
        findBy("XPATH",Locators_AssignLeave_2.FromDateMonth).sendKeys(Keys.ARROW_DOWN);
        findBy("XPATH",Locators_AssignLeave_2.FromDateMonth).sendKeys(Keys.ENTER);
        findBy("XPATH",Locators_AssignLeave_2.FromDateDay).click();
        Thread.sleep(2000);
        findBy("XPATH",Locators_AssignLeave_2.ToDateTab).click();
        findBy("XPATH",Locators_AssignLeave_2.ToDateYear).click();
        findBy("XPATH",Locators_AssignLeave_2.ToDateYear).sendKeys(Keys.ARROW_DOWN);
        findBy("XPATH",Locators_AssignLeave_2.ToDateYear).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        findBy("XPATH",Locators_AssignLeave_2.ToDateMonth).click();
        findBy("XPATH",Locators_AssignLeave_2.ToDateMonth).sendKeys(Keys.ENTER);
        findBy("XPATH",Locators_AssignLeave_2.ToDateDay).click();
        Thread.sleep(2000);
        findBy("XPATH",Locators_AssignLeave_2.PartialDays).click();
        findBy("XPATH",Locators_AssignLeave_2.PartialDays).sendKeys(Keys.ARROW_DOWN);
        findBy("XPATH",Locators_AssignLeave_2.PartialDays).sendKeys(Keys.ARROW_DOWN);
        findBy("XPATH",Locators_AssignLeave_2.PartialDays).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        findBy("XPATH",Locators_AssignLeave_2.Comment).sendKeys("Have a nice Vacation");
        findBy("XPATH",Locators_AssignLeave_2.Assign).click();
        Thread.sleep(2000);
        findBy("XPATH",Locators_AssignLeave_2.Okey).click();

  }
    private void cleanUp() {
        cleanUp();
    }
}
