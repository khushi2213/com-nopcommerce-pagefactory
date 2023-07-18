package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Computers")
    public WebElement computerLink;
    @CacheLookup
    @FindBy(linkText = "Electronics")
    public WebElement electronicLink;

    @FindBy(xpath = "//h1")
    WebElement headingText;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a")
    List<WebElement> options;
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeText;
    public void selectMenu(String menu){
        List<WebElement> list=getListOfElements(options);
        for(WebElement e:list){
            if(e.getText().equalsIgnoreCase(menu)){
                e.click();
                break;
            }
        }
        CustomListeners.test.log(Status.PASS, "Select from " + options);
        Reporter.log("Select from " + options.toString());
    }
    public String getHeadingText(){
        CustomListeners.test.log(Status.PASS, "Get text " + headingText);
        Reporter.log("Get text " + headingText.toString());
        return getTextFromElement(headingText);
    }
    public String getWelcomeText(){
        CustomListeners.test.log(Status.PASS, "Get text " + welcomeText);
        Reporter.log("Get text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void mouseHoverOnComputer(){
        mouseHoverToElement(computerLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + computerLink);
        Reporter.log("Mouse Hover " + computerLink.toString());
    }
    public void mouseHoverOnElectronic(){
        mouseHoverToElement(electronicLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + electronicLink);
        Reporter.log("Mouse Hover " + electronicLink.toString());
    }
}
