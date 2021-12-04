package Orenge_HRM_Front_End_1;

import libs.Locators_Leave_Webpage_3;
import libs.TestConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Leave_webpage extends TestConfig {

    @BeforeTest
    public void LeaveWebpage(){
        findBy("XPATH", Locators_Leave_Webpage_3.LeaveTabLink).click();
        findBy("XPATH",Locators_Leave_Webpage_3.MyLeaveLink).click();
    }

    @Test
    public void calendar() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('calFromDate').value='2021-11-30'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('calToDate').value='2021-12-31'");

    }
    @Test
    public void LeaveWebpageCheckList() throws InterruptedException {
        findBy("XPATH",Locators_Leave_Webpage_3.AllCheckBox).click();
        Thread.sleep(2000);
        findBy("XPATH",Locators_Leave_Webpage_3.SearchTab).click();
        Thread.sleep(2000);
    }


    private void cleanUp() {
        cleanUp();
    }
}
