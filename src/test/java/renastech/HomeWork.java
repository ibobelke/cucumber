package renastech;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    WebDriver driver;
    @Given("As user I want to login")
    public void as_user_i_want_to_login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When("Enter username as")
    public void enter_username_as() {
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

    }
    @Then("Enter password as")
    public void enter_password_as() {
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
      driver.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    @Then("click Check All button")
    public void click_check_all_button() {
        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();

    }
    @Then("click Delete Selected button")
    public void click_delete_selected_button() {
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

    }
    @Then("log out")
    public void log_out() {

        driver.findElement(By.id("ctl00_logout")).click();
        driver.close();

    }

}





