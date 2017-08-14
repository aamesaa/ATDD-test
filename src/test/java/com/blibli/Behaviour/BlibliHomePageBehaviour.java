package com.blibli.Behaviour;

import com.blibli.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by amesa on 8/14/17.
 */
public class BlibliHomePageBehaviour  extends ScenarioSteps{

    BlibliHomePage blibliHomePage;

    @Step
    public void open(){
        getDriver().get("https://www.blibli.com/");
    }

    @Step
    public void clickUserLogin() {
        blibliHomePage.getLoginButton().click();
        blibliHomePage.getInputLoginEmail().type("aamesaa@gmail.com");
        blibliHomePage.getInputLoginPassword().type("Amesa@123");
        blibliHomePage.getSubmitLoginButton().click();
    }

    @Step
    public void checkedUserAlreadyLoggedIn() {
        blibliHomePage.getAlreadyLoginUser().isCurrentlyVisible();
    }

    @Step
    public void enterKeyword() {
        blibliHomePage.getInputKeyword().type("JBL Clip");
        blibliHomePage.getSearchButton().click();
        if(blibliHomePage.getGojekDismissButton().isCurrentlyVisible()){
            blibliHomePage.getGojekDismissButton().click();
        }
    }

    @Step
    public void chooseItem() {
        blibliHomePage.getProductItem().click();
        blibliHomePage.getAddToCartButton().click();
    }

    @Step
    public void checkedItemAlreadyAdded() {
        blibliHomePage.getShoppingBag().isCurrentlyVisible();
    }

    @Step
    public void checkedOutCart() {
        blibliHomePage.getCartButton().click();
        blibliHomePage.getCheckOutButton().click();
        blibliHomePage.getPaymentButton().click();

    }

    @Step
    public void choosePayment() {
        waitABit(400);
        blibliHomePage.getRbInternetBanking().click();
        Select select = blibliHomePage.getDropdownPaymentOption();
        select.selectByValue("KlikBCA");
        blibliHomePage.getUserKlikBcaInput().type("122121a");
        waitABit(800);
    }

    @Step
    public void confirmPayment() {
        blibliHomePage.getSubmitCheckOutButton().click();
    }
    @Step
    public void checkedThankyouPage() {
        blibliHomePage.getThankYouPage().isCurrentlyVisible();
    }


}
