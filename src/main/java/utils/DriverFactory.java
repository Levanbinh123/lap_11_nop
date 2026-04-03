/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverFactory {

   public static WebDriver createDriver() {
       boolean isCI = System.getenv("CI") != null;

       ChromeOptions options = new ChromeOptions();

       if (isCI) {
           options.addArguments("--headless=new");
           options.addArguments("--no-sandbox");
           options.addArguments("--disable-dev-shm-usage");
           options.addArguments("--window-size=1920,1080");
       } else {
           options.addArguments("--start-maximized");
       }

       WebDriverManager.chromedriver().setup();
       return new ChromeDriver(options);
   }
}
