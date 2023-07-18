package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityLink;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement priceLink;

    @FindBy(id = "termsofservice")
    WebElement termsAndConditionLink;

    @FindBy(id = "checkout")
    WebElement checkoutLink;
    public String setShoppingCartText(){
        CustomListeners.test.log(Status.PASS, "Get text " + shoppingCartText);
        Reporter.log("Get text " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public void changeQuantity(String quantity){
        quantityLink.sendKeys(Keys.BACK_SPACE);
        sendTextToElement(quantityLink,quantity);
        CustomListeners.test.log(Status.PASS, "Change quantity " + quantityLink);
        Reporter.log("Change quantity " + quantityLink.toString());
    }
    public void updateCart(){
        clickOnElement(updateCartLink);
        CustomListeners.test.log(Status.PASS, "Click on " + updateCartLink);
        Reporter.log("click on " + updateCartLink.toString());
    }
    public String getPrice(){
        CustomListeners.test.log(Status.PASS, "Get Price " + priceLink);
        Reporter.log("GGet price " + priceLink.toString());
        return getTextFromElement(priceLink);
    }
    public void termsAndCondition(){
        clickOnElement(termsAndConditionLink);
        CustomListeners.test.log(Status.PASS, "Click on " + termsAndConditionLink);
        Reporter.log("Click on " + termsAndConditionLink.toString());
    }
    public void goCheckout(){
        clickOnElement(checkoutLink);
        CustomListeners.test.log(Status.PASS, "Click on " + checkoutLink);
        Reporter.log("click on " + checkoutLink.toString());
    }

}
