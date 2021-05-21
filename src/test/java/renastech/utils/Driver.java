package renastech.utils;

import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class Driver {
  public static   WebDriver driver;

    public static WebDriver getDriver(){


        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        return driver;

    }

   public static void  tearDown() {
       if (driver != null) {
           driver.quit();
       }
   }


}
