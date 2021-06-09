package renastech.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

import java.util.List;
import java.util.Map;

public class Steps extends BrowserUtils {
    @Given("The user wants to login with username as Tester and password as test")
    public void the_user_wants_to_login_with_username_as_tester_and_password_as_test()  {
       Driver.getDriver();
      driver.manage().window().maximize();
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx");
        WebElement username =driver.findElement(By.id("ctl00_MainContent_username"));
       WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
      WebElement submitButton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
      staticWait(5);
      username.sendKeys("Tester");
        staticWait(5);
      password.sendKeys("test");
        staticWait(5);
      submitButton.click();
        staticWait(5);

    }
    @When("The user wants to check all orders")
    public void the_user_wants_to_check_all_orders()  {
       driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
       staticWait(5);

    }
    @Then("The user wants to delete all selected orders")
    public void the_user_wants_to_delete_all_selected_orders() {
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
      staticWait(5);
    }
    @Then("The user wants to logout")
    public void the_user_wants_to_logout()  {
        staticWait(5);
        driver.findElement(By.id("ctl00_logout")).click();
       driver.close();
     Driver.tearDown();



    }

    @Given("The user wants to login with username as {string} and password as test {string}")
    public void the_user_wants_to_login_with_username_as_and_password_as_test(String userName, String passWord)  {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx");
        WebElement username =driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement submitButton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
       staticWait(2);
        username.sendKeys(userName);
        staticWait(2);
        password.sendKeys(passWord);
        staticWait(2);
        submitButton.click();


    }


    @When("The use want edit the first order")
    public void the_use_want_edit_the_first_order() throws InterruptedException {
    WebElement firstOrder = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[13]/input"));
    staticWait(2);
    firstOrder.click();
    }
    @Then("the user want update card number as {string}")
    public void the_user_want_update_card_number_as(String cardNam) throws InterruptedException {
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        staticWait(2);
        cardNumber.clear();
        cardNumber.sendKeys(cardNam);
        staticWait(2);

    }
    @Then("The user want update order")
    public void the_user_want_update_order() throws InterruptedException {
        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();
        staticWait(2);


    }


    @When("The user want to order")
    public void the_user_want_to_order()   {
        staticWait(2);
        driver.findElement(By.xpath("//a[.='Order']")).click();
        staticWait(2);
    }
    @Then("The user wants to product {string}")
    public void the_user_wants_to_product(String familyAlbum)  {
        WebElement selectDropdown= driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText(familyAlbum);
        staticWait(2);


    }

    @Then("The user wants to buy {string}")
    public void the_user_wants_to_buy(String product){
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(product);
      staticWait(1);
    }

    @Then("The user wants to calculate total")
    public void the_user_wants_to_calculate_total(){
        driver.findElement(By.xpath("//input[@value='Calculate']"));
        staticWait(2);

    }

    @Then("The user wants to verify total {int} and {string}")
    public void the_user_wants_to_verify_total_and(Integer quantity, String product) {

       int discount;
       WebElement totalAmount =driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal"));
       String actualTotal = totalAmount.getText();
        switch (product){
            case "familyAlbum":
              int total =  quantity*80;
                discount=total*15/100;
             total= total-discount;
                Assert.assertEquals(String.valueOf(total),actualTotal);
                staticWait(1);
             break;
            case "MyMoney":
                break;
            case "ScreenSever":
                break;
            default:

    }



        }

    @Then("The user wants to enter")
    public void the_user_wants_to_enter(Map<String,String> productTable) {
        WebElement selectDropdown= driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText(productTable.get("product"));
        System.out.println("it should print " + productTable.get("product"));
      //  wait(2);

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(productTable.get("quantity"));
        System.out.println("This Quant"+quantity);

        staticWait(1);


    }

    @Then("The user wants to enter address information")
    public void the_user_wants_to_enter_address_information(Map<String,String> addressInfo) {

        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityName  = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement stateName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipCode  = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        customerName.sendKeys(addressInfo.get("CustomerName"));
        staticWait(1);
        streetName.sendKeys(addressInfo.get("Street"));
        staticWait(1);
        cityName.sendKeys(addressInfo.get("City"));
        staticWait(1);
        stateName.sendKeys(addressInfo.get("State"));
        staticWait(1);
        zipCode.sendKeys(addressInfo.get("ZipCode"));

    }

    @Then("The user wants  to payment  information")
    public void the_user_wants_to_payment_information(Map<String,String> payInfo) {
        switch (payInfo.get("card")){
            case "visa" :
                staticWait(1);
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
                break;
            case "MasterCard":
                staticWait(1);
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
                break;
            case "American Express":
                staticWait(1);
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
                break;
            default:
        }
        //enter car number
        staticWait(2);
    WebElement cardNumber= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
     cardNumber.clear();
     cardNumber.sendKeys(payInfo.get("cardNumber"));
     // Enter expire date
        staticWait(2);
        WebElement expireDate = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        expireDate.clear();
        expireDate.sendKeys(payInfo.get("ExpireDate"));
    }
    @Then("The user wants finish the process")
    public void the_user_wants_finish_the_process() {
        staticWait(1);
        driver.findElement(By.xpath("//a[contains(text(),'Process')]")).click();
        staticWait(1);

    }

    @Then("The user wants to enter list")
    public void the_user_wants_to_enter_list(List<List<String>> listOfProduct ) {

        WebElement selectElem = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select (selectElem );
        select.deselectByVisibleText(listOfProduct.get(1).get(0));

          staticWait(2);
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(listOfProduct.get(1).get(1));

    }


//    @Given("The user wants to sign")
//    public void the_user_wants_to_sign() {
//        Driver.getDriver();
//        driver.get("http://a.testaddressbook.com/");
//        driver.findElement(By.id("sign-in")).click();
//        wait(3);
//        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
//        email.sendKeys("erk@gmail.com");
//        wait(3);
//        WebElement password =driver.findElement(By.id("session_password"));
//        password.sendKeys("erk@gmail.com");
//        wait(3);
//
//        WebElement signin= driver.findElement(By.xpath("//input[@type='submit']"));
//        signin.click();
//
//
//    }
//    @Then("The user wants to see address")
//    public void the_user_wants_to_see_address() {
//        driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
//        wait(3);
//        driver.findElement(By.xpath("//a[@class='row justify-content-center']")).click();
//
//
//    }
//    @Then("The user wants to enter new address")
//    public void the_user_wants_to_enter_new_address() {
//
//    }



}





