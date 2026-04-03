/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class DriverFactory {


public static WebDriver createDriver(String browser) {
boolean isCI = System.getenv("CI") != null;

return switch (browser.toLowerCase()) {
case "firefox" -> createFirefoxDriver(isCI);
default -> createChromeDriver(isCI);
};
}

private static WebDriver createChromeDriver(boolean headless) {
ChromeOptions options = new ChromeOptions();

if (headless) {
options.addArguments("--headless=new");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--window-size=1920,1080");
}

WebDriverManager.chromedriver().setup();
return new ChromeDriver(options);
}


private static WebDriver createFirefoxDriver(boolean headless) {
    FirefoxOptions options = new FirefoxOptions();

if (headless) {
options.addArguments("-headless");
}

WebDriverManager.firefoxdriver().setup();
return new FirefoxDriver(options);
}

}




