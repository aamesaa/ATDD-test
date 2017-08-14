package com.blibli.steps;

import com.blibli.Behaviour.BlibliHomePageBehaviour;
import com.blibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Steps
    BlibliHomePageBehaviour blibliHomePageBehaviour;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Given("open home page")
    public void openHomePage(){
        blibliHomePageBehaviour.open();
    }
    @When("I login to blibli")
    public void whenLoginHomePage(){
        blibliHomePageBehaviour.clickUserLogin();
    }
    @Then("I can see my name in the site")
    public void thenSeeMyName(){
        blibliHomePageBehaviour.checkedUserAlreadyLoggedIn();
    }

    @Given("already logged in")
    public void checkLoggedIn(){
        blibliHomePageBehaviour.checkedUserAlreadyLoggedIn();
    }

    @When("I search item")
    public void searchItem(){
        blibliHomePageBehaviour.enterKeyword();
    }

    @When("I add to cart")
    public void chooseItemAndAddToCart(){
        blibliHomePageBehaviour.chooseItem();
    }
    @Then("Item already in cart")
    public void checkItemInChart(){
        blibliHomePageBehaviour.checkedItemAlreadyAdded();
    }

    @Given("Item already in cart")
    public void givenCheckItemInChart(){
        blibliHomePageBehaviour.checkedItemAlreadyAdded();
    }

    @When("I checkout")
    public void whenCheckOut(){
        blibliHomePageBehaviour.checkedOutCart();
    }

    @When("I choose payment options")
    public void whenPaymentOptionChosen(){
        blibliHomePageBehaviour.choosePayment();
    }

    @When("I confirm payment method")
    public void  whenConfirmPayment(){
        blibliHomePageBehaviour.confirmPayment();
    }


    @Then("I can see thankyou page")
    public void thenThankyouPagePopped(){
        blibliHomePageBehaviour.checkedThankyouPage();
    }


}
