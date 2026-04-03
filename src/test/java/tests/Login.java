package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.DriverFactory;
public class Login {

   WebDriver driver;

@BeforeMethod
@Parameters("browser")
public void setup(@Optional("chrome") String browser) {
driver = DriverFactory.createDriver(browser);
driver.get("https://www.google.com"); // THÊM DÒNG NÀY
}


   @Test
   public void testTitle() {
       String title = driver.getTitle();
       Assert.assertTrue(title.contains("Google"));
   }

   @AfterMethod
   public void tearDown() {
       driver.quit();
   }
}
