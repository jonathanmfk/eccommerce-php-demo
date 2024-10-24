package edu.uam.automation.web.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static edu.uam.automation.web.ui.CheckoutPage.*;

public class SelectPaymentMethod implements Interaction {
    private String option;

    public SelectPaymentMethod(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PAYMENT_METHOD),
                Click.on(PAYMENT_OPTION.of(option))
        );
    }

    public static SelectPaymentMethod onTarget(String option) {
        return new SelectPaymentMethod(option);
    }
}
