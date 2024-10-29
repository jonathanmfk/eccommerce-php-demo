package edu.uam.automation.web.stepdefinations;

import edu.uam.automation.web.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class BuyProductStep {

    @Given("{actor} is going to buy a product")
    public void actorIsGoingToBuyAProduct(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} selects the product")
    public void actorSelectsTheProduct(Actor actor) {
        String productName = "Amazfit GTS 3 Smart Watch for Android iPhone";

        actor.attemptsTo(
                Login.with("liliana.rojasg@autonoma.edu.co","01234567"),
                SearchProduct.by(productName),
                PayProduct.type("Bank Deposit", productName)

        );
    }

    @Then("{actor} should see the purchase was successful")
    public void actorShouldSeeThePurchaseWasSuccessful(Actor actor) throws InterruptedException {
        Thread.sleep(5000);
        actor.should(

        );
    }
}
