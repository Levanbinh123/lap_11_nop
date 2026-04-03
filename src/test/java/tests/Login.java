package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.DriverFactory;
public class Login {

   WebDriver driver;

   @BeforeMethod
   public void setup() {
       driver =DriverFactory.createDriver();
       driver.get("https://www.google.com");
   }

   @Test
   public void testTitle() {
       String title = driver.getTitle();
       Assert.assertTrue(title.contains("Googlesss"));
   }

   @AfterMethod
   public void tearDown() {
       driver.quit();
   }
}
