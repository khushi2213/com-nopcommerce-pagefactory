package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class ComputersPage extends Utility {
    @FindBy(id = "products-orderby")
    WebElement dropDownLink;
    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> listLink;
    public void selectFromDropDown(String value){
        selectByVisibleTextFromDropDown(dropDownLink,value);
        CustomListeners.test.log(Status.PASS, "Select from " + dropDownLink);
        Reporter.log("Select from " + dropDownLink.toString());
    }
    public List getList() throws InterruptedException {
        Thread.sleep(2000);
        CustomListeners.test.log(Status.PASS, "Get list " + listLink);
        Reporter.log("Get list " + listLink.toString());
        List<WebElement> list=getListOfElements(listLink);
        List<String> orignalList= new ArrayList<>();
        for(WebElement e:list){
            orignalList.add(e.getText());
        }
        return orignalList;
    }
}
