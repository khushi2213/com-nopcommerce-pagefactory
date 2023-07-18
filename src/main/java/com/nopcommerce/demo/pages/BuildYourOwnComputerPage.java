package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement RAMLink;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osLink;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement checkboxLink1;
    @FindBy(id = "product_attribute_5_12")
    WebElement checkboxLink;
    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement priceLink;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessageLink;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement shoppingCartLink;
    @FindBy(xpath = "(//button[normalize-space()='Go to cart'])[1]")
    WebElement goToCartLink;

    public void addToCart(){
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on " + addToCartButton);
        Reporter.log("Click on " + addToCartButton.toString());
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + shoppingCartLink);
        Reporter.log("Mouse Hover on " + shoppingCartLink.toString());
    }
    public void selectProcessor(String value){
        selectByValueFromDropDown(processorLink,value);
        CustomListeners.test.log(Status.PASS, "Select " + processorLink);
        Reporter.log("Select " + processorLink.toString());
    }
    public void selectRAM(String value){
        selectByVisibleTextFromDropDown(RAMLink,value);
        CustomListeners.test.log(Status.PASS, "Select " + RAMLink);
        Reporter.log("Select " + RAMLink.toString());
    }
    public void selectHddRadio(){
        clickOnElement(hddRadio);
        CustomListeners.test.log(Status.PASS, "Select " + hddRadio);
        Reporter.log("Select " + hddRadio.toString());
    }
    public void selectOs(){
        clickOnElement(osLink);
        CustomListeners.test.log(Status.PASS, "Select " + osLink);
        Reporter.log("Select " + osLink.toString());
    }
    public void selectCheckBox(){
        clickOnElement(checkboxLink);
        CustomListeners.test.log(Status.PASS, "Select " + checkboxLink);
        Reporter.log("Select " + checkboxLink.toString());
    }
    public void selectCheckBox1(){
        clickOnElement(checkboxLink1);
        CustomListeners.test.log(Status.PASS, "Select " + checkboxLink1);
        Reporter.log("Select " + checkboxLink1.toString());
    }
    public String getPrice(){
        CustomListeners.test.log(Status.PASS, "Get price " + priceLink);
        Reporter.log("Get price " + priceLink.toString());
        return getTextFromElement(priceLink);
    }
    public String getSuccessMessage(){
        CustomListeners.test.log(Status.PASS, "Get message " + successMessageLink);
        Reporter.log("Get message " + successMessageLink.toString());
        return getTextFromElement(successMessageLink);
    }
    public void closeMessage(){
        clickOnElement(closeLink);
        CustomListeners.test.log(Status.PASS, "Click on " + closeLink);
        Reporter.log("Click on " + closeLink.toString());
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCartLink);
        CustomListeners.test.log(Status.PASS, "Click on " + goToCartLink);
        Reporter.log("Click on " + goToCartLink.toString());
    }
}
