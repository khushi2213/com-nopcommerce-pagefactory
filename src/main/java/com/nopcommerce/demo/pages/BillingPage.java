package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BillingPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberLink;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueLink;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement shippingLink;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement shippingLink2;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardLink;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardLink;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement cardMonthLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement cardYearLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCVVLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement creditCardTextLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[starts-with(text(),'$')]")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1[text()='Thank you']")
    WebElement headText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement nextStep;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentNextStep;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoNextLink;

    public void enterFirstname(String name){
        sendTextToElement(firstNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter Firstname " + firstNameLink);
        Reporter.log("Enter " + name + firstNameLink.toString());
    }
    public void enterLastname(String name){
        sendTextToElement(lastNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter Last name " + lastNameLink);
        Reporter.log("Enter "+ name + lastNameLink.toString());
    }
    public void enterEmail(String email){
        sendTextToElement(emailLink,email);
        CustomListeners.test.log(Status.PASS, "Enter Email " + emailLink);
        Reporter.log("Enter "+ email + emailLink.toString());
    }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(countryLink,country);
        CustomListeners.test.log(Status.PASS, "select from " + countryLink);
        Reporter.log("Select " + country+" from " + countryLink.toString());
    }
    public void enterCity(String city){
        sendTextToElement(cityLink,city);
        CustomListeners.test.log(Status.PASS, "Enter City " + cityLink);
        Reporter.log("Enter " + city  + cityLink.toString());
    }
    public void enterAddress(String address){
        sendTextToElement(addressLink,address);
        CustomListeners.test.log(Status.PASS, "Enter Address " + addressLink);
        Reporter.log("Enter " + address + addressLink.toString());
    }
    public void enterPostcode(String postcode){
        sendTextToElement(postCodeLink,postcode);
        CustomListeners.test.log(Status.PASS, "Enter " + postcode + postCodeLink);
        Reporter.log("Enter " + postcode + postCodeLink.toString());
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(phoneNumberLink,number);
        CustomListeners.test.log(Status.PASS, "Enter " + number + phoneNumberLink);
        Reporter.log("Enter " + number + phoneNumberLink.toString());
    }
    public void clickContinue(){
        clickOnElement(continueLink);
        CustomListeners.test.log(Status.PASS, "Click on " + continueLink);
        Reporter.log("Click on " + continueLink.toString());
    }
    public void selectShipping(){
        clickOnElement(shippingLink);
        CustomListeners.test.log(Status.PASS, "Click on " + shippingLink);
        Reporter.log("Click on " + shippingLink.toString());
    }
    public void clickCreditCard(){
        clickOnElement(creditCardLink);
        CustomListeners.test.log(Status.PASS, "Click on " + creditCardLink);
        Reporter.log("Click on " + creditCardLink.toString());
    }
    public void selectPaymentMethod(){
        clickOnElement(paymentMethodLink);
        CustomListeners.test.log(Status.PASS, "Click on " + paymentMethodLink);
        Reporter.log("Click on " + paymentMethodLink.toString());
    }
    public void selectCard(int index){
        selectByIndexFromDropDown(cardLink,index);
        CustomListeners.test.log(Status.PASS, "Select from " + cardLink);
        Reporter.log("select from " + cardLink.toString());
    }
    public void enterCardHolderName(String name){
        sendTextToElement(cardHolderNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter " + name + cardHolderNameLink);
        Reporter.log("Enter " + name + cardHolderNameLink.toString());
    }
    public void enterCardNumber(String number){
        sendTextToElement(cardNumberLink,number);
        CustomListeners.test.log(Status.PASS, "Enter " + number + cardNumberLink);
        Reporter.log("Enter " + number + cardNumberLink.toString());
    }
    public void selectExpiryMonth(int month){
        selectByIndexFromDropDown(cardMonthLink,month);
        CustomListeners.test.log(Status.PASS, "Select " + month + cardMonthLink);
        Reporter.log("Select " + month + cardMonthLink.toString());
    }
    public void selectExpiryYear(int year){
        selectByIndexFromDropDown(cardYearLink,year);
        CustomListeners.test.log(Status.PASS, "Enter " + year + cardYearLink);
        Reporter.log("Enter " + year + cardYearLink.toString());
    }
    public void enterCVV(String cvv){
        sendTextToElement(cardCVVLink,cvv);
        CustomListeners.test.log(Status.PASS, "Enter " + cvv + cardCVVLink);
        Reporter.log("Enter " + cvv + cardCVVLink.toString());
    }
    public String getPaymentText(){
        CustomListeners.test.log(Status.PASS, "Get text " + creditCardTextLink);
        Reporter.log("Get text " + creditCardTextLink.toString());
        return getTextFromElement(creditCardTextLink);
    }
    public String getShippingText(){
        CustomListeners.test.log(Status.PASS, "Get text " + shippingMethodText);
        Reporter.log("Get text " + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }
    public String getPriceText(){
        CustomListeners.test.log(Status.PASS, "Get text " + totalText);
        Reporter.log("Get text " + totalText.toString());
        return getTextFromElement(totalText);
    }
    public void clickConfirm(){
        clickOnElement(confirmButton);
        CustomListeners.test.log(Status.PASS, "Click on " + confirmButton);
        Reporter.log("Click on " + confirmButton.toString());
    }
    public String getHeadText(){
        CustomListeners.test.log(Status.PASS, "Get text " + headText);
        Reporter.log("Get text " + headText.toString());
        return getTextFromElement(headText);
    }
    public String getSuccessText(){
        CustomListeners.test.log(Status.PASS, "Get text " + successText);
        Reporter.log("Get text " + successText.toString());
        return getTextFromElement(successText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on " + continueButton);
        Reporter.log("Click on " + continueButton.toString());
    }
    public void clickOnContinue(){
        clickOnElement(nextStep);
        CustomListeners.test.log(Status.PASS, "Click on " + nextStep);
        Reporter.log("Click on " + nextStep.toString());
    }
    public void clickPaymentContinue(){
        clickOnElement(paymentNextStep);
        CustomListeners.test.log(Status.PASS, "Click on " + paymentNextStep);
        Reporter.log("Click on " + paymentNextStep.toString());
    }
    public void clickOnPaymentContinue(){
        clickOnElement(paymentInfoNextLink);
        CustomListeners.test.log(Status.PASS, "Click on " + paymentInfoNextLink);
        Reporter.log("Click on " + paymentInfoNextLink.toString());
    }
    public void selectShipping2(){
        clickOnElement(shippingLink2);
        CustomListeners.test.log(Status.PASS, "Click on " + shippingLink2);
        Reporter.log("Click on " + shippingLink2.toString());
    }
}
