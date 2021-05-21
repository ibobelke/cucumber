package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;

public class Addresses extends BrowserUtils  {

    public Addresses (){

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "address_first_name")
    private WebElement firstName;

    @FindBy(id = "address_last_name")
    private WebElement LastName ;

    @FindBy(id = "address_street_address")
    private WebElement address1;

    @FindBy(id = "address_secondary_address")
    private WebElement address2;

    @FindBy(id = "address_city")
    private WebElement city;

    @FindBy(id = "address_state")
    private WebElement state;

    @FindBy(id = "address_zip_code")
    private WebElement zipcode;

    @FindBy(id = "address_country_canada")
    private WebElement country;

    @FindBy(id = "address_birthday")
    private WebElement birthday;

    @FindBy(id = "address_age")
    private WebElement age;

    @FindBy(id = "address_website")
    private WebElement Website;

    @FindBy(id = "address_phone")
    private WebElement phone;

    @FindBy(id = "address_interest_dance")
    private WebElement common;

    @FindBy(id = "address_note")
    private WebElement note;

  //  button= //input[@name='commit']



    public void setState(String stateName){
        staticWait(1);
        Select select = new Select(state);
        select.selectByVisibleText(stateName);


    }
    public void setZipcode(String zipcodeName){
        staticWait(5);
        zipcode.sendKeys(zipcodeName);

    }
    public void setCountry (String countryName){

        clickAndWait(country);
//        staticWait(2);
//        country.click();
    }
    public void setBirthday (String birthdayDay){
        staticWait(2);
        birthday.sendKeys(birthdayDay);
    }
    public void setAge (String age1){
        staticWait(2);
        age.sendKeys(age1);


    }



public void setFirstName(String name){
    staticWait(1);
    firstName.sendKeys(name);


}
public void setLastName(String lastNme)  {

    staticWait(1);
    LastName.sendKeys(lastNme);
}

public void setAddress1(String address){
    staticWait(1);
    address1.sendKeys(address);

}
public void setAddress2(String address){

    staticWait(1);
    address2.sendKeys(address);
}

public void setCity(String cityName){

    staticWait(1);
    city.sendKeys(cityName);


}

@FindBy(xpath = "//input[@name='commit']")
    private WebElement submitButton;
    public void clickSubmitButton(){
        staticWait(1);
        submitButton.click();
    }
//public void setState(String stateName){
//    wait(2);
//    Select select = new Select(state);
//    select.selectByVisibleText(stateName);
//
//
//}
//public void setZipcode(String zipcodeName){
//    wait(1);
//    zipcode.sendKeys(zipcodeName);
//
//}
//public void setCountry (String countryName){
//    wait(2);
//    country.click();
//}
//public void setBirthday (String birthdayDay){
//    wait(2);
//    birthday.sendKeys(birthdayDay);
//}
//public void setAge (String age1){
//    wait(2);
//    age.sendKeys(age1);
//
//}




}
