package edu.uam.automation.web.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.UUID;

import static edu.uam.automation.web.ui.CheckoutPage.TRANSACTION_TEXT_AREA;

public class RandomUniversallyUniqueIdentifier implements Interaction {

    private String uuid;

    public RandomUniversallyUniqueIdentifier() {
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(uuid).into(TRANSACTION_TEXT_AREA)
        );
    }

    public static RandomUniversallyUniqueIdentifier generate() {
        return new RandomUniversallyUniqueIdentifier();
    }
}
