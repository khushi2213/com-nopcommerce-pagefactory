package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender' and @value='F']")
    WebElement femaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;

    @FindBy(xpath = "//input[contains(@id,'E')]")
    WebElement emailLink;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordLink;

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPasswordLink;
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutGuestLink;
    @CacheLookup
    @FindBy(xpath = "//a[starts-with(text(),'Reg')]")
    WebElement registerLink;

    public void selectGender(){
        clickOnElement(femaleRadio);
        CustomListeners.test.log(Status.PASS, "click on " + femaleRadio);
        Reporter.log("Click on " + femaleRadio.toString());
    }
    public void enterFirstname(String name){
        sendTextToElement(firstNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter " + name + " to " + firstNameLink);
        Reporter.log("Enter " + name + firstNameLink.toString());
    }
    public void enterLastname(String name){
        sendTextToElement(lastNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter " + name + " to " + lastNameLink);
        Reporter.log("Enter " + name + lastNameLink.toString());
    }
    public void enterEmail(String email){
        sendTextToElement(emailLink,email);
        CustomListeners.test.log(Status.PASS, "Enter " + email + " to " + emailLink);
        Reporter.log("Enter " + email + emailLink.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordLink,password);
        CustomListeners.test.log(Status.PASS, "Enter " + password + " to " + passwordLink);
        Reporter.log("Enter " + password + passwordLink.toString());
    }
    public void enterConfirmPassword(String password){
        sendTextToElement(confirmPasswordLink,password);
        CustomListeners.test.log(Status.PASS, "Enter " + password + " to " + confirmPasswordLink);
        Reporter.log("Enter " + password + confirmPasswordLink.toString());
    }
    public void clickOnRegister(){
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on " + registerButton);
        Reporter.log("Click on " + registerButton.toString());
    }
    public String getRegisterMessage(){
        CustomListeners.test.log(Status.PASS, "Get Message " + registerMessage);
        Reporter.log("Get message " + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueLink);
        CustomListeners.test.log(Status.PASS, "Click on " + continueLink);
        Reporter.log("Click on " + continueLink.toString());
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on " + loginLink);
        Reporter.log("Click on " + loginLink.toString());
    }
    public void clickCheckoutAsGuest(){
        clickOnElement(checkoutGuestLink);
        CustomListeners.test.log(Status.PASS, "Click on " + checkoutGuestLink);
        Reporter.log("Click on " + checkoutGuestLink.toString());
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on " + registerLink);
        Reporter.log("Click on " + registerLink.toString());
    }

}
