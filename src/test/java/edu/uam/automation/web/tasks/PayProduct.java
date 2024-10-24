package edu.uam.automation.web.tasks;

import edu.uam.automation.web.interactions.RandomUniversallyUniqueIdentifier;
import edu.uam.automation.web.interactions.SelectPaymentMethod;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static edu.uam.automation.web.ui.CheckoutPage.*;
import static edu.uam.automation.web.ui.HomePage.*;

public class PayProduct implements Task  {

    private String paymentMethod;
    private String productName;

    public PayProduct(String paymentMethod, String productName) {
        this.paymentMethod = paymentMethod;
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectPaymentMethod.onTarget(paymentMethod),
                RandomUniversallyUniqueIdentifier.generate(),
                Click.on(PAY_NOW_BUTTON),
                Click.on(BACK_TO_DASHBOARD_BUTTON),
                Click.on(ORDERS_BUTTON),
                Ensure.that(PRODUCT_NAME.of(productName)).isDisplayed()
        );
    }

    public static PayProduct type(String paymentMethod, String productName) {
        return new PayProduct(paymentMethod, productName);
    }
}
