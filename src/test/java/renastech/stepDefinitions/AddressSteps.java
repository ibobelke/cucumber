package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import renastech.pages.Addresses;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.List;
import java.util.Map;

public class AddressSteps extends BrowserUtils {

    @Given("The user wants to sign")
    public void the_user_wants_to_sign() {
        Driver.getDriver();
        driver.manage().window().maximize();
         driver.get("http://a.testaddressbook.com/");
        driver.findElement(By.id("sign-in")).click();
        staticWait(3);
      //  WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
      //  email.sendKeys("erk@gmail.com");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(ConfigurationsReader.getProperties("username"));
        staticWait(3);
       // WebElement password =driver.findElement(By.id("session_password"));
       // password.sendKeys("erk@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys(ConfigurationsReader.getProperties("password"));
        staticWait(3);

        WebElement signin= driver.findElement(By.xpath("//input[@type='submit']"));
        signin.click();


    }
    @Then("The user wants to see address")
    public void the_user_wants_to_see_address() {
        driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
        staticWait(3);



    }
    @Then("The user wants to enter new address")
    public void the_user_wants_to_enter_new_address() {
        driver.findElement(By.xpath("//a[@class='row justify-content-center']")).click();

    }

    @Then("The user wants to enter addresses details")
    public void the_user_wants_to_enter_addresses_details(Map<String,String>addressInfo) {
        Addresses addresses = new Addresses();
   addresses.setFirstName(addressInfo.get("FistName"));
   addresses.setLastName(addressInfo.get("LastName"));
   addresses.setAddress1(addressInfo.get("Address1"));
   addresses.setAddress2(addressInfo.get("Address2"));
   addresses.setCity(addressInfo.get("City"));
   addresses.setState(addressInfo.get("State"));
   addresses.setZipcode(addressInfo.get("ZipCode"));
   addresses.setCountry(addressInfo.get("Country"));
   addresses.setBirthday(addressInfo.get("Birthday"));
   addresses.setAge(addressInfo.get("Age"));

    }
    @Then("The user wants to create an address")
    public void the_user_wants_to_create_an_address() {
        Addresses addresses = new Addresses();
        addresses.clickSubmitButton();

    }

    @Then("The user wants to enter addresses details as list")
    public void the_user_wants_to_enter_addresses_details_as_list(List<List<String>> listOfAddress) {


        Addresses addresses= new Addresses();
        addresses.setFirstName(listOfAddress.get(1).get(0));
        addresses.setLastName(listOfAddress.get(1).get(1));
        addresses.setAddress1(listOfAddress.get(1).get(2));
        addresses.setAddress2(listOfAddress.get(1).get(3));
        addresses.setCity(listOfAddress.get(1).get(4));
        addresses.setState(listOfAddress.get(1).get(5));
        addresses.setZipcode(listOfAddress.get(1).get(6));
        addresses.setCountry(listOfAddress.get(1).get(7));
        addresses.setBirthday(listOfAddress.get(1).get(8));
        addresses.setAge(listOfAddress.get(1).get(9));


    }


}
