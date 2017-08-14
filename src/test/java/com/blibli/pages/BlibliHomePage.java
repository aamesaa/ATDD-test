package com.blibli.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by amesa on 8/14/17.
 */

public class BlibliHomePage extends PageObject {

    @FindBy(id="gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy(id="gdn-login-modal-body")
    private WebElementFacade popupLoginForm;

    @FindBy(id="loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id="loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id="gdn-submit-login")
    private WebElementFacade submitLoginButton;

    @FindBy(id="gdn-already-login-label")
    private WebElementFacade alreadyLoginUser;

    @FindBy(name="s")
    private WebElementFacade inputKeyword;

    @FindBy(id="gdn-search-button")
    private WebElementFacade searchButton;

    @FindBy(xpath="//*[@id=\"catalogProductListContentDiv\"]/div[7]/div/a/div/div/div/div[1]/span/img")
    private WebElementFacade productItem;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade gojekDismissButton;


    @FindBy(id="gdn-add-to-cart-top")
    private WebElementFacade addToCartButton;

    @FindBy(className="bag-block")
    private WebElementFacade shoppingBag;

    @FindBy(id="gdn-cart-button")
    private WebElementFacade cartButton;

    public WebElementFacade getCartButton() {
        return cartButton;
    }

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[1]/div/div[1]/ul/li[3]/a")
    private WebElementFacade checkOutButton;


    @FindBy(id="gdn-next-step")
    private WebElementFacade paymentButton;


    @FindBy(xpath = "//*[@id=\"gdn-payment-list\"]/li[2]/div[1]")
    private WebElementFacade rbInternetBanking;

    @FindBy(id="gdn-payment-option-KlikBCA")
    private WebElementFacade selectPaymentOption;


    @FindBy(name="payment_userid")
    private WebElementFacade userKlikBcaInput;


    @FindBy(id="gdn-submit-checkout")
    private WebElementFacade submitCheckOutButton;

    @FindBy(className = "thanks-container")
    private WebElementFacade thankYouPage;


    public WebElementFacade getThankYouPage() {
        return thankYouPage;
    }

    public WebElementFacade getSelectPaymentOption() {
        return selectPaymentOption;
    }
    public WebElementFacade getCheckOutButton() {
        return checkOutButton;
    }

    public WebElementFacade getPaymentButton() {
        return paymentButton;
    }

    public WebElementFacade getRbInternetBanking() {
        return rbInternetBanking;
    }

    public WebElementFacade getUserKlikBcaInput() {
        return userKlikBcaInput;
    }

    public WebElementFacade getSubmitCheckOutButton() {
        return submitCheckOutButton;
    }

    public WebElementFacade getGojekDismissButton() {
        return gojekDismissButton;
    }

    public WebElementFacade getShoppingBag() {
        return shoppingBag;
    }

    public WebElementFacade getInputKeyword() {
        return inputKeyword;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getProductItem() {
        return productItem;
    }

    public WebElementFacade getAddToCartButton() {
        return addToCartButton;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getPopupLoginForm() {
        return popupLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public WebElementFacade getSubmitLoginButton() {
        return submitLoginButton;
    }

    public WebElementFacade getAlreadyLoginUser() {
        return alreadyLoginUser;
    }
    public Select getDropdownPaymentOption(){
        Select dropdown = new Select(getDriver().findElement(By.id("gdn-payment-option-KlikBCA")));
        return dropdown;
    }
}
