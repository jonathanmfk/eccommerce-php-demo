package edu.uam.automation.web.tasks;

import edu.uam.automation.web.interactions.ClickJS;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static edu.uam.automation.web.ui.HomePage.*;
import static edu.uam.automation.web.ui.ProductPage.*;
import static edu.uam.automation.web.ui.CartPage.*;

public class SearchProduct implements Task {

    private String productName;

    public SearchProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(productName).into(SEARCH_INPUT),
                Click.on(SEARCH_BUTTON),
                Click.on(ADD_TO_CARD),
                Click.on(ADD_TO_CART_PRODUCT),
                Click.on(ADD_TO_CARD_OPTION_NAV),
                ClickJS.onTarget(PROCEED_TO_CHECKOUT)
        );
    }

    public static SearchProduct by(String productName) {
        return new SearchProduct(productName);
    }
}
