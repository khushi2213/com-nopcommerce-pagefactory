package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.UUID;

@Listeners(CustomListeners.class)

public class ElectronicsTest extends BaseTest {

    TopMenuPage topMenuPage;
    ComputersPage computersPage;
    ShoppingCartPage shoppingCartPage;
    BillingPage billingPage;
    RegisterPage registerPage;
    SoftAssert softAssert;
    ElectronicsPage electronicsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage=new TopMenuPage();
        computersPage=new ComputersPage();
        shoppingCartPage=new ShoppingCartPage();
        billingPage=new BillingPage();
        registerPage = new RegisterPage();
        softAssert = new SoftAssert();
        electronicsPage = new ElectronicsPage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        topMenuPage.mouseHoverOnElectronic();
        topMenuPage.selectMenu("Cell phones");
        Thread.sleep(1000);
     //   softAssert(topMenuPage.getHeadingText(),"Cell phones","Navigation is not successful");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        topMenuPage.mouseHoverOnElectronic();
        topMenuPage.selectMenu("Cell phones");
        Thread.sleep(1000);
     //   softAssert(topMenuPage.getHeadingText(),"Cell phones","Navigation is not successful");
        electronicsPage.selectListView();
        Thread.sleep(2000);
        electronicsPage.selectPhone();
    //    softAssert(electronicsPage.getHeading(),"Nokia Lumia 1020","navigation not successful");
     //   softAssert(electronicsPage.getPrice(),"$349.00","Price is not correct");
        electronicsPage.changeQuantity("2");
        Thread.sleep(1000);
        buildYourOwnComputerPage.addToCart();
        Thread.sleep(1000);
    //    softAssert(buildYourOwnComputerPage.getSuccessMessage(),"The product has been added to your shopping cart","Product is not added successfully");
        buildYourOwnComputerPage.closeMessage();
        Thread.sleep(500);
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();
    //    softAssert(topMenuPage.getHeadingText(),"Shopping cart","Shopping cart not displayed successfully");
        Thread.sleep(2000);
     //   softAssert(electronicsPage.getQuantity(),"2","Quantity is not correct");
    //    softAssert(shoppingCartPage.getPrice(),"$698.00","Price is not updated");
        shoppingCartPage.termsAndCondition();
        shoppingCartPage.goCheckout();
        Thread.sleep(1000);
   //     softAssert(topMenuPage.getHeadingText(),"Welcome, Please Sign In!","Checkout navigation not succeed");
        registerPage.clickOnRegister();
  //      softAssert(topMenuPage.getHeadingText(),"Register","Navigation not successful");
        registerPage.enterFirstname("Maitri");
        registerPage.enterLastname("Borad");
        String email= "random-" + UUID.randomUUID().toString() + "@example.com";
        registerPage.enterEmail(email);
        registerPage.enterPassword("Maitri@123");
        registerPage.enterConfirmPassword("Maitri@123");
        registerPage.clickOnRegister();
      //  softAssert(registerPage.getRegisterMessage(),"Your registration completed","Registration is not done");
        registerPage.clickOnContinue();
     //   softAssert(topMenuPage.getHeadingText(),"Shopping cart","Shopping cart not displayed successfully");
        registerPage.clickOnLoginLink();
        loginPage.enterEmailId(email);
        loginPage.enterPassword("Maitri@123");
        loginPage.clickOnLoginButton();
        shoppingCartPage.termsAndCondition();
        shoppingCartPage.goCheckout();
        billingPage.selectCountry("United Kingdom");
        billingPage.enterCity("London");
        billingPage.enterAddress("23, London road");
        billingPage.enterPostcode("UB123N");
        billingPage.enterPhoneNumber("7896541230");
        billingPage.clickContinue();
        billingPage.selectShipping2();
        Thread.sleep(1000);
        billingPage.clickOnContinue();
        billingPage.clickCreditCard();
        Thread.sleep(1000);
        billingPage.clickPaymentContinue();
        billingPage.selectPaymentMethod();
        billingPage.selectCard(0);
        billingPage.enterCardHolderName("Prime Testing");
        billingPage.enterCardNumber("5105105105105100");
        billingPage.selectExpiryMonth(1);
        billingPage.selectExpiryYear(2);
        billingPage.enterCVV("769");
        billingPage.clickOnPaymentContinue();
    //    softAssert(billingPage.getPaymentText(),"Payment Method: Credit Card","Payment method not right");
    //    softAssert(billingPage.getShippingText(),"Shipping Method: 2nd Day Air","Shipping method not correct");
     //   softAssert(billingPage.getPriceText(),"$698.00","Price not correct");
        billingPage.clickConfirm();
        Thread.sleep(1000);
    //    softAssert(billingPage.getHeadText(),"Thank you","Not confirmed");
    //    softAssert(billingPage.getSuccessText(),"Your order has been successfully processed!","Order Not done Successfully");
        billingPage.clickOnContinueButton();
    //    softAssert(topMenuPage.getWelcomeText(),"Welcome to our store","Message not displayed");
        loginPage.clickOnLogout();
     //   softAssert(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","Log out not successful");
    }
}