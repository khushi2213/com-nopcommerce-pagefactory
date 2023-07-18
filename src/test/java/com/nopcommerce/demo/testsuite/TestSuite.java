package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Comparator;
import java.util.List;


@Listeners(CustomListeners.class)

public class TestSuite extends BaseTest {
    TopMenuPage topMenuPage;
    ComputersPage computersPage;
    ShoppingCartPage shoppingCartPage;
    BillingPage billingPage;
    RegisterPage registerPage;
    SoftAssert softAssert;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage=new TopMenuPage();
        computersPage=new ComputersPage();
        shoppingCartPage=new ShoppingCartPage();
        billingPage=new BillingPage();
        registerPage = new RegisterPage();
        softAssert = new SoftAssert();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        topMenuPage.mouseHoverOnComputer();
        topMenuPage.selectMenu("Desktops");
        List<String> expectedList=computersPage.getList();
        expectedList.sort(Comparator.reverseOrder());
        computersPage.selectFromDropDown("Name: Z to A");
        Thread.sleep(1000);
        List<String>actualList=computersPage.getList();
        Assert.assertEquals(expectedList,actualList,"Products not displayed Z to A order");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        topMenuPage.mouseHoverOnComputer();
        topMenuPage.selectMenu("Desktops");
        computersPage.selectFromDropDown("Name: A to Z");
        Thread.sleep(1000);
        buildYourOwnComputerPage.addToCart();
        Thread.sleep(1000);
     //   softAssert("Build your own computer",topMenuPage.getHeadingText(),"Not right product");
        buildYourOwnComputerPage.selectProcessor("1");
        buildYourOwnComputerPage.selectRAM("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHddRadio();
        buildYourOwnComputerPage.selectOs();
        buildYourOwnComputerPage.selectCheckBox1();
        buildYourOwnComputerPage.selectCheckBox();
        buildYourOwnComputerPage.selectCheckBox1();
        Thread.sleep(2000);
     //   softAssert(buildYourOwnComputerPage.getPrice(),"$1,475.00","Options not selected correctly");
        buildYourOwnComputerPage.addToCart();
        Thread.sleep(1000);
     //   softAssert(buildYourOwnComputerPage.getSuccessMessage(),"The product has been added to your shopping cart","Product is not added successfully");
        buildYourOwnComputerPage.closeMessage();
        Thread.sleep(500);
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();
        Thread.sleep(500);
      //  softAssert(shoppingCartPage.setShoppingCartText(),"Shopping cart","Shopping cart not displayed successfully");
        shoppingCartPage.changeQuantity("2");
        shoppingCartPage.updateCart();
        Thread.sleep(2000);
     //   softAssert(shoppingCartPage.getPrice(),"$2,950.00","Cart not updated");
        shoppingCartPage.termsAndCondition();
        shoppingCartPage.goCheckout();
        Thread.sleep(1000);
    //    softAssert(topMenuPage.getHeadingText(),"Welcome, Please Sign In!","Checkout navigation not succeed");
        registerPage.clickCheckoutAsGuest();
        billingPage.enterFirstname("Maitri");
        billingPage.enterLastname("Borad");
        billingPage.enterEmail("Boradm@gmail.com");
        billingPage.selectCountry("United Kingdom");
        billingPage.enterCity("London");
        billingPage.enterAddress("23, London road");
        billingPage.enterPostcode("UB123N");
        billingPage.enterPhoneNumber("7896541230");
        billingPage.clickContinue();
        billingPage.selectShipping();
        Thread.sleep(1000);
        billingPage.clickOnContinue();
        billingPage.clickCreditCard();
        Thread.sleep(1000);
        billingPage.clickPaymentContinue();
        billingPage.selectPaymentMethod();
        billingPage.selectCard(1);
        billingPage.enterCardHolderName("Prime Testing");
        billingPage.enterCardNumber("5105105105105100");
        billingPage.selectExpiryMonth(1);
        billingPage.selectExpiryYear(2);
        billingPage.enterCVV("769");
        billingPage.clickOnPaymentContinue();
     //   softAssert(billingPage.getPaymentText(),"Payment Method: Credit Card","Payment method not right");
     //   softAssert(billingPage.getShippingText(),"Shipping Method: Next Day Air","Shipping method not correct");
     //   softAssert(billingPage.getPriceText(),"$2,950.00","Price not correct");
        billingPage.clickConfirm();
        Thread.sleep(1000);
      //  softAssert(billingPage.getHeadText(),"Thank you","Not confirmed");
  //      softAssert(billingPage.getSuccessText(),"Your order has been successfully processed!","Order Not done Successfully");
        billingPage.clickOnContinueButton();
     //   softAssert(topMenuPage.getWelcomeText(),"Welcome to our store","Message not displayed");
        softAssert.assertAll();
    }


}
