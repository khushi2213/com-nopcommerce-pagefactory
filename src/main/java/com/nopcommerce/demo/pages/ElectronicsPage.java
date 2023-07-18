package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@title='List']")
    WebElement listViewLink;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement phoneLink;
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement headText;
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement priceText;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityLink;
    @CacheLookup
    @FindBy(xpath = "(//input[@value])[2]")
    WebElement getQuantity;

    public void selectListView(){
        clickOnElement(listViewLink);
        CustomListeners.test.log(Status.PASS, "Click on " + listViewLink);
        Reporter.log("Click on " + listViewLink.toString());
    }
    public void selectPhone(){
        clickOnElement(phoneLink);
        CustomListeners.test.log(Status.PASS, "Click on " + phoneLink);
        Reporter.log("Click on " + phoneLink.toString());
    }
    public String getHeading(){
        CustomListeners.test.log(Status.PASS, "Get heading " + headText);
        Reporter.log("Get Heading " + headText.toString());
        return getTextFromElement(headText);
    }
    public String getPrice(){
        CustomListeners.test.log(Status.PASS, "Get price " + priceText);
        Reporter.log("Get price " + priceText.toString());
        return getTextFromElement(priceText);
    }
    public void changeQuantity(String quantity){
        quantityLink.sendKeys(Keys.BACK_SPACE);
        sendTextToElement(quantityLink,quantity);
        CustomListeners.test.log(Status.PASS, "Change " + quantity + quantityLink);
        Reporter.log("Change " + quantityLink.toString());
    }
    public String getQuantity(){
        CustomListeners.test.log(Status.PASS, "Get " + getQuantity);
        Reporter.log("Get " + getQuantity.toString());
        return getQuantity.getAttribute("value");
    }
}
