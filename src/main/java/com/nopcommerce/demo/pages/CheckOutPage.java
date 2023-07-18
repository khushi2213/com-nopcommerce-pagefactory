package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignInPageTitleLocator;

    @CacheLookup
    @FindBy(css = ".button-1.checkout-as-guest-button")
    WebElement checkoutAsGuestButtonLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_FirstName")
    WebElement firstNameFieldLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_LastName")
    WebElement lastNameFieldLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Email")
    WebElement emailFieldLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_CountryId")
    WebElement countryDropDownLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_City")
    WebElement cityFieldLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement addressFieldLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_ZipPostalCode")
    WebElement postCodeFieldLocator;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_PhoneNumber")
    WebElement phoneNumberFieldLocator;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonLocator;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement ButtonRegister;

    /* By welcomeSignInPageTitleLocator = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
     By checkoutAsGuestButtonLocator = By.cssSelector(".button-1.checkout-as-guest-button");
     By firstNameFieldLocator = By.cssSelector("#BillingNewAddress_FirstName");
     By lastNameFieldLocator = By.cssSelector("#BillingNewAddress_LastName");
     By emailFieldLocator = By.cssSelector("#BillingNewAddress_Email");
     By countryDropDownLocator = By.cssSelector("#BillingNewAddress_CountryId");
     By cityFieldLocator = By.cssSelector("#BillingNewAddress_City");
     By addressFieldLocator = By.cssSelector("#BillingNewAddress_Address1");
     By postCodeFieldLocator = By.cssSelector("#BillingNewAddress_ZipPostalCode");
     By phoneNumberFieldLocator = By.cssSelector("#BillingNewAddress_PhoneNumber");
     By continueButtonLocator = By.name("save");
     //By ButtonRegister = By.cssSelector(".button-1.register-button");
     By ButtonRegister = By.linkText("Register");
 */
    public String getTextFromWelcomeText() {
        CustomListeners.test.log(Status.PASS,"Verify welcome text"+welcomeSignInPageTitleLocator);
        Reporter.log("Verify welcome text"+welcomeSignInPageTitleLocator.toString());
        return welcomeSignInPageTitleLocator.getText();
    }

    public void clickCheckOut() {
        clickOnElement(checkoutAsGuestButtonLocator);
        CustomListeners.test.log(Status.PASS,"clickOnCheckOut"+checkoutAsGuestButtonLocator);
        Reporter.log("clickCheckOut"+checkoutAsGuestButtonLocator.toString());
    }

    public void firstName(String fName) {
        sendTextToElement(firstNameFieldLocator, fName);
        CustomListeners.test.log(Status.PASS,"enter firstName"+firstNameFieldLocator);
        Reporter.log("enter firstName"+firstNameFieldLocator.toString());
    }

    public void lastName(String lName) {
        sendTextToElement(lastNameFieldLocator, lName);
        CustomListeners.test.log(Status.PASS,"enter lastName"+lastNameFieldLocator);
        Reporter.log("enter Lastname"+lastNameFieldLocator.toString());
    }

    public void email(String email) {
        sendTextToElement(emailFieldLocator, email);
        CustomListeners.test.log(Status.PASS,"enter email"+emailFieldLocator);
        Reporter.log("enter email"+emailFieldLocator.toString());
    }

    public void selectCountryFromDropDown() {
        selectByIndexFromDropDown(countryDropDownLocator, 2);
        CustomListeners.test.log(Status.PASS,"select countrydropdown"+countryDropDownLocator);
        Reporter.log("selectcountrydropdown"+countryDropDownLocator.toString());
    }

    public void enterCity(String cityName) {
        sendTextToElement(cityFieldLocator, cityName);
        CustomListeners.test.log(Status.PASS,"enter city"+cityFieldLocator);
        Reporter.log("enter city"+cityFieldLocator.toString());
    }

    public void enterAddress(String address) {
        sendTextToElement(addressFieldLocator, address);
        CustomListeners.test.log(Status.PASS,"enter Address"+addressFieldLocator);
        Reporter.log("enter Address"+addressFieldLocator.toString());
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeFieldLocator, postcode);
        CustomListeners.test.log(Status.PASS,"enterPostcode"+postCodeFieldLocator);
        Reporter.log("enter Postcode"+postCodeFieldLocator.toString());
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberFieldLocator, phoneNumber);
        CustomListeners.test.log(Status.PASS,"enter phonenumber"+postCodeFieldLocator);
        Reporter.log("enter phone number"+postCodeFieldLocator.toString());
    }

    public void clickContinue() {
        clickOnElement(continueButtonLocator);
        CustomListeners.test.log(Status.PASS,"clickOnContinue"+continueButtonLocator);
        Reporter.log("clickOnContinue"+continueButtonLocator.toString());
    }

    public void clickOnButtonRegister() throws InterruptedException {
        clickOnElement(ButtonRegister);
        CustomListeners.test.log(Status.PASS,"clickOnButtonRegister"+ButtonRegister);
        Reporter.log("clickOnButtonRegister"+ButtonRegister.toString());
        Thread.sleep(1000);
    }
}
