package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;
    public String getWelcomeText(){
        CustomListeners.test.log(Status.PASS, "Get Welcome Text " + welcomeText);
        Reporter.log("Get welcome text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
        CustomListeners.test.log(Status.PASS, "Enter " + email);
        Reporter.log("Enter " + email + emailField.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS, "Enter " + password);
        Reporter.log("Enter " + password + passwordField.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on " + loginButton);
        Reporter.log("Click on " + loginButton.toString());
    }
    public String getErrorMessage(){
        CustomListeners.test.log(Status.PASS, "Get Message " + errorMessage);
        Reporter.log("Get Message " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public void clickOnLogout(){
        clickOnElement(logOutLink);
        CustomListeners.test.log(Status.PASS, "Click on " + logOutLink);
        Reporter.log("Click on " + logOutLink.toString());
    }
}
