package Orenge_HRM_Front_End_1;
import libs.Locators_AssignLeave_2;
import libs.TestConfig;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Test_OrangeHomePage_Login extends TestConfig {


    @Test
    public void TestHomePage(){


        try{

            String dashBoardURL = driver.getCurrentUrl();
            String expectedDashBoardURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
            assertEquals(dashBoardURL,expectedDashBoardURL);
//      String expectedURL = driver.findElement(By.xpath("//*[@id='menu_dashboard_index']")).getText();
//      assertEquals(expectedURL,"Dashboard");
        }catch (WebDriverException e){
            System.out.println(e.getMessage());
        }

    }


}
